package com.example.co2_q1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
    }

    public  void onPause(){
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        SharedPreferences.Editor myedit = sharedPreferences.edit();
        myedit.putString("name", name.getText().toString());
        myedit.putString("age", age.getText().toString());
        myedit.apply();

    }

    public void onResume(){
        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPref",MODE_PRIVATE);
        name.setText(sh.getString("name",""));
        age.setText(sh.getString("age",""));
    }



}