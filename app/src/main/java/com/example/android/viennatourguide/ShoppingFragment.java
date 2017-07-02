package com.example.android.viennatourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


//@link fragment subclass.
public class ShoppingFragment extends Fragment {

    public static final String NAME = "SHOPPING";

    public ShoppingFragment() {
        // empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_shopping, container, false);

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(getString(R.string.shopping_name), "", getString(R.string.shopping_addr), R.drawable.naschmarkt2));
        items.add(new Item(getString(R.string.shopping_name2), "", getString(R.string.shopping_addr2), R.drawable.kaerntnerstrasse));
        items.add(new Item(getString(R.string.shopping_name3), "", getString(R.string.shopping_addr3), R.drawable.mariahilferstrasse));
        items.add(new Item(getString(R.string.shopping_name4), "", getString(R.string.shopping_addr4), R.drawable.lugnercity));
        items.add(new Item(getString(R.string.shopping_name5), "", getString(R.string.shopping_addr5), R.drawable.donauzentrum));

        ListView listView = (ListView) rootView.findViewById(R.id.shopping);
        Adapter adapter = new Adapter(rootView.getContext(), items);
        listView.setAdapter(adapter);

        return rootView;
    }

}
