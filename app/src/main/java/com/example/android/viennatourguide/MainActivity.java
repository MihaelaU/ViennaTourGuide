package com.example.android.viennatourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get ViewPager and set PagerAdapter to display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        FragmentPagerAdapter fragmentPagerAdapter =
                new PagerAdapter(getSupportFragmentManager(),
                        this);
        viewPager.setAdapter(fragmentPagerAdapter);

        // give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
