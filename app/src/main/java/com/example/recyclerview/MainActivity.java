package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      rec= findViewById(R.id.recycler_view);
      LinearLayoutManager layoutmanger=new LinearLayoutManager(this);
        layoutmanger.setOrientation(layoutmanger.VERTICAL);
        rec.setLayoutManager(layoutmanger);

        List<Modelclass> modelclassList= new ArrayList<>();
        modelclassList.add(new Modelclass("Tricep Pushdown","Exercise 1","10 Repetition","35\nLBS"));
        modelclassList.add(new Modelclass("Seated Biceps Curl","Exercise 2","15 Repetition","40\nLBS"));
        modelclassList.add(new Modelclass("Triceps","Exercise 3","11 Repetition","50\nLBS"));
        modelclassList.add(new Modelclass("Seated Biceps Curl","Exercise 4","15 Repetition","35\nLBS"));
        modelclassList.add(new Modelclass("Tricep Pushdown","Exercise 5","12 Repetition","50\nLBS"));
        modelclassList.add(new Modelclass("Tricep Pushdown","Exercise 6","15 Repetition","40\nLBS"));

        Adapter adapter=new Adapter(modelclassList);
        rec.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}