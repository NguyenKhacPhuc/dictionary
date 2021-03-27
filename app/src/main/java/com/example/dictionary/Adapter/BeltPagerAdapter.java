package com.example.dictionary.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.dictionary.SubFragment.GroinBeltFragment;
import com.example.dictionary.SubFragment.SafetyBeltFragment;
import com.example.dictionary.SubFragment.SelfHelfFragment;

import java.util.ArrayList;

public class BeltPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> nameOfTheFragments;
    SafetyBeltFragment safetyBeltFragment;
    GroinBeltFragment groinBeltFragment;
    SelfHelfFragment selfHelfFragment;
    public BeltPagerAdapter(@NonNull FragmentManager fm, int behavior,ArrayList<String> nameOfTheFragments) {
        super(fm, behavior);
        this.nameOfTheFragments = nameOfTheFragments;
        safetyBeltFragment = new SafetyBeltFragment();
        groinBeltFragment = new GroinBeltFragment();
        selfHelfFragment = new SelfHelfFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return safetyBeltFragment;
            case 1:
                return groinBeltFragment;
            case 2:
                return selfHelfFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nameOfTheFragments.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameOfTheFragments.get(position);
    }
}
