package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class fourthactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);


        ImageView img = findViewById(R.id.imageViewTP);
        ImageView imgmall = findViewById(R.id.imageViewMALL);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this,fifthActivity.class);
                startActivity(intent);
            }
        });

        imgmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this,sixthactivity.class);
                startActivity(intent);
            }
        });



    }


}