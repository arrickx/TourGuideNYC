package com.example.android.tourguidenyc;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.ButterKnife;

public class LandmarkActivity extends AppCompatActivity {
    @BindString(R.string.statue_of_liberty)
    String statueOfLiberty;
    @BindString(R.string.central_park)
    String centralPark;
    @BindString(R.string.times_square)
    String timesSquare;
    @BindString(R.string.statue_location)
    String statueLocation;
    @BindString(R.string.park_location)
    String parkLocation;
    @BindString(R.string.times_square_location)
    String timesSquareLocation;
    @BindDrawable(R.drawable.statue_of_liberty)
    Drawable statueImg;
    @BindDrawable(R.drawable.central_park)
    Drawable parkImg;
    @BindDrawable(R.drawable.times_square)
    Drawable timesSquareImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(statueOfLiberty, statueLocation, R.drawable.statue_of_liberty));
        attractions.add(new Attraction(centralPark, parkLocation, R.drawable.central_park));
        attractions.add(new Attraction(timesSquare, timesSquareLocation, R.drawable.times_square));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
