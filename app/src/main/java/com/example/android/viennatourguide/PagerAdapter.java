package com.example.android.viennatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[]{
            SightseeingsFragment.NAME,
            HotelFragment.NAME,
            RestaurantFragment.NAME,
            ShoppingFragment.NAME};


    private Context mContext;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, SightseeingsFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, HotelFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, RestaurantFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, ShoppingFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // generate title based on item position
        return tabTitles[position];
    }
}
