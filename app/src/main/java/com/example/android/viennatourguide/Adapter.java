package com.example.android.viennatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends ArrayAdapter<Item> {

    private Context mContext;

    public Adapter(Context context, ArrayList<Item> itemArrayList) {
        super(context, 0, itemArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Item item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview);
        TextView descTextView = (TextView) convertView.findViewById(R.id.desc_textview);
        TextView locTextView = (TextView) convertView.findViewById(R.id.loc_textview);

        imageView.setImageResource(item.getImage());
        titleTextView.setText(item.getTitle());
        descTextView.setText(item.getEventDesc());
        locTextView.setText(item.getLocation());

        return convertView;
    }
}
