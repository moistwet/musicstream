package com.example.musicstream;

public class SongCollectionsm {
    public Song songs[] = new Song[2];
            public SongCollectionsm() {
            Song alliwanttodo = new Song("S1001", "1.All i want to do", "Jay park",
                    "https://p.scdn.co/mp3-preview/ce3c04c93e3f03c0c010087a4afb4dbb29345774?cid=2afe87a64b0042dabf51f37318616965",
                    3.61, R.drawable.alliwanttodo);

            Song ganadara = new Song("S1002", "2.ganadara", "Jaypark",
                    "https://p.scdn.co/mp3-preview/458059573f7ac96a72702d9248477b48e9a204f0?cid=2afe87a64b0042dabf51f37318616965",
                    3.40, R.drawable.ganadara);





            songs[0]=alliwanttodo;
            songs[1]=ganadara;

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




