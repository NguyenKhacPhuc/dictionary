package com.example.dictionary.MainFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Adapter.ModelCross;
import com.example.dictionary.Adapter.WallCrossorAdapter;
import com.example.dictionary.ExpandableCrossTheWallDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;

public class WallCrossing extends Fragment {
    View v;
    RecyclerView rs;
    ArrayList<ModelCross> modelCrosses;
    int[] image = {R.drawable.anh1,R.drawable.anh2,R.drawable.anh3,R.drawable.anh4,R.drawable.anh5,R.drawable.ketthuc};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.crosswall_fragment,container,false);
        rs = v.findViewById(R.id.criteria);
        modelCrosses = new ArrayList<>();
        HashMap<Integer,String> data = ExpandableCrossTheWallDataPump.getData();
        for(int i = 0;i<data.size();i++){
            int step = i + 1;
            modelCrosses.add(new ModelCross("Step "+step,image[i],data.get(step)));
        }
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rs.setLayoutManager(ln);
        rs.setAdapter(new WallCrossorAdapter(getContext(),modelCrosses));
        return v;
    }
}
