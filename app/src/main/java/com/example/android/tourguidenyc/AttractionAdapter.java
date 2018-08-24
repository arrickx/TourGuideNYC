package com.example.android.tourguidenyc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Attraction} objects.
 */
public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.ViewHolder>{
//    /**
//     * Create a new {@link AttractionAdapter} object.
//     *
//     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
//     * @param attractions is the list of {@link Attraction}s to be displayed.
//     */
//    public AttractionAdapter(Context context, ArrayList<Attraction> attractions) {
//        super(context, 0, attractions);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if an existing view is being reused, otherwise inflate the view
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//
//        // Get the {@link Attraction} object located at this position in the list
//        Attraction currentAttraction = getItem(position);
//
//        // Find the TextView in the list_item.xml layout with the ID attraction_name.
//        TextView attractionNameTextView = listItemView.findViewById(R.id.attraction_name);
//        // Get the attraction name from the currentAttraction object and set this text on
//        // the attraction_name TextView.
//        attractionNameTextView.setText(currentAttraction.getmAttractionName());
//
//        // Find the TextView in the list_item.xml layout with the ID attraction_location.
//        TextView attractionLocationTextView = listItemView.findViewById(R.id.attraction_location);
//        // Get the attraction location from the currentAttraction object and set this text on
//        // the attraction_location TextView.
//        attractionLocationTextView.setText(currentAttraction.getmAttractionLocation());
//
//        // Find the ImageView in the list_item.xml layout with the ID image.
//        ImageView imageView = listItemView.findViewById(R.id.attraction_img);
//        // Display the provided image based on the resource ID
//        imageView.setImageResource(currentAttraction.getmImageResourceId());
//
//        // Return the whole list item layout (containing 2 TextViews and 1 ImageView) so that
//        // it can be shown in the ListView.
//        return listItemView;
//
//    }

    // Store a member variable for the contacts
    private List<Attraction> mAttraction;

    // Pass in the contact array into the constructor
    public AttractionAdapter(List<Attraction> attractions) {
        mAttraction = attractions;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public AttractionAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(AttractionAdapter.ViewHolder viewHolder, int position) {
        // Get the data model based on position
        Attraction attraction = mAttraction.get(position);

        // Set item views based on your views and data model
        TextView textView1 = viewHolder.attractionNameTextView;
        textView1.setText(attraction.getmAttractionName());
        TextView textView2 = viewHolder.attractionLocationTextView;
        textView2.setText(attraction.getmAttractionLocation());
        ImageView imageView1 = viewHolder.imageView;
        imageView1.setImageResource(attraction.getmImageResourceId());
    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mAttraction.size();
    }

    // Provide a direct reference to each of the views within a data item
    // by using ButterKnife for cleaner experience
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.attraction_name) TextView attractionNameTextView;
        @BindView(R.id.attraction_location) TextView attractionLocationTextView;
        @BindView(R.id.attraction_img) ImageView imageView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
