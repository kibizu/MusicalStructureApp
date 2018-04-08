package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Massimiliano on 02/03/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;
    private String tabTitles[] = new String[4];


    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        tabTitles[0] = context.getApplicationContext().getString(R.string.category_acoustic);
        tabTitles[1] = context.getApplicationContext().getString(R.string.category_cinematic);
        tabTitles[2] = context.getApplicationContext().getString(R.string.category_funky);
        tabTitles[3] = context.getApplicationContext().getString(R.string.category_other);


    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new AcousticFragment();
        }
        else if (position == 1){
            return new CinematicFragment();
        } else if (position == 2){
            return new FunkyFragment();
        } else {
            return new OtherFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];

    }

    @Override
    public int getCount() {
        return 4;
    }

}
