package com.example.musicstream;

public class SongCollectionpersona {
    public Song songs[] = new Song[7];
            public SongCollectionpersona() {
            Song Persona = new Song("S1001", "1.Persona", "BTS",
                    "https://p.scdn.co/mp3-preview/5549a1b94670811519b70c33d8f40029d07a3e22?cid=2afe87a64b0042dabf51f37318616965",
                    3.25, R.drawable.persona);

            Song BoyWithLuv = new Song("S1002", "Boy with Luv", "BTS",
                    "https://p.scdn.co/mp3-preview/93add0cd36cfa7f830f38b1125d5e73c87a08b82?cid=2afe87a64b0042dabf51f37318616965",
                    3.23, R.drawable.persona);

            Song Mikrokosmos = new Song("S1003", "Mikrokosmos", "BTS",
                    "https://p.scdn.co/mp3-preview/94f64f836d7bc47e770b8869c3814fe691b0d6a1?cid=2afe87a64b0042dabf51f37318616965",
                    3.14, R.drawable.persona);

            Song MakeItRight = new Song("S1004", "Make It Right", "BTS",
                    "https://p.scdn.co/mp3-preview/1d84fe05e1fa9a2cab27fc14074abaeb73966fd1?cid=2afe87a64b0042dabf51f37318616965",
                    4.17, R.drawable.persona);

            Song Home = new Song("S1005", "Home", "BTS",
                    "https://p.scdn.co/mp3-preview/cdb595939e53669b62e9431ea066d423b8262b22?cid=2afe87a64b0042dabf51f37318616965",
                    4.30, R.drawable.persona);

            Song JamaisVu = new Song("S1006", "Jamais Vu", "BTS",
                    "https://p.scdn.co/mp3-preview/66826149cbd868d461e4b78d457c6291c794159f?cid=2afe87a64b0042dabf51f37318616965",
                    4.19, R.drawable.persona);

            Song Dionysus = new Song("S1007", "Dionysus", "BTS",
                    "https://p.scdn.co/mp3-preview/25b4f5cedd3edec85b88d7283e6ec6cea8ada6d6?cid=2afe87a64b0042dabf51f37318616965",
                    4.15, R.drawable.persona);







            songs[0]= Persona;
            songs[1]= BoyWithLuv;
            songs[2]= Mikrokosmos;
            songs[3]= MakeItRight;
            songs[4]= Home;
            songs[5]= JamaisVu;
            songs[6]= Dionysus;


            }




    public Song getCurrentSong(int currentSongId){

        return songs[currentSongId] ;
    }

    public int searchSongById(String id){
        for(int index=0; index < songs.length;index++){
            Song tempSong = songs[index];
            String tempId = tempSong.getId();
            if(tempSong.getId().equals(id)){
                return index;
            }
        }
        return -1;

    }

    public Song searchById(String id){
                Song tempSong = null;
        for (int i = 0; i < songs.length; i++) {
           tempSong = songs[i];
           String tempId =tempSong.getId();
           if (tempId.equals(id)){
               return tempSong;
           }
        }
        return tempSong;
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




