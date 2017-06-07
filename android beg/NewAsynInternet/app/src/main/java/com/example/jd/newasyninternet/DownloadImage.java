package com.example.jd.newasyninternet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by JD on 31-05-2017.
 */

public class DownloadImage extends AsyncTask<String,Void,Bitmap> {
    @Override
    protected Bitmap doInBackground(String... strings) {
        String s1=strings [0];
        InputStream in;
        try {
            URL myurl=new URL(s1);
            HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(20000);
            conn.setRequestMethod("GET");
            conn.connect();
            in= conn.getInputStream();
            Bitmap mymap= BitmapFactory.decodeStream(in);
            return mymap;



        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        MainActivity.myimage.setImageBitmap(bitmap);
    }
}
