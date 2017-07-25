package com.example.nandhu.qoutes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nandhu on 24-02-2017.
 */

public class authorsAdapter extends ArrayAdapter<authors> {

    public authorsAdapter(Context context, ArrayList<authors> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        authors item = getItem(position);
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.text,parent,false);
        }
        TextView textView = (TextView)listItem.findViewById(R.id.listtext);
        textView.setText(item.getName());
        return listItem;
    }



}
