package com.example.co1_q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "Lifecycle";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate");
        Log.d(TAG,"onCreate");
    }

    protected  void onStart()
    {
        super.onStart();
        showToast("onStart");
        Log.d(TAG,"onStart");

    }


    protected void onPause()
    {
        super.onPause();
        showToast("onPause");
        Log.d(TAG,"onPause");
    }

    protected  void onStop()
    {
        super.onStop();
        showToast("onStop");
        Log.d(TAG,"onPause");
    }

    protected  void onResume()
    {
        super.onResume();
        showToast("onResume");
        Log.d(TAG,"onResume");
    }

    protected void onDestroy()
    {
        super.onDestroy();
        showToast("onDestroy");
        Log.d(TAG,"onDsetroy");
    }

    protected void onRestart()
    {
        super.onRestart();
        showToast("onRestart");
        Log.d(TAG,"onRestart");
    }


    protected void showToast(String msg)
    {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}