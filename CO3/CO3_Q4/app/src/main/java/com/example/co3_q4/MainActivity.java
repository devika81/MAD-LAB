package com.example.co3_q4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

             if(item.getItemId()==R.id.item1){
                 Toast.makeText(this, "call selected", Toast.LENGTH_SHORT).show();
             }


              else if(item.getItemId()==R.id.item2){
            Toast.makeText(this, "send selected", Toast.LENGTH_SHORT).show();
              }


        else if(item.getItemId()==R.id.item3){
            Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show();
        }


        else if(item.getItemId()==R.id.item4){
            Toast.makeText(this, "item 4 selected", Toast.LENGTH_SHORT).show();
        }



            else if(item.getItemId()==R.id.subitem1)
            {
                Toast.makeText(this, "subitem 1 selected", Toast.LENGTH_SHORT).show();
            }


            else if(item.getItemId()==R.id.subitem2)
        {
            Toast.makeText(this, "subitem 2 selected", Toast.LENGTH_SHORT).show();
        }


            return  true;


    }
}