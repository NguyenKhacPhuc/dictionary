package com.example.dictionary.MainFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.dictionary.Adapter.RopePagerAdapter;
import com.example.dictionary.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class Rope extends Fragment {
    View v;
    TabLayout tabLayout;
    ViewPager viewPager;
    ArrayList<String> nameOfTheFragment;
    int index = 0;
    String viewShowed;

    public Rope(String view){
        viewShowed = view;
    }

    public Rope(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.rope_fragment,container,false);
        initView();
        addName();

        assert getFragmentManager() != null;
        viewPager.setAdapter(new RopePagerAdapter(getFragmentManager(),0,nameOfTheFragment));
        if(viewShowed != null){
            index = compareIndex(viewShowed);
            viewPager.postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    viewPager.setCurrentItem(index, true);
                }
            }, 10);
        }
        tabLayout.setupWithViewPager(viewPager);
        return v;
    }
    void initView(){
        nameOfTheFragment = new ArrayList<>();
        tabLayout = v.findViewById(R.id.tabLayoutRope);
        viewPager = v.findViewById(R.id.viewPager);
    }
    void addName(){
        nameOfTheFragment = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.rope)));
    }

    private int compareIndex(String s){
        int r = 0;
        for (String name:nameOfTheFragment) {
            if(s.toLowerCase().contains(name.toLowerCase())){
                r = nameOfTheFragment.indexOf(name);
            }
        }
        return r;
    }
}
