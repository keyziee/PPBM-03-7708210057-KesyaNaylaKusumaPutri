package com.example.disneycharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activier);

        ListView listView = findViewById(R.id.lizetview);

        List<String> list = new ArrayList<>();
        list.add("Frozen");
        list.add("TinkerBell and the Secret of the Wings");
        list.add("Lady and the Tramp");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    startActivity(new Intent(MainActivier.this, MainActivity.class));
                }

                if (position == 1) {

                    startActivity(new Intent(MainActivier.this, OHAODMainActivity.class));
                }

                if (position == 2) {

                    startActivity(new Intent(MainActivier.this, LATTMainActivity.class));
                }
            }
        });
    }

}