package com.example.jd.servicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startdo(View view) {
    Intent i=new Intent(this,MyService.class);
        startService(i);

    }

    public void stopdoing(View view) {
        Intent i=new Intent(this,MyService.class);
        stopService(i);
    }
}
