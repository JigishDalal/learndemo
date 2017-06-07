package com.example.jd.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Customreceiver extends BroadcastReceiver {
    public Customreceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"first custom receiver",Toast.LENGTH_LONG).show();
    }
}
