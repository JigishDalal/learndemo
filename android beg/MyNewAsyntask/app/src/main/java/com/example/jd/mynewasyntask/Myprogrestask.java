package com.example.jd.mynewasyntask;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JD on 31-05-2017.
 */

public class Myprogrestask extends AsyncTask<Void,Integer,String>{
    Context ct;
    ProgressDialog pr;

    public Myprogrestask(Context c){
        ct=c;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pr=new ProgressDialog(ct);
        pr.setTitle("Downloading...");
        pr.setMessage("Please wait ....");
        pr.setMax(10);
        pr.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pr.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                cancel(true);
            }
        });
        pr.show();
    }

    @Override
    protected String doInBackground(Void... voids) {
    try {
        for (int i = 1; i < 10; i++) {
            Thread.sleep(1000);
            Log.i("Thread","Execute");
            publishProgress(i);
        }
        return  "Successfully";
    }
    catch (Exception e)
    {
        Log.i("Exception",e.getMessage());
    return "Failuer";
    }

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        int  myvalue= values[0];
        pr.setProgress(myvalue);

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Toast.makeText(ct,s,Toast.LENGTH_SHORT).show();
        pr.dismiss();

    }
}
