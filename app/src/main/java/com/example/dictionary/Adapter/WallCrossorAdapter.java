package com.example.dictionary.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

import java.util.ArrayList;

public class WallCrossorAdapter extends RecyclerView.Adapter<WallCrossorAdapter.WallCrossVH> {
    Context context;
    ArrayList<ModelCross> modelCrosses;
    public WallCrossorAdapter(Context context,ArrayList<ModelCross> modelCrosses){
        this.context = context;
        this.modelCrosses = modelCrosses;
    }
    @NonNull
    @Override
    public WallCrossVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cross_wall_item,parent,false);
        return new WallCrossVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull WallCrossVH holder, int position) {
        holder.step.setText(modelCrosses.get(position).getStep());
        holder.demo.setImageResource(modelCrosses.get(position).getImage());
        holder.content.setText(modelCrosses.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return modelCrosses.size();
    }

    class WallCrossVH extends RecyclerView.ViewHolder{
        TextView step;
        ImageView demo;
        TextView content;
        public WallCrossVH(@NonNull View itemView) {
            super(itemView);
            step = itemView.findViewById(R.id.step);
            demo = itemView.findViewById(R.id.image);
            content = itemView.findViewById(R.id.description);
        }
    }
}
