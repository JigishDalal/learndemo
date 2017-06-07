package com.example.jd.acitivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"on create finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"on Start finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"on Resume finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"on Pause finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"on Restart finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"on Destroy finished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onDestroy");
    }
}

