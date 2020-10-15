package com.pluralsight.candycoded;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri.parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView)findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                into(candyStoreImageView);


    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    /*Hello, I have called my intent googlemapofcandycoded. It's kind of lengthy but according
    to me, it alright.*/
     public void onGoogleMapCandyCoded (View view){
        Intent googlemapofcandycoded=new Intent(Intent.ACTION_VIEW);
        googlemapofcandycoded.setData(Uri.parse("geo:0,0?q=618 E South St Orlando, FL"));
        startActivity(googlemapofcandycoded);
    }
    // ***

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    /*Hello, I have called my intent onCall for the case of the phone option. It's kind of lengthy but according
    to me, it alright.*/
    public void onPhoneCall (View view){
        Intent onCall=new Intent(Intent.ACTION_VIEW);
        //I  have simply changed the format from (012)345-6789 to  0123456789 because I don't think a phone will take that format. I hope am right.
        onCall.setData(Uri.parse("tel:0123456789"));
        startActivity(onCall);
    }
    // ***
}
