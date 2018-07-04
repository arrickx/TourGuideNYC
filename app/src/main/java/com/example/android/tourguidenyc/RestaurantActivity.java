package com.example.android.tourguidenyc;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindInt;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RestaurantActivity extends AppCompatActivity {
    @BindString(R.string.the_river_cafe)
    String theRiverCafe;
    @BindString(R.string.daniel)
    String daniel;
    @BindString(R.string.gramercy_tavern)
    String gramercyTavern;
    @BindString(R.string.river_cafe_location)
    String riverCafeLocation;
    @BindString(R.string.daniel_location)
    String danielLocation;
    @BindString(R.string.gramercy_tavern_location)
    String gramercyTavernLocation;
    @BindDrawable(R.drawable.the_river_cafe)
    Drawable riverCafeImg;
    @BindDrawable(R.drawable.daniel)
    Drawable danielImg;
    @BindDrawable(R.drawable.gramercy_tavern)
    Drawable gramercyTavernImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(theRiverCafe, riverCafeLocation, R.drawable.the_river_cafe));
        attractions.add(new Attraction(daniel, danielLocation, R.drawable.daniel));
        attractions.add(new Attraction(gramercyTavern, gramercyTavernLocation, R.drawable.gramercy_tavern));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
