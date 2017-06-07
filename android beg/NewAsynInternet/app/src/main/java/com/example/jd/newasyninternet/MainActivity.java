package com.example.jd.newasyninternet;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ConnnectToIntent c1;
    static TextView t1;
    static ImageView myimage;
    ConnectivityManager mycon;
    NetworkInfo myinfo;
    DownloadImage  down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textweb);
        myimage=(ImageView)findViewById(R.id.imageView);
        mycon=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        myinfo=mycon.getActiveNetworkInfo();


    }

    public void dosomething(View view) {
        c1=new ConnnectToIntent(this);
        c1.execute("http://www.google.co.in");
    }

    public void download(View view) {
        if (myinfo!=null && myinfo.isConnected()){
            down=new DownloadImage();
            down.execute("https://wallpaperbrowse.com/media/images/cool-pics-13.jpg");

        }
        else {
            Toast.makeText(this,"Internet Not Connected",Toast.LENGTH_LONG).show();
        }
    }
}
