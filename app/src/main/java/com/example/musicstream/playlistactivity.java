package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class playlistactivity extends AppCompatActivity {
RecyclerView favList;
SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlistactivity);
        favList = findViewById(R.id.recycleView);

        songAdapter = new SongAdapter(persona_album.favlist);
        favList.setAdapter(songAdapter);
        favList.setLayoutManager(new LinearLayoutManager(this));


    }
}