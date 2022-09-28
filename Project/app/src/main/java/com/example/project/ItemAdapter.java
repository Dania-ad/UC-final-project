package com.example.project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter {
    ArrayList<Places> placeList = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Places> placeList, Context context) {
        this.placeList = placeList;
        this.context = context;
    }

    @NonNull
    @Override



    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ((ViewHolder)holder).img.setImageResource(placeList.get(position).getPlacePic());
        ((ViewHolder)holder).textname.setText(placeList.get(position).getPlaceName());
        ((ViewHolder)holder).textLoc.setText(placeList.get(position).getPlaceLoc());

        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,detailsActivity.class);
                intent.putExtra("place",placeList.get(position));
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return placeList.size() ;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView textname,textLoc;
        View v;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageViewPic);
            textname = v.findViewById(R.id.textViewName);
            textLoc = v.findViewById(R.id.textViewLoc);



        }
    }
}