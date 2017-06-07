package com.example.jd.broadcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MyReceiver myRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callinbuilt(View view) {

    }

    public void callcustom(View view) {
        Intent il=new Intent();
        il.setAction("com.example.jd.broadcastapp");
        il.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(il);
    }
}
