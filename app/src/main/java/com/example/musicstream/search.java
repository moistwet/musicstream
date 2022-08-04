package com.example.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class search extends AppCompatActivity {
    RecyclerView favList;
    SongAdapter songAdapter;
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        favList = findViewById(R.id.recycleView);

        songAdapter = new SongAdapter(album.favlist);
        favList.setAdapter(songAdapter);
        favList.setLayoutManager(new LinearLayoutManager(this));
        //search view
        SearchView searchView = findViewById(R.id.searchview);
        //listens for text input in device
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //filters out to show songs of the text input
                songAdapter.getFilter().filter(newText);
                return false;
            }
        });

        //bottom navigation code
        //links home id in xml file to this class

        bottomNavigationView = findViewById(R.id.bottomnav);
        //links search id in xml file to this class
        bottomNavigationView.setSelectedItemId(R.id.search);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        //home leads to main activity class
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.library:
                        //library id leads to album class
                        startActivity(new Intent(getApplicationContext(),
                                album.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                        //search id leads to search class
                        startActivity(new Intent(getApplicationContext(),
                                search.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }

        });

    }



}

