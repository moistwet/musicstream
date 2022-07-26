package com.example.musicstream;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<Myview> {

    public SongAdapter(List<Song> songs) {
        this.songs = songs;
    }

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
    public void onBindViewHolder(@NonNull Myview holder,final int position) {
        Song song = songs.get(position);
        TextView artist = holder.titleArtist;
        artist.setText(song.getArtiste());
        TextView title = holder.titleTxt;
        title.setText(song.getTitle());
        int imageId= song.getDrawable();
        holder.image.setImageResource(imageId);
        holder.removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                persona_album.favlist.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
