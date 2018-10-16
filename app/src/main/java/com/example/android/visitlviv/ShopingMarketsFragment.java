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


public class ShopingMarketsFragment extends Fragment {
    Context context;

    public ShopingMarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getResources().getString(R.string.king_cross_leopolis), R.drawable.king_cross));
        places.add(new Place(getResources().getString(R.string.opera_passage), R.drawable.opera_passage));
        places.add(new Place(getResources().getString(R.string.victoria_gardens), R.drawable.viktorija_gardens));
        places.add(new Place(getResources().getString(R.string.forum_lviv), R.drawable.forum_lviv));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecycleViewAdapter adapter = new RecycleViewAdapter( getActivity(),places);
        recyclerView.setAdapter(adapter);


        return rootView;
    }
}
