package com.example.musicstream;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//search implement filterable
public class SongAdapter extends RecyclerView.Adapter<Myview> implements Filterable {
    public SongAdapter(ArrayList<Song> songs) {
        this.songs = songs;
        this.songsFiltered = songs;
    }
    List<Song> songsFiltered;
    List<Song> songs;
    Context context;

    @NonNull
    @Override
    public Myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View songView= inflater.inflate(R.layout.item_song,parent,false);
        Myview viewholder = new Myview(songView);

        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myview holder, @SuppressLint("RecyclerView") int position) {
        //replaces titleArtist, titleTxt and image button to selected song titleArtist titleTxt and image button thats added in playlist
        Song song = songsFiltered.get(position);
        TextView artist = holder.titleArtist;
        artist.setText(song.getArtiste());
        TextView title = holder.titleTxt;
        title.setText(song.getTitle());
        int imageId= song.getDrawable();
        holder.image.setImageResource(imageId);
        holder.removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //onclick function of remove button
            public void onClick(View view) {
                //removes position of song id that remove button is linked to
                album.favlist.remove(position);
                //updates json to new favlist after removal of position of song id
                Gson gson = new Gson();
                String json = gson.toJson(album.favlist);
                SharedPreferences.Editor editor = album.sharedPreferences.edit();
                editor.putString("list", json);
                editor.apply();
                String albums = album.sharedPreferences.getString("list","");
                notifyDataSetChanged();


            }
        });


    }

    @Override
    public int getItemCount() {
        return songsFiltered.size();
    }

    //search

    @Override
    public Filter getFilter() {
        return  new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                //if no input, songs filtered equals all songs
                if(charString.isEmpty()){
                    songsFiltered=songs;
                }
                else {
                    //if there is input, get songs that are under input for title
                    List<Song> filteredList = new ArrayList<Song>();
                    for (int i = 0; i < songs.size(); i++) {
                        if (songs.get(i).getTitle().toLowerCase().contains(charString.toLowerCase())){
                            filteredList.add((songs.get(i)));
                        }


                    }
                    songsFiltered= filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values= songsFiltered;
                return filterResults;
            }

            @Override
            //changes list to results of search
            protected void publishResults(CharSequence constraint, FilterResults results) {
                songsFiltered = (List<Song>) results.values;
                notifyDataSetChanged();

            }
        };

    }
}
