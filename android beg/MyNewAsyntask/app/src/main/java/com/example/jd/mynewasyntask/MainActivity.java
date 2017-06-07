package com.example.jd.mynewasyntask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Myprogrestask p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dosomthing(View view) {
        p1= new Myprogrestask(this);
        p1.execute();
    }
}
