package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView textIntro = findViewById(R.id.textViewIntroD);
        ImageView imgLoc = findViewById(R.id.imageViewLoc);
        ImageView img = findViewById(R.id.imageViewDetails);

        Bundle bundle = getIntent().getExtras();

        Places place = (Places) bundle.getSerializable("place");

        textIntro.setText(place.getPlaceIntro());
        img.setImageResource(place.getPlacePic());



        imgLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double latitude = place.getLatitude();
                double lontude = place.getLongtude();
                String name = place.getPlaceName();
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:<" + latitude  + ">,<" + lontude + ">?q=<"
                                + latitude  + ">,<" + lontude + ">(" + name + ")"));
                startActivity(intent);
            }
        });



    }
}