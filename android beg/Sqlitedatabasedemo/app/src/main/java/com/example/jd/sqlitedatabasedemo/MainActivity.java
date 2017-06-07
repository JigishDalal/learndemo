package com.example.jd.sqlitedatabasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Name,cllg;
    TextView t1;
    MycoreDatabase mycore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.editText);
        cllg=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.Result);
        mycore=new MycoreDatabase(this);

    }

    public void savedata(View view) {
        mycore.insertData(Name.getText().toString(),cllg.getText().toString());


    }

    public void loaddata(View view) {
        mycore.getall();
    }
}
