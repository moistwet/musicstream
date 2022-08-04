package com.example.musicstream;

public class Song {

    //calls all the variables used in the storing of a song in SongCollection class
    private String id;
    private String title;
    private String artiste;
    private String filelink;
    private double songLength;
    private int drawable;

    public Song(String id, String title, String artiste, String filelink, double songlength, int drawable){
        //intitalise the object
        this.id= id;
        this.title=title;
        this.artiste=artiste;
        this.filelink=filelink;
        this.songLength=songlength;
        this.drawable=drawable;
    }

    //getter
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getArtiste(){
        return artiste;
    }
    public String getFilelink(){
        return filelink;
    }
    public double getSongLength(){
        return songLength;
    }
    public int getDrawable(){
        return drawable;
    }

    //setters
    public void setId(String id){
        this.id= id;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public void setArtiste(String artiste){
        this.artiste=artiste;
    }
    public void setFilelink(String filelink){
        this.filelink=filelink;
    }
    public void setSongLength(double songLength){
        this.songLength=songLength;
    }
    public void setDrawable(int drawable){
        this.drawable=drawable;
    }

}
