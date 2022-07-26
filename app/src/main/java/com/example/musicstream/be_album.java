package com.example.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class be_album extends AppCompatActivity {
    SongCollectionbe songCollectionbe = new SongCollectionbe();
    ArrayList<Song> favlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_album);
    }

    public void handleSelection(View view) {
        //gets image id "S1001"
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songCollectionbe.searchSongById(resourceId);
        Log.d("ALERT", "handleSelection:" + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);

    }

    public void sendDataToActivity(int index){
        Intent intent = new Intent(this, playbesongactivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }

    public void addtofav(View view) {
        String songid = view.getContentDescription().toString();
        //collects song id and converts to string
        //Song song = songcollection.searchSongById(songid);
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
    }


}