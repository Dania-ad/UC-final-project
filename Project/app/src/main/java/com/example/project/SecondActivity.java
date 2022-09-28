package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText name = findViewById(R.id.editTextName);
        EditText email = findViewById(R.id.editTextEmail);
        Button next = findViewById(R.id.button2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = name.getText().toString();
                String b = email.getText().toString();

                //inside (form.this+to.class)
                Intent intent = new Intent(SecondActivity.this,thirdactivity.class);
                intent.putExtra("name",a); //(key, thing i want to send)
                intent.putExtra("email",b); //(key, thing i want to send)

                if(!a.isEmpty() && !b.isEmpty())
                    startActivity(intent);

            }
        });


    }
}