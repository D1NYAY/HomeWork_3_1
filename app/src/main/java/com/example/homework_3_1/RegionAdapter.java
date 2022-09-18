package com.example.homework_3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RegionAdapter extends RecyclerView.Adapter<RegionViewHolder> {
    public RegionAdapter(ArrayList<String> regionsList) {
        this.regionsList = regionsList;
    }

    private ArrayList<String> regionsList;



    @NonNull
    @Override
    public RegionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RegionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_region, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RegionViewHolder holder, int position) {
holder.bind(regionsList.get(position));
    }

    @Override
    public int getItemCount() {
        return regionsList.size();
    }
}
