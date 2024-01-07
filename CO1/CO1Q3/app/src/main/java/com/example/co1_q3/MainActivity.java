package com.example.co1_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2, r;
    Button b1,b2,b3,b4;
    Integer num1,num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.number1);
        n2 = (EditText) findViewById(R.id.number2);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        r = (EditText) findViewById(R.id.result);
    }


    public void add(View v)
    {
        num1 = Integer.parseInt(String.valueOf(n1.getText()));
        num2 = Integer.parseInt(String.valueOf(n2.getText()));
        res = num1 + num2;
        r.setText(Integer.toString(res));
    }

    public void sub(View v)
    {
        num1 = Integer.parseInt(String.valueOf(n1.getText()));
        num2 = Integer.parseInt(String.valueOf(n2.getText()));
        res = num1 - num2;
        r.setText(Integer.toString(res));
    }

    public void mul(View v)
    {
        num1 = Integer.parseInt(String.valueOf(n1));
        num2 = Integer.parseInt(String.valueOf(n2));
        res = num1*num2;
        r.setText(Integer.toString(res));
    }

    public void div(View v)
    {
        num1 = Integer.parseInt(String.valueOf(n1.getText()));
        num2 = Integer.parseInt(String.valueOf(n2.getText()));
        res = num1/num2;
        r.setText(Integer.toString(res));
    }
}