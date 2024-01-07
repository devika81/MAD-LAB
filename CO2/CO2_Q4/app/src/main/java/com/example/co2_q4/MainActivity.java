package com.example.co2_q4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);

        img1.setOnClickListener(this::onClick);
        img2.setOnClickListener(this::onClick);
    }

    public  void onClick(View view)
    {
        if(view.getId()==R.id.img1)
        {
            img1.setVisibility(view.GONE);
            img2.setVisibility(view.VISIBLE);
        }

        else
        {
            img1.setVisibility(view.VISIBLE);
            img2.setVisibility(view.GONE);
        }

    }
}