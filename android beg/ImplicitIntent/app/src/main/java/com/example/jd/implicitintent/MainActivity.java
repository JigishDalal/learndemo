package com.example.jd.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosmothing(View view) {
        switch (view.getId()){
            case R.id.web:
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in"));
                startActivity(i);
                break;
            case R.id.call:
                Intent i2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9409592045"));
                startActivity(i2);
                break;
            case R.id.map:

                Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:20.5937,78.9629"));
                startActivity(i3);
                break;
        }
    }
}
