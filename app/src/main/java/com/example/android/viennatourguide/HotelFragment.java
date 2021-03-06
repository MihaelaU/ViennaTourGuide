package com.example.android.viennatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.hotel_name), "", getString(R.string.hotel_addr), R.drawable.hotelstadthalle));
        items.add(new Item(getString(R.string.hotel_name2), "", getString(R.string.hotel_addr2), R.drawable.starin));
        items.add(new Item(getString(R.string.hotel_name), "", getString(R.string.hotel_addr), R.drawable.ibishotel));
        items.add(new Item(getString(R.string.hotel_name2), "", getString(R.string.hotel_addr2), R.drawable.kolpinghaus));
        items.add(new Item(getString(R.string.hotel_name), "", getString(R.string.hotel_addr), R.drawable.flemingshotels));

        ListView listView = (ListView) rootView.findViewById(R.id.hotel);
        Adapter adapter = new Adapter(rootView.getContext(), items);
        listView.setAdapter(adapter);

        return rootView;
    }

}
