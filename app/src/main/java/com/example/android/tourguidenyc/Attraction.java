package com.example.android.tourguidenyc;

/**
 * {@link Attraction} represents detail information of the attraction.
 * It contains the name, location, and picture of the attranction.
 */
public class Attraction {

    //Default name of the attraction
    private String mAttractionName;

    //Default location of the attraction
    private String mAttractionLocation;

    //Image resource ID for the attraction
    private int mImageResourceId;

    /**
     * Create a new Attraction object.
     *
     * @param AttractionName is the name of the attraction
     * @param AttractionLocation is the location of the attraction
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */
    public Attraction(String AttractionName, String AttractionLocation, int imageResourceId) {
        mAttractionName = AttractionName;
        mAttractionLocation = AttractionLocation;
        mImageResourceId = imageResourceId;
    }

    //Retrieve the name of the attraction.
    public String getmAttractionName() {
        return mAttractionName;
    }

    //Retrieve the location of the attraction.
    public String getmAttractionLocation() {
        return mAttractionLocation;
    }

    //Retrieve the image resource ID of the attraction.
    public int getmImageResourceId(){
        return mImageResourceId;
    }
}
