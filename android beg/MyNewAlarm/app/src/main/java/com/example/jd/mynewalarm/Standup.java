package com.example.jd.mynewalarm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

public class Standup extends BroadcastReceiver {
    public Standup() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Toast.makeText(context,"inside Recevier",Toast.LENGTH_SHORT).show();
        NotificationManagerCompat myManager=NotificationManagerCompat.from(context);
        NotificationCompat.Builder mynoti=new NotificationCompat.Builder(context);
        mynoti.setContentTitle("Stand up Notification");
        mynoti.setContentText("you need to stand up");
        mynoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);
        Intent il=new Intent(context,Standupicon.class);
        PendingIntent pd=PendingIntent.getActivity(context,0,il,0);
        mynoti.setContentIntent(pd);
        mynoti.setAutoCancel(true);
        myManager.notify(1,mynoti.build());


    }
}
