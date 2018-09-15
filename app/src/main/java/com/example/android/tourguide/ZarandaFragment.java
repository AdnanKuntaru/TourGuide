package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZarandaFragment extends Fragment {

    public ZarandaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list important point in Zaranda
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.zaranda), getString(R.string.location), R.drawable.zaranda
        ));
        places.add(new Place(getString(R.string.size), getString(R.string.social)
        ));
        places.add(new Place(getString(R.string.price), getString(R.string.category)
        ));
        places.add(new Place(getString(R.string.time), getString(R.string.operate)
        ));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.zaranda);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }

}
