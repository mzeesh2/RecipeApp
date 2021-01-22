package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {
   Context context;
   List<RecipeItem> recipeItemList;

    public RecipeAdapter(Context context, List<RecipeItem> data) {
        this.context = context;
        this.recipeItemList = data;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.recipe_item, parent, false);
        RecipeViewHolder recipeHolder = new RecipeViewHolder(v);

        return recipeHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        holder.recipe_name.setText(recipeItemList.get(position).getName());
        holder.recipe_dsc.setText(recipeItemList.get(position).getDescription());
        holder.img.setImageResource(recipeItemList.get(position).getImageResource());
    }

    @Override
    public int getItemCount() {
        return recipeItemList.size();
    }


    public static class RecipeViewHolder extends RecyclerView.ViewHolder {
        private TextView recipe_name;
        private TextView recipe_dsc;
        private ImageView img;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            recipe_name = (TextView) itemView.findViewById(R.id.recipeName);
            recipe_dsc = (TextView) itemView.findViewById(R.id.recipeDescription);
            img = (ImageView) itemView.findViewById(R.id.recipeIcon);

        }
    }
}
