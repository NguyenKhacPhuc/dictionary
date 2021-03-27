package com.example.dictionary.SubFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Adapter.ProcessAdapter;
import com.example.dictionary.ExpandableIntroRopeDataPump;
import com.example.dictionary.ExpandableTieRopeDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TieTechniqueFragment extends Fragment {
    View v;
    RecyclerView process1;
    RecyclerView process2;
    RecyclerView process3;
    RecyclerView process4;
    RecyclerView process5;
    RecyclerView process6;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.tie_rope_frag,container,false);
        process1 = v.findViewById(R.id.processItem);
        process2 = v.findViewById(R.id.processItem2);
        process3 = v.findViewById(R.id.processItem3);
        process4 = v.findViewById(R.id.processItem4);
        process5 = v.findViewById(R.id.processItem5);
        process6 = v.findViewById(R.id.processItem6);
        HashMap<String, List<String>> expandableListDetail = ExpandableTieRopeDataPump.getData();
        ArrayList<String> processItem = (ArrayList<String>) expandableListDetail.get("Cách 1");
        ArrayList<String> processItem2 = (ArrayList<String>) expandableListDetail.get("Cách 2");
        ArrayList<String> processItem3 = (ArrayList<String>) expandableListDetail.get("Cách 3");
        ArrayList<String> processItem4 = (ArrayList<String>) expandableListDetail.get("Cách 4");
        ArrayList<String> processItem5 = (ArrayList<String>) expandableListDetail.get("Cách 5");
        ArrayList<String> processItem6 = (ArrayList<String>) expandableListDetail.get("Cách 6");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln3 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln4 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln5 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln6 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), processItem);
        ProcessAdapter processAdapter2 = new ProcessAdapter(getContext(), processItem2);
        ProcessAdapter processAdapter3 = new ProcessAdapter(getContext(), processItem3);
        ProcessAdapter processAdapter4 = new ProcessAdapter(getContext(), processItem4);
        ProcessAdapter processAdapter5 = new ProcessAdapter(getContext(), processItem5);
        ProcessAdapter processAdapter6 = new ProcessAdapter(getContext(), processItem6);

        process1.setLayoutManager(ln);
        process1.setAdapter(processAdapter);
        process2.setLayoutManager(ln2);
        process2.setAdapter(processAdapter2);
        process3.setLayoutManager(ln3);
        process3.setAdapter(processAdapter3);
        process4.setLayoutManager(ln4);
        process4.setAdapter(processAdapter4);
        process5.setLayoutManager(ln5);
        process5.setAdapter(processAdapter5);
        process6.setLayoutManager(ln6);
        process6.setAdapter(processAdapter6);

        return v;
    }
}
