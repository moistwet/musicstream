package com.example.musicstream;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myview extends RecyclerView.ViewHolder {
    public TextView titleTxt;
    public TextView titleArtist;
    public ImageView image;
    public Button removeBtn;

    //calls out id titleTxt, titleartist, image and removeBtn to set it to link it to titleTxt, titleArtist, image, and removeBtn
    public Myview(@NonNull View itemView) {
        super(itemView);

        titleTxt = itemView.findViewById(R.id.titleTxt);
        titleArtist = itemView.findViewById(R.id.titleartist);
        image = itemView.findViewById(R.id.image);
        removeBtn = itemView.findViewById(R.id.removeBtn);
    }
}
