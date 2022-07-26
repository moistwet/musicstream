package com.example.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class album extends AppCompatActivity {
    SongCollection songcollection = new SongCollection();
    static ArrayList<Song> favlist = new ArrayList<>();
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
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

    public void handleSelection(View view) {
        //gets image id "S1001"
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songcollection.searchSongById(resourceId);
        Log.d("ALERT", "handleSelection:" + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);

    }

    public void sendDataToActivity(int index){
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }



    public void btsalbumpage(View myView)
    {
        Intent intent = new Intent(album.this,bts_album.class);
        startActivity(intent);
    }

    public void smalbumpage(View myView)
    {
        Intent intent = new Intent(album.this,sm_album.class);
        startActivity(intent);
    }

    public void personaalbumpage(View myView)
    {
        Intent intent = new Intent(album.this,persona_album.class);
        startActivity(intent);
    }
    public void bealbumpage(View myView)
    {
        Intent intent = new Intent(album.this,be_album.class);
        startActivity(intent);
    }

    public void gotofavact(View view)
    {
        Intent intent = new Intent(album.this,playlistactivity.class);
        startActivity(intent);
        for (int i = 0; i < favlist.size(); i++) {
            Log.d("temasek",favlist.get(i).getTitle());


        }
    }

}