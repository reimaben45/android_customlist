package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {

    private LayoutInflater mInflater;
    private String[] mStrings;
    public MyListAdapter(@NonNull Context context, String[] values) {
        super(context, R.layout.listname_and_icons_layout, values);
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mStrings = values;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        convertView = mInflater.inflate(R.layout.listname_and_icons_layout,null);

        TextView theTextView = (TextView) convertView.findViewById(R.id.textView1);
        theTextView.setText(mStrings[position]);

        ImageView theImageView;
        theImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        theImageView.setImageResource(R.drawable.dot);

        return convertView;
    }
}
