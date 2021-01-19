package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button savedRecipesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        savedRecipesButton = (Button) findViewById(R.id.button);
        savedRecipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSavedRecipes();
            }
        });
    }

    public void openSavedRecipes() {
        Intent intent = new Intent(this, SavedRecipes.class);
        startActivity(intent);
    }

}