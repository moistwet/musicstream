package com.example.musicstream;

import android.widget.TextView;

public class SongCollection {
    public Song songs[] = new Song[5];
            public SongCollection() {
            Song Butter = new Song("S1002", "2.Butter", "BTS",
                    "https://p.scdn.co/mp3-preview/e93bc746bea9688b7b1ac5648cd678f74a0d1933?cid=2afe87a64b0042dabf51f37318616965",
                    3.00, R.drawable.butter);

            Song BillieJean = new Song("S1001", " 1.Billie Jean", "Michael Jackson",
                    "https://p.scdn.co/mp3-preview/6bc16eec6d10da63a03860070cf6d625936d68f2?cid=2afe87a64b0042dabf51f37318616965",
                    4.90, R.drawable.billie_jean);

            Song BlackSwan = new Song("S1003", "3.Black Swan", "BTS",
                    "https://p.scdn.co/mp3-preview/99b36846f15dc3d2363b439972695ce824f1221e?cid=2afe87a64b0042dabf51f37318616965",
                    3.30, R.drawable.blackswancover);

            Song lifegoeson = new Song("S1004", "4.Life goes on", "BTS",
                    "https://p.scdn.co/mp3-preview/5827da47ea5ef2d768e7f9dc8226182080c7a99f?cid=2afe87a64b0042dabf51f37318616965",
                    3.46, R.drawable.lifegoeson);

            Song staythisway = new Song("S1005", "5.Stay this way", "Fromis_9",
                    "https://p.scdn.co/mp3-preview/9b0d2912430289ce25d581db603ae1ced20fb778?cid=2afe87a64b0042dabf51f37318616965",
            3.26, R.drawable.staythisway);


            songs[0]= BillieJean;
            songs[1]= Butter;
            songs[2]= BlackSwan;
            songs[3]= lifegoeson;
            songs[4]= staythisway;
            }




    public Song getCurrentSong(int currentSongId){

        return songs[currentSongId] ;
    }

    public int searchSongById(String id){
        for(int index=0; index < songs.length;index++){
            Song tempSong = songs[index];
            if(tempSong.getId().equals(id)){
                return index;
            }
        }
        return -1;

    }

    public int getNextSong(int currentSongIndex){
                if (currentSongIndex >= songs.length-1){
                    return currentSongIndex;
                }
                else{
                    return currentSongIndex +1;
                }
    }

    public int getPrevSong(int currentSongIndex){
                if( currentSongIndex <= 0){
                    return currentSongIndex;
                }
                else{
                    return currentSongIndex-1;
                }
    }

    }




