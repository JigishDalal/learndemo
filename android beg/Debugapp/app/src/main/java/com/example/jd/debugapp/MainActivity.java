package com.example.jd.debugapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView2);
    }

    public void add(View view) {
        Log.i("MainActivity","executed 1");
        int a=Integer.parseInt(e1.getText().toString());
        Log.i("MainActivity","executed 2");
        int b=Integer.parseInt(e2.getText().toString());
        Log.i("MainActivity","executed 3");
        int result=a+b;
        Log.i("MainActivity","executed 4");
        t1.setText(""+result);
        Log.i("MainActivity","executed 5");

    }
}
