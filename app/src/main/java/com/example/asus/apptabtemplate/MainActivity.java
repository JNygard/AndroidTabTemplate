package com.example.asus.apptabtemplate;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.asus.apptabtemplate.Adapter.ViewPagerAdapter;
import com.example.asus.apptabtemplate.Fragment.Fragment1;
import com.example.asus.apptabtemplate.Fragment.Fragment2;
import com.example.asus.apptabtemplate.Fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    //Toolbar toolbarDraw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpNavigation();

    }

    public void setUpNavigation(){
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

        //toolbarDraw = (Toolbar) findViewById(R.id.toolbardrawer);
        //setSupportActionBar(toolbarDraw);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id = item.getItemId();
        if(res_id==R.id.menu_settings) {
            //Intent intent = new Intent(this, Settings.class);
            //startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
