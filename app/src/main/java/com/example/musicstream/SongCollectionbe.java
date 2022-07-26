package com.example.musicstream;

public class SongCollectionbe {
    public Song songs[] = new Song[7];
            public SongCollectionbe() {
            Song lifegoeson = new Song("S1001", "1.Life goes on", "BTS",
                    "https://p.scdn.co/mp3-preview/5827da47ea5ef2d768e7f9dc8226182080c7a99f?cid=2afe87a64b0042dabf51f37318616965",
                    3.46, R.drawable.lifegoeson);
            Song flytomyroom = new Song("S1002", "2.Fly to my room", "BTS",
                    "https://p.scdn.co/mp3-preview/a8f86aa9bb9aa5efe09f90866a9e98eb60170f98?cid=2afe87a64b0042dabf51f37318616965",
                    4.10, R.drawable.lifegoeson);
            Song blueandgrey = new Song("S1003", "3.Blue and grey", "BTS",
                    "https://p.scdn.co/mp3-preview/a8f86aa9bb9aa5efe09f90866a9e98eb60170f98?cid=2afe87a64b0042dabf51f37318616965",
                    4.25, R.drawable.lifegoeson);
            Song skit = new Song("S1004", "4.Skit", "BTS",
                    "https://p.scdn.co/mp3-preview/852381641e90511fa3d0b9336110437a736bcee0?cid=2afe87a64b0042dabf51f37318616965",
                    3.33, R.drawable.lifegoeson);
            Song telepathy = new Song("S1005", "5.telepathy", "BTS",
                    "https://p.scdn.co/mp3-preview/48bea9a190001ae14178968d2f324bab8538812b?cid=2afe87a64b0042dabf51f37318616965",
                    3.37, R.drawable.lifegoeson);
            Song disease = new Song("S1006", "5.disease", "BTS",
                    "https://p.scdn.co/mp3-preview/f2c9fdc6239cbff949acbaffe7f097355651aa8c?cid=2afe87a64b0042dabf51f37318616965",
                    4.00, R.drawable.lifegoeson);
            Song Stay = new Song("S1007", "5.Stay", "BTS",
                    "https://p.scdn.co/mp3-preview/75f9c6c873d3c1876f5aa39663e7fb59bc06b4ee?cid=2afe87a64b0042dabf51f37318616965",
                    3.41, R.drawable.lifegoeson);







            songs[0]= lifegoeson;
            songs[1]= flytomyroom;
            songs[2]= blueandgrey;
            songs[3]= skit;
            songs[4]= telepathy;
            songs[5]= disease;
            songs[6]= Stay;



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




