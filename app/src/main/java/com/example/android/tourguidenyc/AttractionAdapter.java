package com.example.android.tourguidenyc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Attraction} objects.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {
    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param attractions is the list of {@link Attraction}s to be displayed.
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID attraction_name.
        TextView attractionNameTextView = listItemView.findViewById(R.id.attraction_name);
        // Get the attraction name from the currentAttraction object and set this text on
        // the attraction_name TextView.
        attractionNameTextView.setText(currentAttraction.getmAttractionName());

        // Find the TextView in the list_item.xml layout with the ID attraction_location.
        TextView attractionLocationTextView = listItemView.findViewById(R.id.attraction_location);
        // Get the attraction location from the currentAttraction object and set this text on
        // the attraction_location TextView.
        attractionLocationTextView.setText(currentAttraction.getmAttractionLocation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.attraction_img);
        // Display the provided image based on the resource ID
        imageView.setImageResource(currentAttraction.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and 1 ImageView) so that
        // it can be shown in the ListView.
        return listItemView;

    }
}
