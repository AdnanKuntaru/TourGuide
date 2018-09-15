package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 9/13/2018.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;


    // this for color background
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            Place currentPlace = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID address.
            TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
            addressTextView.setText(currentPlace.getmAddress());

            // Find the TextView in the list_item.xml layout with the ID place
            TextView placeTextView = (TextView) listItemView.findViewById(R.id.place);

            placeTextView.setText(currentPlace.getmHotel());

            // Find the ImageView in the list_item.xml layout with the ID image.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

            if (currentPlace.hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(currentPlace.getImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }
            // Set the theme color for the list item
            View textContainer = listItemView.findViewById(R.id.container);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);
        }
        return listItemView;
    }
}