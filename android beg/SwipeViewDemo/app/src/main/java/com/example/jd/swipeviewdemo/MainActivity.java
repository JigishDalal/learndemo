package com.example.jd.swipeviewdemo;

import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TabLayout tablayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tablayout=(TabLayout)findViewById(R.id.mytab);
        viewPager=(ViewPager)findViewById(R.id.view2);
        viewPager.setAdapter(new Myownpager(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewPager);
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    class Myownpager extends FragmentPagerAdapter{
        String data[]={"java","android","ios"};


        public Myownpager(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position==0){
                return new firstjava();

            }
            if(position==1){
                return new Android();

            }
            if (position==2){
                return  new Ios();
            }
            return null;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
//            return super.getPageTitle(position);
        return data[position];
        }
    }
}
