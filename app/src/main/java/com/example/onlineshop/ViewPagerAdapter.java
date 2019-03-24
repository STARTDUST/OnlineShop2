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
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {


        String title = "";

        switch (position){
            case 0:
            {
                title = "Главное";
                break;
            }
            case 1:
            {
                title = "Каталог";
                break;
            }

            case 2:
            {
                title = "магазины";
                break;
            }
            case 3:
            {
                title = "Корзина";
                break;
            }
            case 4:
            {
                title = "Профиль";
                break;
            }
        }

        return title;
    }
}
