package com.example.mysuperheroes.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mysuperheroes.R;
import com.example.mysuperheroes.models.SuperHeroModel;

import java.util.ArrayList;

public class SH_RecyclerViewAdapter extends RecyclerView.Adapter<SH_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<SuperHeroModel> superHeroModels;

    public SH_RecyclerViewAdapter(Context context, ArrayList<SuperHeroModel> superHeroModels) {
        this.context = context;
        this.superHeroModels = superHeroModels;
    };
    @NonNull
    @Override
    public SH_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate the layout

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new SH_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SH_RecyclerViewAdapter.MyViewHolder holder, int position) {
        // assigning values to the views we created in the recycler_view_row layout file
        // based on the position of the recycler view

        holder.tvName.setText(superHeroModels.get(position).getSuperHeroName());
        holder.tvDescription.setText(superHeroModels.get(position).getSuperHeroDescription());
        holder.imageView.setImageResource(superHeroModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return superHeroModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvName, tvDescription;
        public MyViewHolder (@NonNull View itemView) {
            super (itemView);

            imageView =itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tvDescription = itemView.findViewById(R.id.textView2);
        }
    }
}
