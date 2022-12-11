package com.example.mysuperheroes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mysuperheroes.R;
import com.example.mysuperheroes.adapters.SH_RecyclerViewAdapter;
import com.example.mysuperheroes.models.SuperHeroModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<SuperHeroModel> superHeroModels = new ArrayList<>();

    int[] superHeroesImages = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,
            R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setUpSuperHeroModels();

        SH_RecyclerViewAdapter adapter = new SH_RecyclerViewAdapter(this, superHeroModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpSuperHeroModels () {

        String[] superHeroesNames = getResources().getStringArray(R.array.SuperHero_name);
        String[] superHeroesDescription = getResources().getStringArray(R.array.SuperHero_description);

        for (int i = 0; i < superHeroesNames.length; i++) {
            superHeroModels.add(new SuperHeroModel(superHeroesNames[i],
                    superHeroesDescription[i],
                    superHeroesImages[i]));
        }
    }
}