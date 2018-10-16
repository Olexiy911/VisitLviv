package com.example.android.visitlviv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class PlaceActivity extends AppCompatActivity {

    private static final String TAG = "PlaceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("Image") && getIntent().hasExtra("Name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("Image");
            /*Bundle bundle = this.getIntent().getExtras();
            int imageUrl = bundle.getInt("image");*/
            String imageName = getIntent().getStringExtra("Name");

            setImage(imageUrl, imageName);
        }
    }


    private void setImage(String imageUrl, String imageName){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.name_title);
        name.setText(imageName);

        ImageView image = findViewById(R.id.image_title);
        /*image.setImageResource(imageUrl);*/

        Glide.with(this).load(Integer.valueOf(imageUrl)).into(image);
    }

}