package com.example.disneycharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView main_listview = findViewById(R.id.main_listview);

        ArrayList<MyListView> charactersList = new ArrayList<>();
        charactersList.add(new MyListView(R.drawable.elsaa, "Elsa", "Indina Menzel"));
        charactersList.add(new MyListView(R.drawable.anna, "Anna", "Kristen Bell"));
        charactersList.add(new MyListView(R.drawable.kristof, "Kristoff", "Jonathan Groff"));
        charactersList.add(new MyListView(R.drawable.olaf, "Olaf", "Josh Gad"));

        CostumArrayAdapter arrayAdapter = new CostumArrayAdapter(this, 0, charactersList);

        main_listview.setAdapter(arrayAdapter);

        main_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyListView list = charactersList.get(position);
                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("name", list.getmCharactersName());
                intent.putExtra("pengisisuara", list.getmPengisiSuara());
                intent.putExtra("img", list.getmImgResId());
                startActivity(intent);
            }
        });
    }
}