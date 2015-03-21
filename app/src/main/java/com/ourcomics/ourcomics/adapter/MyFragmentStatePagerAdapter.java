package com.ourcomics.ourcomics.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ourcomics.ourcomics.fragment.Fragment0;
import com.ourcomics.ourcomics.fragment.MangaViewFragment;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    public MyFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch(i){
            case 0:
                return new Fragment0();
            case 1:
                return new Fragment0();
            default:
                return new Fragment0();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}