package com.example.android.tourguidenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class EventActivity extends AppCompatActivity {
    @BindString(R.string.times_square_ball_drop)
    String ballDrop;
    @BindString(R.string.macys_thanksgiving_parade)
    String parade;
    @BindString(R.string.new_york_city_marathon)
    String marathon;
    @BindString(R.string.ball_drop_location)
    String ballDropLocation;
    @BindString(R.string.parade_location)
    String paradeLocation;
    @BindString(R.string.marathon_location)
    String marathonLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(ballDrop, ballDropLocation));
        attractions.add(new Attraction(parade, paradeLocation));
        attractions.add(new Attraction(marathon, marathonLocation));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
