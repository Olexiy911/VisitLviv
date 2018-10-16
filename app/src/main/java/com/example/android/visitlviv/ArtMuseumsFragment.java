package com.example.android.visitlviv;

import android.content.Context;
import android.net.Uri;
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

public class ArtMuseumsFragment extends Fragment {

    private Context context;

    public ArtMuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.lviv_sheptitsky_national_museum), R.drawable.lviv_national_museum));
        places.add(new Place(getResources().getString(R.string.museum_pharmacy), R.drawable.museum_pharmacy));
        places.add(new Place(getResources().getString(R.string.museum_of_national_folk), R.drawable.shevchenkivskyj_gaj));
        places.add(new Place(getResources().getString(R.string.lviv_art_gallery), R.drawable.lviv_art_gallery));
        places.add(new Place(getResources().getString(R.string.the_palace_of_arts), R.drawable.palace_of_arts));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter( getActivity(),places);
        recyclerView.setAdapter(adapter);


        return rootView;
    }


}
