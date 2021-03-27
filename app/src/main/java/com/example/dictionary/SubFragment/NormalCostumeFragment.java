package com.example.dictionary.SubFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Adapter.ProcessAdapter;
import com.example.dictionary.ExpandableListNormalCostumeDataPump;
import com.example.dictionary.ExpandableTechnicalCostumeDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NormalCostumeFragment extends Fragment {
    View v;
    RecyclerView criteria;
    RecyclerView process;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.normalcostume_fragment,container,false);
        criteria = v.findViewById(R.id.criteria);
        process = v.findViewById(R.id.processItem);
        HashMap<String, List<String>> expandableListDetail = ExpandableListNormalCostumeDataPump.getData();
        ArrayList<String> expandableList = (ArrayList<String>) expandableListDetail.get("Học cụ");
        ArrayList<String> processItem = (ArrayList<String>) expandableListDetail.get("Qui trình");
        LinearLayoutManager ln = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln1 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter expandableListAdapter = new ProcessAdapter(getContext(), expandableList);
        ProcessAdapter processAdapter = new ProcessAdapter(getContext(), processItem);
        criteria.setLayoutManager(ln);
        criteria.setAdapter(expandableListAdapter);
        process.setLayoutManager(ln1);
        process.setAdapter(processAdapter);
        return v;
    }
}
