package com.example.co1_q4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, phone, dob, email;
    RadioButton rb1, rb2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        dob = (EditText) findViewById(R.id.dob);
        email = (EditText) findViewById(R.id.email);
        rb1 = (RadioButton) findViewById(R.id.radiobtn1);
        rb2 = (RadioButton) findViewById(R.id.radiobtn2);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //name validation
                if (name.getText().toString().isEmpty())  {
                    Toast.makeText(MainActivity.this, "name cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else if(name.getText().toString().matches(".*[!@#\\$%^&*()1234567890_+\\-=].*")){
                    Toast.makeText(MainActivity.this, "enter correct name", Toast.LENGTH_SHORT).show();
                }

                
                //phone no. validation
                if(phone.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "phone no. cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else if(phone.length()>10 || phone.length()<10){
                    Toast.makeText(MainActivity.this, "enter 10 digits", Toast.LENGTH_SHORT).show();
                }

                
                //dob validation
                if(dob.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "dob cannot be empty", Toast.LENGTH_SHORT).show();
                }

                
                //email validation
                if(email.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "email cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (!email.getText().toString().matches("[a-zA-Z0-9._-]+@+[a-zA-Z]+\\.+[a-zA-Z]+")) {
                    Toast.makeText(MainActivity.this, "enter correct email", Toast.LENGTH_SHORT).show();
                }


                //radio button validation
                if(!rb1.isChecked() || !rb2.isChecked()){
                    Toast.makeText(MainActivity.this, "select a radio button", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }


}