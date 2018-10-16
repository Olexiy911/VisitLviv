package com.example.android.visitlviv;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {

    Context context;

    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.stryisky_park), R.drawable.stryisky_park));
        places.add(new Place(getResources().getString(R.string.ivan_franko_park), R.drawable.ivan_franko_park));
        places.add(new Place(getResources().getString(R.string.culture_and_rest_park), R.drawable.culture_and_rest_park));
        places.add(new Place(getResources().getString(R.string.botanic_garden_of_lviv_university), R.drawable.botanic_garden));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter( getActivity(),places);
        recyclerView.setAdapter(adapter);


        return rootView;
    }

}
