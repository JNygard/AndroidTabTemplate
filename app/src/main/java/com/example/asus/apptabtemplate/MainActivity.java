package com.example.asus.apptabtemplate;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.asus.apptabtemplate.Adapter.ViewPagerAdapter;
import com.example.asus.apptabtemplate.Fragment.Fragment1;
import com.example.asus.apptabtemplate.Fragment.Fragment2;
import com.example.asus.apptabtemplate.Fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new Fragment1(), "Fragment1");
        viewPagerAdapter.addFragments(new Fragment2(), "Fragment2");
        viewPagerAdapter.addFragments(new Fragment3(), "Fragment3");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);



    }
}
