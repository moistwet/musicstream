package com.example.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SongCollection songcollection = new SongCollection();
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //sets theme of loading screen to pixel 2 wallpaper
        setTheme(R.style.loadingTheme);
        setContentView(R.layout.activity_main);

        //bottom navigation code
        bottomNavigationView = findViewById(R.id.bottomnav);
        //links home id in xml file to this class
        bottomNavigationView.setSelectedItemId(R.id.home);
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




    public void handleSelection(View view) {
        //gets image id
        String resourceId = getResources().getResourceEntryName(view.getId());
        int currentArrayIndex = songcollection.searchSongById(resourceId);
        Log.d("ALERT", "handleSelection:" + currentArrayIndex);
        sendDataToActivity(currentArrayIndex);

    }

    public void sendDataToActivity(int index){
        //sends from activity before to PlaySongActivity.class
        Intent intent = new Intent(this, PlaySongActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }










    }

