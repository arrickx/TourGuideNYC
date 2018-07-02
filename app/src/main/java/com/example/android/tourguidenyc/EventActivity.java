package com.example.android.tourguidenyc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("E name 1", "E test 1"));
        attractions.add(new Attraction("E name 2", "E test 2"));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
