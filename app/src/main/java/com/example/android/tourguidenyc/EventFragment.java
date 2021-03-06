package com.example.android.tourguidenyc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link Fragment} that displays a list of Events in New York City
 */
public class EventFragment extends Fragment {

    @BindView(R.id.list) RecyclerView attractionList;

    public EventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        ButterKnife.bind(this,rootView);
        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.times_square_ball_drop, R.string.times_square_location, R.drawable.ball_drop));
        attractions.add(new Attraction(R.string.macys_thanksgiving_parade, R.string.park_location, R.drawable.parade));
        attractions.add(new Attraction(R.string.new_york_city_marathon, R.string.marathon_location, R.drawable.marathon));

        attractionList.setAdapter(new AttractionAdapter(attractions));

        attractionList.setLayoutManager(new LinearLayoutManager(getActivity()));

        attractionList.addItemDecoration(new
                DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        return rootView;
    }

}
