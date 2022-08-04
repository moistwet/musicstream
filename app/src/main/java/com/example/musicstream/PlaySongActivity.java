package com.example.musicstream;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PlaySongActivity extends AppCompatActivity {
    private String title = "";
    private String artiste = "";
    private String filelink = "";
    private double songLength = 0;
    private int drawable;
    private int currentindex = -1;

    private MediaPlayer player = new MediaPlayer();
    private Button btnPlayPause = null;
    private SongCollection songCollection = new SongCollection();
    private SongCollection originalsongCollection = new SongCollection();
    List<Song> shufflelist = Arrays.asList(songCollection.songs);
    SeekBar seekBar;
    Handler handler = new Handler();
    Button repeatBtn;
    Button shuffleBtn;
    Boolean repeatFlag = false;
    Boolean shuffleFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);


        btnPlayPause = findViewById(R.id.btnPlayPause);
        Bundle songData = this.getIntent().getExtras();
        currentindex = songData.getInt("index");
        int index = songData.getInt("Index");
        Log.d("ALERT", "we recv:" + currentindex);
        displaySongBasedOnIndex();

        //progress bar
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (player != null && player.isPlaying()){
                    player.seekTo(seekBar.getProgress());
                }

            }
        });
        repeatBtn = findViewById(R.id.repeatBtnn);
        shuffleBtn = findViewById(R.id.shufflebtn);
        playsong(filelink);

    }

    //progress bar code
    Runnable pbar = new Runnable(){
        @Override
        public void run() {
            if (player != null && player.isPlaying()){
                seekBar.setProgress(player.getCurrentPosition());
            }
            //everysecond the progress bar moves up
            handler.postDelayed(this, 1000);
            
        }
    };

    //takes all the Song list attributes to replace the txtSongTitle,txtArtist,imgCoverArt
    public void displaySongBasedOnIndex() {
        Song song = songCollection.getCurrentSong(currentindex);
        title = song.getTitle();
        artiste = song.getArtiste();
        filelink = song.getFilelink();
        drawable = song.getDrawable();
        TextView txtTitle = findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);
        TextView txtArtiste = findViewById(R.id.txtArtist);
        txtArtiste.setText(artiste);
        ImageView CoverArt = findViewById(R.id.imgCoverArt);
        CoverArt.setImageResource(drawable);
    }

    //plays the song
    public void playsong(String songUrl){
        try {
            player.reset();
            player.setDataSource(songUrl);
            player.prepare();
            player.start();
            gracefullyStopsWhenMusicEnds();
            handler.postDelayed(pbar,1000);
            seekBar.setMax(player.getDuration());
            seekBar.setProgress(player.getCurrentPosition());
            btnPlayPause.setText("PAUSE");
            setTitle(title);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //resume and pause the music
    public void playOrPauseMusic(View view){
        if (player.isPlaying()) {//if player is playing
            //pause music here
            player.pause();
            btnPlayPause.setText("PLAY");}
        else {
            //play music here
            player.start();
            btnPlayPause.setText("PAUSE");
        }



    }
    //pauses the music when it ends
    private void gracefullyStopsWhenMusicEnds(){
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
        @Override
        public void onCompletion(MediaPlayer mp) {
            Toast.makeText(getBaseContext(), "The song has ended and the OnCompleteListener is now activated\n" +
                    "The button text is changed to 'PLAY'" , Toast.LENGTH_LONG).show();

            if (repeatFlag)
            {
                playOrPauseMusic(null);

            }
            else
            {
                //sets button text back to play
                btnPlayPause.setText("PLAY");
            }

            btnPlayPause.setText("PLAY");}
        });


    }

    //play next song
    public void playNext(View view) {
        currentindex = songCollection.getNextSong(currentindex);
        Toast.makeText(this, "After clicking playNext, \nthe current index of this song \n" +
                "in the SongCollection array is now :" + currentindex , Toast.LENGTH_LONG).show();
        Log.d("temasek", "After playNext, the index is now" +currentindex);
        displaySongBasedOnIndex();
        playsong(filelink);
    }

    //play previous song
    public void playPrevious(View view){
        currentindex = songCollection.getPrevSong(currentindex);
        Toast.makeText(this, "After clicking playPrevious, \n the current index of this song\n" +
                "in the SongCollection array is now :" + currentindex, Toast.LENGTH_LONG).show();
        Log.d("temasek", "After playprevious, the index is now:" + currentindex);
        displaySongBasedOnIndex();
        playsong(filelink);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        if (player != null){
            handler.removeCallbacks(pbar);
            player.stop();
            player.release();
            player = null;

        }
    }


    //repeats song
    public void repeatSong(View view) {
        if (repeatFlag){
            repeatBtn.setBackgroundResource(R.drawable.repeatoff);
        }
        else
        {
            repeatBtn.setBackgroundResource(R.drawable.repeaton);
        }
        repeatFlag = !repeatFlag;

    }


    //shuffles the song collection
    public void shuffleSong(View view) {
        if (shuffleFlag) {
            shuffleBtn.setBackgroundResource(R.drawable.shuffleoff);
            songCollection= new SongCollection();

        }
        else

        {


            shuffleBtn.setBackgroundResource(R.drawable.shuffleon);
            //shuffles the shuffle list
            Collections.shuffle(shufflelist);
            //list converts to array in song collection songs
            shufflelist.toArray(songCollection.songs);

        }


        shuffleFlag = !shuffleFlag;

    }
}