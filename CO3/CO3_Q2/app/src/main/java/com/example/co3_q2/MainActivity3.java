package com.example.co3_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv= (TextView)findViewById(R.id.tv);

        Intent intent = getIntent();
        String us = intent.getStringExtra("U");
        tv.setText("Welcome" + us);

        //Intent intent1 = new Intent(Intent.ANDROID_VIEW, Uri.parse(url))

    }
}