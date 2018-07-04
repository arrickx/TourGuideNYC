package com.example.android.tourguidenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.ButterKnife;

public class RestaurantActivity extends AppCompatActivity {
    @BindString(R.string.the_river_cafe) String theRiverCafe;
    @BindString(R.string.daniel) String daniel;
    @BindString(R.string.gramercy_tavern) String gramercyTavern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(theRiverCafe, "R test 1"));
        attractions.add(new Attraction(daniel, "R test 2"));
        attractions.add(new Attraction(gramercyTavern, "R test 2"));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
