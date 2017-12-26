package com.example.mthiaw.alc;

import android.app.ActionBar;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Adding the Africa Tech Venture logo to the left of the action bar with the tittle
        getSupportActionBar().setTitle("Africa Tech Venture");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ATVFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this));


        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //This line will eliminate the line between the Action bar and above the tabs
        getSupportActionBar().setElevation(0);



    }
}






//Extras

// Create an adapter that knows which fragment should be shown on each page
// ATVFragmentPagerAdapter adapter = new ATVFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);

// Set the adapter onto the view pager
// viewPager.setAdapter(adapter);


//Adding the Africa Tech Venture logo to the left of the action bar
// getSupportActionBar().setDisplayShowHomeEnabled(true);

//getSupportActionBar().setIcon(R.drawable.atv_action_bar_logo);

//getSupportActionBar().setDisplayShowHomeEnabled(true);
//getSupportActionBar().setIcon(R.drawable.app_logo_four);
//Adding the Africa Tech Venture logo to the left of the action bar with the tittle
// getSupportActionBar().setTitle("Africa Tech Venture");

//This line will add the Up back button
//  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//getSupportActionBar().setHomeAsUpIndicator(R.drawable.app_logo_five);
//getSupportActionBar().setLogo(R.drawable.app_logo_five);
//  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//getSupportActionBar().setDisplayUseLogoEnabled(true);
