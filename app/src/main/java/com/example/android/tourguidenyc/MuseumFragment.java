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
 * {@link Fragment} that displays a list of Museums in New York City
 */
public class MuseumFragment extends Fragment {

    @BindView(R.id.list) RecyclerView attractionList;

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        ButterKnife.bind(this,rootView);
        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.string.the_met, R.string.met_location, R.drawable.the_met));
        attractions.add(new Attraction(R.string.moma, R.string.moma_location, R.drawable.moma));
        attractions.add(new Attraction(R.string.amnh, R.string.amnh_location, R.drawable.amnh));

        attractionList.setAdapter(new AttractionAdapter(attractions));

        attractionList.setLayoutManager(new LinearLayoutManager(getActivity()));

        attractionList.addItemDecoration(new
                DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        return rootView;
    }

}
