package com.example.jd.recycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView re;
    String s1[],s2[];
    int images[]={R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp
            ,R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp,R.drawable.ic_android_black_24dp};
    Myownrecycle ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re=(RecyclerView)findViewById(R.id.recycleView);
        s1=getResources().getStringArray(R.array.pet_name);
        s2=getResources().getStringArray(R.array.pet_des);
        ad=new Myownrecycle(this,s1,s2,images);
        re.setAdapter(ad);
        re.setLayoutManager(new LinearLayoutManager(this));

    }
}
