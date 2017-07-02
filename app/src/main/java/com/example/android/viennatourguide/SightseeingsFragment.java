package com.example.android.viennatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

//@link fragment subclass.

public class SightseeingsFragment extends Fragment {

    public static final String NAME = "SIGHTSEEING";

    public SightseeingsFragment() {
        // empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sightseeings, container, false);

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.sightseeing_name), "", getString(R.string.sightseeing_addr), R.drawable.stephansdom));
        items.add(new Item(getString(R.string.sightseeing_name2), "", getString(R.string.sightseeing_name2), R.drawable.schonnbrun));
        items.add(new Item(getString(R.string.sightseeing_name3), "", getString(R.string.sightseeing_addr3), R.drawable.kunsthistorisches));
        items.add(new Item(getString(R.string.sightseeing_name4), "", getString(R.string.sightseeing_name4), R.drawable.belvedere));
        items.add(new Item(getString(R.string.sightseeing_name5), "", getString(R.string.sightseeing_addr5), R.drawable.hofburg));
        items.add(new Item(getString(R.string.sightseeing_name6), "", getString(R.string.sightseeing_name6), R.drawable.ringstrasse));
        items.add(new Item(getString(R.string.sightseeing_name7), "", getString(R.string.sightseeing_addr7), R.drawable.aquarium));
        ListView listView = (ListView) rootView.findViewById(R.id.sightseeing);
        Adapter adapter = new Adapter(rootView.getContext(), items);
        listView.setAdapter(adapter);

        return rootView;
    }

}
