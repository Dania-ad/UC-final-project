package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);

        TextView name3 = findViewById(R.id.textViewName3);
        Button go = findViewById(R.id.buttonGO);

        Bundle bundle = getIntent().getExtras();
        String a = bundle.getString("name");

        name3.setText("اهلا وسهلا يا "+a);


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdactivity.this,fourthactivity.class);
                startActivity(intent);
            }
        });









    }
}