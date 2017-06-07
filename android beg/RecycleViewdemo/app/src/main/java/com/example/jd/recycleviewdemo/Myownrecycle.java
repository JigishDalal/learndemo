package com.example.jd.recycleviewdemo;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by JD on 02-06-2017.
 */

public class Myownrecycle extends RecyclerView.Adapter<Myownrecycle.MyownHolder> {

    String data[],data2[];
    int img[];
    Context ctx;
     public  Myownrecycle(Context ct,String s1[],String s2[],int il[] ){
         ctx=ct;
         data=s1;
         data2=s2;
         img=il;

     }
    @Override
    public Myownrecycle.MyownHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myLayoutInflater=LayoutInflater.from(ctx);
        View myview =myLayoutInflater.inflate(R.layout.my_row,parent,false);
        return new MyownHolder(myview);
    }

    @Override
    public void onBindViewHolder(Myownrecycle.MyownHolder holder, int position) {
    holder.t1.setText(data[position]);
        holder.t2.setText(data2[position]);
        holder.img.setImageResource(img[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }



    public class MyownHolder extends RecyclerView.ViewHolder {
        TextView t1,t2;
        ImageView img;
        public MyownHolder(View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.text1);
            t2=(TextView)itemView.findViewById(R.id.text2);
            img=(ImageView)itemView.findViewById(R.id.MyImage);

        }

    }

}
