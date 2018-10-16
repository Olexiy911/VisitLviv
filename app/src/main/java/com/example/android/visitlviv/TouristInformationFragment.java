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

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;

public class TouristInformationFragment extends Fragment {

    Context context;

    public TouristInformationFragment(){

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.rynok_square), R.drawable.rynok_square));
        places.add(new Place(getResources().getString(R.string.town_hall), R.drawable.town_hall));
        places.add(new Place(getResources().getString(R.string.lviv_opera_house), R.drawable.opera_house));
        places.add(new Place(getResources().getString(R.string.the_palace_of_counts_potockis), R.drawable.palace_potockis));
        places.add(new Place(getResources().getString(R.string.the_chapel_of_the_boim_family), R.drawable.the_chapel_of_boim));
        places.add(new Place(getResources().getString(R.string.the_dominican_church), R.drawable.dominican_church));
        places.add(new Place(getResources().getString(R.string.the_bernardine_monastery), R.drawable.bernandine_monastery));
        places.add(new Place(getResources().getString(R.string.italian_courtyard), R.drawable.italian_courtyard));
        places.add(new Place(getResources().getString(R.string.the_high_castle_park), R.drawable.high_castle_park));
        places.add(new Place(getResources().getString(R.string.lychakiv_cemetery), R.drawable.lychakiv_cemetery));


        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter( getActivity(),places);
        recyclerView.setAdapter(adapter);


        return rootView;
    }
}
