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
import com.example.dictionary.ExpandableConnectRopeDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectTechniqueFragment  extends Fragment {
    View v;
    RecyclerView process1;
    RecyclerView process2;
    RecyclerView process3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.connection_rope_frag,container,false);
        process1 = v.findViewById(R.id.processItem);
        process2 = v.findViewById(R.id.processItem2);
        process3 = v.findViewById(R.id.processItem3);
        HashMap<String, List<String>> expandableListDetail = ExpandableConnectRopeDataPump.getData();
        ArrayList<String> processItem = (ArrayList<String>) expandableListDetail.get("Cách 1");
        ArrayList<String> processItem2 = (ArrayList<String>) expandableListDetail.get("Cách 2");
        ArrayList<String> processItem3 = (ArrayList<String>) expandableListDetail.get("Cách 3");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), processItem);
        ProcessAdapter processAdapter2 = new ProcessAdapter(getContext(), processItem2);
        ProcessAdapter processAdapter3 = new ProcessAdapter(getContext(), processItem3);
        process1.setLayoutManager(ln);
        process1.setAdapter(processAdapter);
        process2.setLayoutManager(ln1);
        process2.setAdapter(processAdapter2);
        process3.setLayoutManager(ln2);
        process3.setAdapter(processAdapter3);
        return v;
    }
}
