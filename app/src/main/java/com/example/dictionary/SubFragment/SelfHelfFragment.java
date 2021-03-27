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
import com.example.dictionary.ExpandableSelfHelpDataPump;
import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SelfHelfFragment extends Fragment {
    View v;
    RecyclerView process5;
    RecyclerView process6;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.self_help_fragment,container,false);

        process5 = v.findViewById(R.id.processItem5);
        process6 = v.findViewById(R.id.processItem6);
        HashMap<String, List<String>> expandableListDetail = ExpandableSelfHelpDataPump.getData();
        ArrayList<String> stomatch = (ArrayList<String>) expandableListDetail.get("Bụng");
        ArrayList<String> ben = (ArrayList<String>) expandableListDetail.get("Háng");
        LinearLayoutManager ln5 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager ln6 = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        ProcessAdapter processAdapter5 = new ProcessAdapter(getContext(), stomatch);
        ProcessAdapter processAdapter6 = new ProcessAdapter(getContext(), ben);
        process5.setLayoutManager(ln5);
        process5.setAdapter(processAdapter5);
        process6.setLayoutManager(ln6);
        process6.setAdapter(processAdapter6);

        return v;
    }
}
