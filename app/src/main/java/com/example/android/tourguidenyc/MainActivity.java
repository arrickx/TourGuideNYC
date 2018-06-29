package com.example.android.tourguidenyc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.landmark)
    TextView landmark;
    @BindView(R.id.museum)
    TextView museum;
    @BindView(R.id.restaurant)
    TextView restaurant;
    @BindView(R.id.event)
    TextView event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        landmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent landmarkIntent = new Intent(MainActivity.this, LandmarkActivity.class);

                startActivity(landmarkIntent);
            }
        });

        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumActivity.class);

                startActivity(museumIntent);
            }
        });
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                startActivity(restaurantIntent);
            }
        });
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(MainActivity.this, EventActivity.class);

                startActivity(eventIntent);
            }
        });

    }
}
