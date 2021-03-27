package com.example.dictionary.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.example.dictionary.SubFragment.NormalCostumeFragment;
import com.example.dictionary.SubFragment.TechnicalCostumeFragment;

import java.util.ArrayList;

public class CostumePagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> nameOfTheSubFragment;
    NormalCostumeFragment normalCostumeFragment;
    TechnicalCostumeFragment technicalCostumeFragment;

    public CostumePagerAdapter(@NonNull FragmentManager fm, int behavior, ArrayList<String> nameOfTheSubFragment) {
        super(fm, behavior);
        this.nameOfTheSubFragment = nameOfTheSubFragment;
        normalCostumeFragment = new NormalCostumeFragment();
        technicalCostumeFragment = new TechnicalCostumeFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return normalCostumeFragment;
            case 1:
                return technicalCostumeFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nameOfTheSubFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameOfTheSubFragment.get(position);
    }
}
