package com.example.jd.newasyninternet;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by JD on 31-05-2017.
 */

public class ConnnectToIntent extends AsyncTask<String,Void,String> {
    Context ctx;
    public ConnnectToIntent(Context ct){
        ctx=ct;
    }

    @Override
    protected String doInBackground(String... strings) {
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
            BufferedReader mybuf=new BufferedReader(new InputStreamReader(in));
            StringBuffer st=new StringBuffer();
            String line="";
            while ((line=mybuf.readLine())!=null)
            {
                st.append(line+" \n");
            }
            mybuf.close();
            in.close();
            return  st.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
//        super.onPostExecute(s);
    MainActivity.t1.setText(s);
    }
}
