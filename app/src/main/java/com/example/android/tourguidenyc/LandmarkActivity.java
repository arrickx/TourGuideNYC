package com.example.android.tourguidenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.ButterKnife;

public class LandmarkActivity extends AppCompatActivity {
    @BindString(R.string.statue_of_liberty)
    String statueOfLiberty;
    @BindString(R.string.central_park)
    String centralPark;
    @BindString(R.string.times_square)
    String timesSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(statueOfLiberty, "L test 1"));
        attractions.add(new Attraction(centralPark, "L test 2"));
        attractions.add(new Attraction(timesSquare, "L test 2"));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
