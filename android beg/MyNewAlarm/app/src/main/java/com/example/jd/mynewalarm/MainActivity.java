package com.example.jd.mynewalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlarmManager alarmManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarmManager =(AlarmManager)getSystemService(ALARM_SERVICE);
    }


    public void stopdoing(View view) {
        Toast.makeText(this,"Alarm stop",Toast.LENGTH_SHORT).show();
        Intent i=new Intent();
        i.setAction("com.jigish.myown.recevier.Message");
        i.addCategory("android.intent.category.DEFAULT");
        PendingIntent pd= PendingIntent.getBroadcast(this,0,i,0);
        alarmManager.cancel(pd);
    }

    public void startdo(View view) {
        Toast.makeText(this,"Alarm start",Toast.LENGTH_SHORT).show();
        Intent i=new Intent();
        i.setAction("com.jigish.myown.recevier.Message");
        i.addCategory("android.intent.category.DEFAULT");
        PendingIntent pd= PendingIntent.getBroadcast(this,0,i,0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),1000*30,pd);

    }
}
