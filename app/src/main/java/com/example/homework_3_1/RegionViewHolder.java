package com.example.homework_3_1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RegionViewHolder extends RecyclerView.ViewHolder {
    private TextView tvRegion;
    public RegionViewHolder(@NonNull View itemView) {
        super(itemView);
        tvRegion = itemView.findViewById(R.id.tvRegion);
    }

    public void bind(String name_region) {
       tvRegion.setText(name_region);
    }
}
