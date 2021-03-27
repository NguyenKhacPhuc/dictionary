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
import com.example.dictionary.ExpandableHoldRopeDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HoldRopeTechniqueFragment extends Fragment {
    View v;
    RecyclerView process;
    RecyclerView process2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.hold_rope_frag,container,false);
        process = v.findViewById(R.id.processItem);
        process2 = v.findViewById(R.id.processItem2);
        HashMap<String , List<String>> expandableListDetail = ExpandableHoldRopeDataPump.getData();
        ArrayList<String> processItem = (ArrayList<String>) expandableListDetail.get("Eo");
        ArrayList<String> processItem2 = (ArrayList<String>) expandableListDetail.get("Vai");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), processItem);
        ProcessAdapter processAdapter2 = new ProcessAdapter(getContext(), processItem2);
        process.setLayoutManager(ln);
        process.setAdapter(processAdapter);
        process2.setLayoutManager(ln1);
        process2.setAdapter(processAdapter2);
        return v;
    }
}
