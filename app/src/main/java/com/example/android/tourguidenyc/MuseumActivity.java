package com.example.android.tourguidenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.ButterKnife;

public class MuseumActivity extends AppCompatActivity {
    @BindString(R.string.the_met)
    String theMet;
    @BindString(R.string.moma)
    String moma;
    @BindString(R.string.amnh)
    String amnh;
    @BindString(R.string.met_location)
    String metLocation;
    @BindString(R.string.moma_location)
    String momaLocation;
    @BindString(R.string.amnh_location)
    String amnhLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(theMet, metLocation));
        attractions.add(new Attraction(moma, momaLocation));
        attractions.add(new Attraction(amnh, amnhLocation));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
