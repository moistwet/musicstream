package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SearchView;


public class playlistactivity extends AppCompatActivity {
RecyclerView favList;
SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlistactivity);
        //connects favlist variable to recycleView in xml file
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



    }


    //remove all songs in favourite playlist
    public void RemoveAll (View view){
        album.favlist.clear();
        songAdapter.notifyDataSetChanged();
    }
}