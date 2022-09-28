package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class fifthActivity extends AppCompatActivity {

    ArrayList<Places> placeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);



        Places p1 = new Places("ابراج الكويت", R.drawable.kuwaittower,R.string.kt,"شارع الخليج العربي",
                29.389713,48.003288);
        Places p2 = new Places("برج التحرير",R.drawable.tahrir,R.string.tahrir,
                " شارع عبد الله السالم بمدينة الكويت",29.3682,47.9749);
        Places p3 = new Places("متحف الكويت الوطني",R.drawable.knm,R.string.knm,"شارع الخليج العربي",
                29.3732,47.9669);
        Places p4 = new Places("حديقة الشهيد",R.drawable.shaheed,R.string.shaheed,
                "شارع السور بمدينة الكويت",29.3693,47.9937);
        Places p5 = new Places("مركز الشيخ جابر الأحمد الثقافي",R.drawable.jabercultutal,R.string.jb,"شارع الخليج العربي",
                29.3618,47.9582);
        Places p6 = new Places("مركز الشيخ عبدالله السالم الثقافي",R.drawable.salem,R.string.salem,
                "شارع بغداد بالسالمية",29.3436,48.0410);
        Places p7 = new Places("المسجد الكبير",R.drawable.gm,R.string.gm,"مدينة الكويت",
                29.3794,47.9752);


        placeList.add(p1);
        placeList.add(p2);
        placeList.add(p3);
        placeList.add(p4);
        placeList.add(p5);
        placeList.add(p6);
        placeList.add(p7);



        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

       ItemAdapter adapter = new ItemAdapter(placeList,this);
        recycler.setAdapter(adapter);




    }
}