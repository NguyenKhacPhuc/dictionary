package com.example.dictionary.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ProcessAdapter  extends RecyclerView.Adapter<ProcessAdapter.ContentProcess> {
    ArrayList<String> content;
    Context context;
    public ProcessAdapter(Context context, ArrayList<String> content){
        this.content = content;
        this.context = context;
    }
    @NonNull
    @Override
    public ContentProcess onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View c = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new ContentProcess(c);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentProcess holder, int position) {
        holder.str.setText(content.get(position));
    }

    @Override
    public int getItemCount() {
        return content.size();
    }

    class ContentProcess extends RecyclerView.ViewHolder{
        TextView str;
        public ContentProcess(@NonNull View itemView) {
            super(itemView);
            str = itemView.findViewById(R.id.expandedListItem);
        }
    }
}
