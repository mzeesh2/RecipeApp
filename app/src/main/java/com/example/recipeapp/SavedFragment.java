package com.example.recipeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SavedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SavedFragment extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<RecipeItem> recipes;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SavedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SavedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SavedFragment newInstance(String param1, String param2) {
        SavedFragment fragment = new SavedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recipes = new ArrayList<>();
        recipes.add(new RecipeItem(R.drawable.ic_recipe, "example name", "example description"));
        recipes.add(new RecipeItem(R.drawable.ic_recipe, "Shrimp & Snow Pear Stir Fry", "Tasty Sea Food"));
        recipes.add(new RecipeItem(R.drawable.ic_recipe, "Spicy Dal", "Very Spicy Dal"));
        recipes.add(new RecipeItem(R.drawable.ic_recipe, "Chocolate Covered Strawberries", "Fun valentine's day treat"));
        recipes.add(new RecipeItem(R.drawable.ic_recipe, "Homemade Philly Cheesesteaks", "Perfection!"));


        /*
        not sure if we need this code or not, will leave it here
         */
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_saved, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.fragmentRecyclerView);
        RecipeAdapter recipeAdapter = new RecipeAdapter(getContext(), recipes);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recipeAdapter);

        //Sets tile of page
        getActivity().setTitle("Saved Recipes");

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null) {

        }
    }
}