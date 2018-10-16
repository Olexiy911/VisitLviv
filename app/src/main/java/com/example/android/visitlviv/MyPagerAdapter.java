package com.example.android.visitlviv;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 13;
    private Context context;

    public MyPagerAdapter (Context context, FragmentManager fm){
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TopAttractionsFragment();
            case 1:
                return new TouristInformationFragment();
            case 2:
                return new CommunicationFragment();
            case 3:
                return new LvivAttractionFragment();
            case 4:
                return new ArtMuseumsFragment();
            case 5:
                return new TheatreCinemaFragment();
            case 6:
                return new FoodDrinkFragment();
            case 7:
                return new SleepFragment();
            case 8:
                return new ShopingMarketsFragment();
            case 9:
                return new ParkFragment();
            case 10:
                return new NightlifeFragment();
            case 11:
                return new KidsFragment();
            case 12:
                return new OutsideLvivFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.top_attractions);
            case 1:
                return context.getResources().getString(R.string.tourist_info);
            case 2:
                return context.getResources().getString(R.string.communication);
            case 3:
                return context.getResources().getString(R.string.lviv_attractions);
            case 4:
                return context.getResources().getString(R.string.art_museums);
            case 5:
                return context.getResources().getString(R.string.theatre_cinema);
            case 6:
                return context.getResources().getString(R.string.food_drink);
            case 7:
                return context.getResources().getString(R.string.sleep);
            case 8:
                return context.getResources().getString(R.string.shoping_markets);
            case 9:
                return context.getResources().getString(R.string.park);
            case 10:
                return context.getResources().getString(R.string.nightlife);
            case 11:
                return context.getResources().getString(R.string.kids);
            case 12:
                return context.getResources().getString(R.string.outside_lviv);
            default:
                return null;
        }
    }


}
