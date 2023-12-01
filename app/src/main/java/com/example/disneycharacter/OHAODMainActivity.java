package com.example.disneycharacter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class OHAODMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ohaodmain);

        ListView main_listview = findViewById(R.id.main_listviewe);

        ArrayList<MyListView> charactersList = new ArrayList<>();
        charactersList.add(new MyListView(R.drawable.tinkerbell, "Tinkerbell", "Rose Mclver"));
        charactersList.add(new MyListView(R.drawable.twinbel, "Periwinkle", "Lucy Hale"));
        charactersList.add(new MyListView(R.drawable.vidia, "Vidia", "Pamela Adlon"));
        charactersList.add(new MyListView(R.drawable.silvermist, "Silvermist", "Lucy Liu"));

        CostumArrayAdapterOHAOD arrayAdapter = new CostumArrayAdapterOHAOD(this, 0, charactersList);

        main_listview.setAdapter(arrayAdapter);

        main_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyListView list = charactersList.get(position);
                Intent intent = new Intent(OHAODMainActivity.this, Details.class);
                intent.putExtra("name", list.getmCharactersName());
                intent.putExtra("pengisisuara", list.getmPengisiSuara());
                intent.putExtra("img", list.getmImgResId());
                startActivity(intent);
            }
        });
    }
}

