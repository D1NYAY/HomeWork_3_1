package com.example.homework_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList regionList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        regionList.add("Russia");
        regionList.add("Kazakhstan");
        regionList.add("India");
        regionList.add("China");
        regionList.add("SaudiArabia");
        regionList.add("tajiGAYstan");
        regionList.add("Yemen");
        regionList.add("Oman");
        regionList.add("Turkey");
        regionList.add("Japan");
        regionList.add("Indonesia");
        regionList.add("Kyrgyzstan");
        regionList.add("SriLanka");
        regionList.add("South Korea");
        regionList.add("Iraq");
        regionList.add("Mongolia");
        regionList.add("NorthKorea");
        regionList.add("Pakistan");
        regionList.add("Uzbekistan");
        regionList.add("Nepal");
        regionList.add("Afghanistan");

        RegionAdapter adapter = new RegionAdapter(regionList);
        recyclerView.setAdapter(adapter);
    }
}