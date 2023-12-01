package com.example.disneycharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LATTMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lattmain);
        ListView main_listview = findViewById(R.id.main_listviewer);

        ArrayList<MyListView> charactersList = new ArrayList<>();
        charactersList.add(new MyListView(R.drawable.tramp, "Tramp", "Jeff Bennet"));
        charactersList.add(new MyListView(R.drawable.lady, "Lady", "Jodi Benson"));
        charactersList.add(new MyListView(R.drawable.trusty, "Trusty", "Bill Baucom"));
        charactersList.add(new MyListView(R.drawable.scamps, "Scamp", "Scott Wolf"));

        CostumArrayAdapterLATT arrayAdapter = new CostumArrayAdapterLATT(this, 0, charactersList);

        main_listview.setAdapter(arrayAdapter);

        main_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyListView list = charactersList.get(position);
                Intent intent = new Intent(LATTMainActivity.this, Details.class);
                intent.putExtra("name", list.getmCharactersName());
                intent.putExtra("pengisisuara", list.getmPengisiSuara());
                intent.putExtra("img", list.getmImgResId());
                startActivity(intent);
            }
        });
    }
}

