package com.example.musicstream;

public class SongCollectionbts {
    public Song songs[] = new Song[3];
            public SongCollectionbts() {
            Song Butter = new Song("S1001", "1.Butter", "BTS",
                    "https://p.scdn.co/mp3-preview/e93bc746bea9688b7b1ac5648cd678f74a0d1933?cid=2afe87a64b0042dabf51f37318616965",
                    3.00, R.drawable.butter);


            Song BlackSwan = new Song("S1002", "2.Black Swan", "BTS",
                    "https://p.scdn.co/mp3-preview/99b36846f15dc3d2363b439972695ce824f1221e?cid=2afe87a64b0042dabf51f37318616965",
                    3.30, R.drawable.blackswancover);

            Song lifegoeson = new Song("S1003", "3.Life goes on", "BTS",
                    "https://p.scdn.co/mp3-preview/5827da47ea5ef2d768e7f9dc8226182080c7a99f?cid=2afe87a64b0042dabf51f37318616965",
                    3.46, R.drawable.lifegoeson);





            songs[0]= Butter;
            songs[1]= BlackSwan;
            songs[2]= lifegoeson;

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




