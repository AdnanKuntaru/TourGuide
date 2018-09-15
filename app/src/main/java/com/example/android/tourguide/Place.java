package com.example.android.tourguide;

/**
 * Created by USER on 9/13/2018.
 */

// string for the place, color and images.
public class Place {
    private String mHotel;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = 0;

    public Place(String Hotel, String Address) {
        mHotel = Hotel;
        mAddress = Address;

    }

    // create the the list of
    public Place(String Hotel, String Address, int imageResourceId) {
        mHotel = Hotel;
        mAddress = Address;
        mImageResourceId = imageResourceId;

    }

    // get the current place
    public String getmHotel() {
        return mHotel;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

