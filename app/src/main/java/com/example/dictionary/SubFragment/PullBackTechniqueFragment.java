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
import com.example.dictionary.ExpandablePullBackTechniqueDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PullBackTechniqueFragment extends Fragment {
    View v;
    RecyclerView criteria;
    RecyclerView process1;
    RecyclerView process2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pull_back_frag,container,false);
        criteria = v.findViewById(R.id.criteria);
        process1 = v.findViewById(R.id.processItem);
        process2 = v.findViewById(R.id.processItem2);
        HashMap<String, List<String>> expandableListDetail = ExpandablePullBackTechniqueDataPump.getData();
        ArrayList<String> expandableList = (ArrayList<String>) expandableListDetail.get("Dây Mềm");
        ArrayList<String> processItem = (ArrayList<String>) expandableListDetail.get("Dây Cứng");
        ArrayList<String> processItem2 = (ArrayList<String>) expandableListDetail.get("Dây Ngắn");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln2 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter expandableListAdapter = new ProcessAdapter(getContext(), expandableList);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), processItem);
        ProcessAdapter processAdapter2 = new ProcessAdapter(getContext(), processItem2);
        criteria.setLayoutManager(ln);
        criteria.setAdapter(expandableListAdapter);
        process1.setLayoutManager(ln1);
        process1.setAdapter(processAdapter);
        process2.setLayoutManager(ln2);
        process2.setAdapter(processAdapter2);
        return v;
    }
}
