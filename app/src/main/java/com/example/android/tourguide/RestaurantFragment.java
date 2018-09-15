package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of restaurants in Bauchi Metropolis.
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.daam), getString(R.string.yan_doka)));
        places.add(new Place(getString(R.string.space_care), getString(R.string.insuarance)));
        places.add(new Place(getString(R.string.alhayat), getString(R.string.nigeria)));
        places.add(new Place(getString(R.string.trophical), getString(R.string.mai_goro)));
        places.add(new Place(getString(R.string.mr), getString(R.string.state)));
        places.add(new Place(getString(R.string.shafa), getString(R.string.along)));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.multi);

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
