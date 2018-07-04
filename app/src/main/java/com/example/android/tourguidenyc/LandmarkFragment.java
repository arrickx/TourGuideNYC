package com.example.android.tourguidenyc;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * {@link Fragment} that displays a list of Landmarks in New York City.
 */
public class LandmarkFragment extends Fragment {

    public LandmarkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create a list of landmark attractions
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(R.string.statue_of_liberty, R.string.statue_location, R.drawable.statue_of_liberty));
        attractions.add(new Attraction(R.string.central_park, R.string.park_location, R.drawable.central_park));
        attractions.add(new Attraction(R.string.times_square, R.string.times_square_location, R.drawable.times_square));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
