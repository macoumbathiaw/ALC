package com.example.mthiaw.alc;

import android.support.v4.app.Fragment;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.res.Resources;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class ATVFragmentPagerAdapter extends FragmentPagerAdapter {

    //Declaring the tabs title names
    private String tabTitles[] = new String[]{"About ATV", "Consulting", "Retails", "Services", "Contact us"};

    public ATVFragmentPagerAdapter(FragmentManager atvFm, MainActivity mainActivity) {
        super(atvFm);
    }

    //The position is declared and it receives the position of the fragment. it can be any of the 5 fragments
    @Override
    public Fragment getItem(int position) {

        //On position 0 which is the very first position we have About AVT information. These positions go by alphabetical order
        if (position == 0) {
            return new AboutATVFragment();

            //On Position 1 we have Consulting tab
        } else if (position == 1) {
            return new ConsultingFragment();
            //On position 2 we have Retails
        } else if (position == 2) {
            return new RetailsFragment();
            //On position 3 we have Services
        } else if (position == 3) {
            return new ServicesFragment();
            //On position 4 we have Contact us
        } else {
            return new ContactUsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    //Getting the tabs names

    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}