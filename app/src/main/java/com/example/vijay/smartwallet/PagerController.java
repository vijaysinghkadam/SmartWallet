package com.example.vijay.smartwallet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int tabcount;

    public PagerController(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount = tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new users();
            case 1:
                return new history();
            case 2:
                return new activity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
