package com.example.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class album extends AppCompatActivity {
    SongCollection songCollection = new SongCollection();
    static ArrayList<Song> favlist = new ArrayList<>();
    BottomNavigationView bottomNavigationView;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        sharedPreferences = getSharedPreferences("Playlist", MODE_PRIVATE);
        String albums = sharedPreferences.getString("list", "");
        if (!albums.equals(""))
        {
            TypeToken<ArrayList<Song>> token = new TypeToken<ArrayList<Song>>(){};
            Gson gson = new Gson();
            favlist = gson.fromJson(albums, token.getType());
        }
        bottomNavigationView = findViewById(R.id.bottomnav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.library:
                        startActivity(new Intent(getApplicationContext(),
                                album.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }

        });
    }

    public void handleSelection(View myView) {
        String resourceId = getResources().getResourceEntryName(myView.getId());
        int currentArrayIndex = songCollection.searchSongById(resourceId);
        Log.d("ALERT", "The current array position is: " + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);
    }

    public void sendDataToActivity(int index){
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }



    public void btsalbumpage(View myView)
    {
        setContentView(R.layout.activity_bts_album);
    }

    public void smalbumpage(View myView)
    {
        setContentView(R.layout.activity_sm_album);
    }

    public void personaalbumpage(View myView)
    {
        setContentView(R.layout.activity_persona_album);
    }
    public void bealbumpage(View myView)
    {
        setContentView(R.layout.activity_be_album);
    }

    public void gotofavact(View view)
    {
        Intent intent = new Intent(album.this,playlistactivity.class);
        startActivity(intent);
        for (int i = 0; i < favlist.size(); i++) {
            Log.d("temasek",favlist.get(i).getTitle());


        }
    }

    public void addtofav(View view) {
        String songid = view.getContentDescription().toString();
        //collects song id and converts to string
        Song song = SongCollection.searchById(songid);
        Log.d("temasek", song.toString());
        album.favlist.add(song);
        Log.d("temasek",album.favlist.toString());
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Gson gson = new Gson();
        String json = gson.toJson(favlist);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString("list", json);
        editor.apply();
        Log.d("gson",json);
    }

}