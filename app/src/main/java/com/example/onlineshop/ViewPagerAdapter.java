package com.example.onlineshop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        DemoFragment demoFragment = new DemoFragment();
        i = i+1;

        Bundle bundle = new Bundle();
        bundle.putInt("message",i);
        demoFragment.setArguments(bundle);

        return demoFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        position = position + 1;
        String title = "";

        switch (position){
            case 0:
            {
                title = "shop";
                break;
            }

            case 1:
            {
                title = "magazin";
                break;
            }

            case 2:
            {
                title = "3sdjhdk";
                break;
            }
        }

        return title;
    }
}
