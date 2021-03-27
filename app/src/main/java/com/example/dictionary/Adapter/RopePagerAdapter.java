package com.example.dictionary.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.dictionary.SubFragment.ConnectTechniqueFragment;
import com.example.dictionary.SubFragment.HoldRopeTechniqueFragment;
import com.example.dictionary.SubFragment.IntroductionFragment;
import com.example.dictionary.SubFragment.NodeCreatorFragment;
import com.example.dictionary.SubFragment.PullBackTechniqueFragment;
import com.example.dictionary.SubFragment.TieTechniqueFragment;

import java.util.ArrayList;

public class RopePagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<String> nameOfTheSubFragment;
    IntroductionFragment introduction;
    PullBackTechniqueFragment pullBackTechniqueFragment;
    ConnectTechniqueFragment connectTechniqueFragment;
    TieTechniqueFragment tieTechniqueFragment;
    NodeCreatorFragment nodeCreatorFragment;
    HoldRopeTechniqueFragment holdRopeTechniqueFragment;
    public RopePagerAdapter(@NonNull FragmentManager fm, int behavior,ArrayList<String> nameOfTheSubFragment) {
        super(fm, behavior);
        this.nameOfTheSubFragment = nameOfTheSubFragment;
        introduction = new IntroductionFragment();
        pullBackTechniqueFragment = new PullBackTechniqueFragment();
        connectTechniqueFragment = new ConnectTechniqueFragment();
        tieTechniqueFragment = new TieTechniqueFragment();
        nodeCreatorFragment = new NodeCreatorFragment();
        holdRopeTechniqueFragment = new HoldRopeTechniqueFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return introduction;
            case 1:
                return pullBackTechniqueFragment;
            case 2:
                return connectTechniqueFragment;
            case 3:
                return tieTechniqueFragment;
            case 4:
                return nodeCreatorFragment;
            case 5:
                return holdRopeTechniqueFragment;
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
