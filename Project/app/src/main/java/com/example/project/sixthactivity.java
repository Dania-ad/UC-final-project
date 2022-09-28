package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class sixthactivity extends AppCompatActivity {
    ArrayList<Places> placeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthactivity);


        Places p1 = new Places("سوق المباركية", R.drawable.mub,R.string.mub,"منطقة القبلة",29.3738,47.9729);
        Places p2 = new Places("الأفنيوز",R.drawable.avenues,R.string.avenues," منطقة الري",29.3033,47.935398);
        Places p3 = new Places("سوق شرق",R.drawable.souqsharq,R.string.souqsharq,"منطقة شرق" , 29.3896,47.9812);
        Places p4 = new Places("مجمع 360",R.drawable.mall,R.string.mall, "منطقة الزهراء" ,29.2676, 47.9928);
        Places p5 = new Places("سوق الكوت",R.drawable.alkk,R.string.alkout,"جنوب غرب الفحيحيل", 29.080582,48.142063);
        Places p6 = new Places("مجمع العاصمة",R.drawable.assima,R.string.assima,"وسط المنطقة التجارية في مدينة الكويت",29.3742,47.9876);
        Places p7 = new Places("مجمع الحمراء",R.drawable.hamra,R.string.hamra,"شارع الشهداء بمدينة الكويت",29.3791,47.9933);


        placeList.add(p1);
        placeList.add(p2);
        placeList.add(p3);
        placeList.add(p4);
        placeList.add(p5);
        placeList.add(p6);
        placeList.add(p7);





        RecyclerView recycler = findViewById(R.id.rv2);
        recycler.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(placeList,this);
        recycler.setAdapter(adapter);
    }
}