package com.example.dictionary.MainFragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.dictionary.App;
import com.example.dictionary.MainActivity;
import com.example.dictionary.R;

public class SearchFragment extends Fragment{
    View v;
    private final String[] COUNTRIES = App.getContext().getResources().getStringArray(R.array.search_text);
    String[] mainFragKey = {"Dây","Tự cứu","Trang phục"};
    Toolbar toolbar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.search,container,false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        final AutoCompleteTextView textView = (AutoCompleteTextView) v.findViewById(R.id.search_bar);
        textView.setAdapter(adapter);
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                hideKeyboard(getActivity());
                Fragment fragment;
                String title;
                int index;
                String selected = (String)parent.getItemAtPosition(position);
                if(selected.toLowerCase().contains(mainFragKey[0].toLowerCase())){
                    fragment = new Rope(selected);
                    index = 2;
                    title = mainFragKey[0];
                }else if(selected.toLowerCase().contains(mainFragKey[1].toLowerCase())){
                    fragment = new BeltFragment(selected);
                    index = 4;
                    title = mainFragKey[1];
                }else if(selected.toLowerCase().contains(mainFragKey[2].toLowerCase())){
                    fragment = new Costume(selected);
                    index = 1;
                    title = mainFragKey[2];
                }else{
                    fragment = new WallCrossing();
                    index = 3;
                    title = "Vượt Tường";
                }
                MainActivity.toolbar.setTitle(title);
                MainActivity.navView.getCheckedItem().setChecked(false);
                MainActivity.navView.getMenu().getItem(index).setChecked(true);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }
        });
        return v;
    }

    private static void hideKeyboard(Activity activity) {
        View view = activity.findViewById(android.R.id.content);
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

}
