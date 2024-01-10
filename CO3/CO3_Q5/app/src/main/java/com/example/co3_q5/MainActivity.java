package com.example.co3_q5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

     ListView listview;
     String fruits[] = {"apple", "orange", "grapes", "mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listview);
        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_view,R.id.textview,fruits);
        listview.setAdapter(arrayAdapter);
    }
}