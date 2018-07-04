package com.example.android.tourguidenyc;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindDrawable;
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
    @BindDrawable(R.drawable.ball_drop)
    Drawable ballDropImg;
    @BindDrawable(R.drawable.parade)
    Drawable paradeImg;
    @BindDrawable(R.drawable.marathon)
    Drawable marathonImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);
        ButterKnife.bind(this);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(ballDrop, ballDropLocation, R.drawable.ball_drop));
        attractions.add(new Attraction(parade, paradeLocation, R.drawable.parade));
        attractions.add(new Attraction(marathon, marathonLocation, R.drawable.marathon));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
