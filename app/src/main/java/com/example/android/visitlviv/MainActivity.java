package com.example.android.visitlviv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(myPagerAdapter);

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.top_attractions_tl_image);
        tabLayout.getTabAt(1).setIcon(R.drawable.tourist_info_tl_image);
        tabLayout.getTabAt(2).setIcon(R.drawable.communication_tl_image);
        tabLayout.getTabAt(3).setIcon(R.drawable.lviv_attractions_tl_image);
        tabLayout.getTabAt(4).setIcon(R.drawable.art_museums_tl_image);
        tabLayout.getTabAt(5).setIcon(R.drawable.theatre_cinema_tl_image);
        tabLayout.getTabAt(6).setIcon(R.drawable.food_drink_tl_image);
        tabLayout.getTabAt(7).setIcon(R.drawable.sleep_tl_image);
        tabLayout.getTabAt(8).setIcon(R.drawable.shoping_markets_tl_image);
        tabLayout.getTabAt(9).setIcon(R.drawable.park_tl_image);
        tabLayout.getTabAt(10).setIcon(R.drawable.nightlife_tl_image);
        tabLayout.getTabAt(11).setIcon(R.drawable.kids_tl_image);
        tabLayout.getTabAt(12).setIcon(R.drawable.outside_lviv_tl_image);
    }
}
