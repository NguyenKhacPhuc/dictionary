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
import com.example.dictionary.ExpandableNodeCreatorDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NodeCreatorFragment extends Fragment {
    View v;
    RecyclerView process1;
    RecyclerView process2;
    RecyclerView process3;
    RecyclerView process4;
    RecyclerView process7;
    RecyclerView process8;
    RecyclerView process9;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.node_creator_frag,container,false);
        process1 = v.findViewById(R.id.processItem);
        process2 = v.findViewById(R.id.processItem2);
        process3 = v.findViewById(R.id.processItem3);
        process4 = v.findViewById(R.id.processItem4);
        process7 = v.findViewById(R.id.processItem7);
        process8 = v.findViewById(R.id.processItem8);
        process9 = v.findViewById(R.id.processItem9);
        HashMap<String, List<String>> expandableListDetail = ExpandableNodeCreatorDataPump.getData();
        ArrayList<String> node0 = (ArrayList<String>) expandableListDetail.get("Chữ O");
        ArrayList<String> node8 = (ArrayList<String>) expandableListDetail.get("Số 8");
        ArrayList<String> loopknot = (ArrayList<String>) expandableListDetail.get("Thòng lọng");
        ArrayList<String> chest = (ArrayList<String>) expandableListDetail.get("Ngực");
        ArrayList<String> saveppl = (ArrayList<String>) expandableListDetail.get("Cõng");
        ArrayList<String> saveppl2 = (ArrayList<String>) expandableListDetail.get("Thả");
        ArrayList<String> device = (ArrayList<String>) expandableListDetail.get("Thiết bị");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln3 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln4 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln7 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln8 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln9 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), node0);
        ProcessAdapter processAdapter2 = new ProcessAdapter(getContext(), node8);
        ProcessAdapter processAdapter3 = new ProcessAdapter(getContext(), loopknot);
        ProcessAdapter processAdapter4 = new ProcessAdapter(getContext(), chest);
        ProcessAdapter processAdapter7 = new ProcessAdapter(getContext(), saveppl);
        ProcessAdapter processAdapter8 = new ProcessAdapter(getContext(), saveppl2);
        ProcessAdapter processAdapter9 = new ProcessAdapter(getContext(), device);
        process1.setLayoutManager(ln);
        process1.setAdapter(processAdapter);
        process2.setLayoutManager(ln2);
        process2.setAdapter(processAdapter2);
        process3.setLayoutManager(ln3);
        process3.setAdapter(processAdapter3);
        process4.setLayoutManager(ln4);
        process4.setAdapter(processAdapter4);
        process7.setLayoutManager(ln7);
        process7.setAdapter(processAdapter7);
        process8.setLayoutManager(ln8);
        process8.setAdapter(processAdapter8);
        process9.setLayoutManager(ln9);
        process9.setAdapter(processAdapter9);
        return v;
    }
}
