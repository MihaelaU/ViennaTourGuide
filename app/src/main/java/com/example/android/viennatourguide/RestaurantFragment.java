package com.example.android.viennatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


//@link fragment subclass.
public class RestaurantFragment extends Fragment {

    public static final String NAME = "RESTAURANTS";

    public RestaurantFragment() {
        // required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.restaurant_name), "", getString(R.string.restaurant_addr)));
        items.add(new Item(getString(R.string.restaurant_name2), "", getString(R.string.restaurant_addr2)));

        ListView listView = (ListView) rootView.findViewById(R.id.restaurant);
        Adapter adapter = new Adapter(rootView.getContext(), items);
        listView.setAdapter(adapter);

        return rootView;
    }

}
