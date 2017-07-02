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

        items.add(new Item(getString(R.string.restaurant_name), "", getString(R.string.restaurant_addr), R.drawable.naschmarkt));
        items.add(new Item(getString(R.string.restaurant_name2), "", getString(R.string.restaurant_addr2), R.drawable.cafecentral));
        items.add(new Item(getString(R.string.restaurant_name3), "", getString(R.string.restaurant_addr3), R.drawable.figlmuller));
        items.add(new Item(getString(R.string.restaurant_name4), "", getString(R.string.restaurant_addr4), R.drawable.ulrich));
        items.add(new Item(getString(R.string.restaurant_name5), "", getString(R.string.restaurant_addr5), R.drawable.veganer));
        items.add(new Item(getString(R.string.restaurant_name6), "", getString(R.string.restaurant_addr6), R.drawable.veganista));

        ListView listView = (ListView) rootView.findViewById(R.id.restaurant);
        Adapter adapter = new Adapter(rootView.getContext(), items);
        listView.setAdapter(adapter);

        return rootView;
    }

}
