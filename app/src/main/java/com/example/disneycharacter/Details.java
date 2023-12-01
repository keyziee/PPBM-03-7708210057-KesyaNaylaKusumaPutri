package com.example.disneycharacter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView image = findViewById(R.id.details_img);
        TextView name = findViewById(R.id.details_name);
        TextView pengisisuara = findViewById(R.id.details_psuara);

        Bundle bundle = getIntent().getExtras();
        image.setImageResource(bundle.getInt("img"));
        name.setText(bundle.getString("name"));
        pengisisuara.setText(bundle.getString("pengisisuara"));

    }
}