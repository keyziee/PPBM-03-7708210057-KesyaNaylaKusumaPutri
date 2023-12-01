package com.example.disneycharacter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CostumArrayAdapter extends ArrayAdapter<MyListView>
{

    public CostumArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MyListView> myListViews) {
        super(context, resource, myListViews);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;

        if (listitemView == null)
        {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.my_list_view, parent, false);

        }

        MyListView currentItem = getItem(position);

        ImageView imageView = listitemView.findViewById(R.id.img) ;
        imageView.setImageResource(currentItem.getmImgResId());
        TextView textView1 = listitemView.findViewById(R.id.characters_name);
        textView1.setText(currentItem.getmCharactersName());
        TextView textView2 = listitemView.findViewById(R.id.pengisi_suara);
        textView2.setText(currentItem.getmPengisiSuara());

        return listitemView;
    }
}
