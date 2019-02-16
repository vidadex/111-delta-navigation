package com.delta.navigation;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
    public static String[] tabNames = {"First Fragment", "Second Fragment", "Third Fragment"};

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    public static String[] getTabNames() {
        return tabNames;
    }

    public static void setTabNames(String[] tabNames) {
        TabsAdapter.tabNames = tabNames;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabNames.length;
    }
}
