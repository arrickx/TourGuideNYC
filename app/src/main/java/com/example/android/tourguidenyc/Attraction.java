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

    /**
     * Create a new Attraction object.
     *
     * @param AttractionName is the name of the attraction
     * @param AttractionLocation is the location of the attraction
     */
    public Attraction(String AttractionName, String AttractionLocation) {
        mAttractionName = AttractionName;
        mAttractionLocation = AttractionLocation;
    }

    //Retrieve the name of the attraction.

    public String getmAttractionName() {
        return mAttractionName;
    }

    //Retrieve the location of the attraction.

    public String getmAttractionLocation() {
        return mAttractionLocation;
    }
}
