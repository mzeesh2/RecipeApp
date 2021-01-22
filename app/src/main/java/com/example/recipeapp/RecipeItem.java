package com.example.recipeapp;

public class RecipeItem {
    private int mImageResource;
    private String name;
    private String description;

    public RecipeItem(int image, String name, String description) {
        mImageResource = image;
        this.name = name;
        this.description = description;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
