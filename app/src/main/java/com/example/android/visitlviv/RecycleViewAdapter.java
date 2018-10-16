package com.example.android.visitlviv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<Place> places;
    private Context mContext;

    public RecycleViewAdapter(Context context, ArrayList<Place> places) {
        this.places = places;
        this.mContext = context;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(places.get(position).getmImage())
                .into(holder.image);
        /*holder.image.setImageResource(data.get(position).getmImage());*/
        holder.imageName.setText(places.get(position).getmImageName());
        holder.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                Toast.makeText(mContext, "Click: " + places.get(position).getmImageName(), Toast.LENGTH_SHORT).show();

                Intent i = new Intent(mContext,PlaceActivity.class);

                i.putExtra("Name",places.get(position).getmImageName());
                i.putExtra("Image",places.get(position).getmImage().toString());

                mContext.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        //CircleImageView image;
        ImageView image;
        TextView imageName;
        private OnItemClickListener itemClickListener;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img_place);
            imageName = itemView.findViewById(R.id.place_title);
            itemView.setOnClickListener(this);
        }

        public void setOnItemClickListener(OnItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;

        }

        @Override
        public void onClick(View view) {
            this.itemClickListener.onClick(view, getAdapterPosition());
        }
    }

}