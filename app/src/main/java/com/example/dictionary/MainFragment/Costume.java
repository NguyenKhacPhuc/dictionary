package com.example.dictionary.MainFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.dictionary.Adapter.CostumePagerAdapter;
import com.example.dictionary.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class Costume extends Fragment {
    View v;
    TabLayout tabLayout;
    ViewPager viewPager;
    ArrayList<String> nameOfTheFragment;
    int index = 0;
    String viewShowed;

    public Costume(String v){
        this.viewShowed = v;
    }

    public Costume(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.costume_fragment,container,false);
        initView();
        addName();
        assert getFragmentManager() != null;
        viewPager.setAdapter(new CostumePagerAdapter(getFragmentManager(),0,nameOfTheFragment));
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
        tabLayout = v.findViewById(R.id.tabLayout);
        viewPager = v.findViewById(R.id.viewPager);
    }
    void addName(){
        nameOfTheFragment = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.costume)));
    }
    private int compareIndex(String s){
        int r = 0;
        for (String name:nameOfTheFragment) {
            if(s.toLowerCase().contains(name.toLowerCase())){
                r = nameOfTheFragment.indexOf(name) + 1;
            }
        }
        return r;
    }
}
