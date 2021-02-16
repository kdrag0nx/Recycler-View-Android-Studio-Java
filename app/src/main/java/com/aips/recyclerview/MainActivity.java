package com.aips.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        customAdapter customAdapter = new customAdapter(this, getArrayList());

    }

    private ArrayList<String> getArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String s = "pdf....";
        arrayList.add(s);arrayList.add(s);arrayList.add(s);arrayList.add(s);
        return arrayList;
    }
}