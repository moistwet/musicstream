package com.example.musicstream;

import static com.example.musicstream.album.favlist;

import android.util.Log;

public class SongCollection {
    public static Song[] songs = new Song[18];
            public SongCollection() {
                //be album
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

                //persona album
                Song Persona = new Song("S1008", "1.Persona", "BTS",
                        "https://p.scdn.co/mp3-preview/5549a1b94670811519b70c33d8f40029d07a3e22?cid=2afe87a64b0042dabf51f37318616965",
                        3.25, R.drawable.persona);

                Song BoyWithLuv = new Song("S1009", "Boy with Luv", "BTS",
                        "https://p.scdn.co/mp3-preview/93add0cd36cfa7f830f38b1125d5e73c87a08b82?cid=2afe87a64b0042dabf51f37318616965",
                        3.23, R.drawable.persona);

                Song Mikrokosmos = new Song("S1010", "Mikrokosmos", "BTS",
                        "https://p.scdn.co/mp3-preview/94f64f836d7bc47e770b8869c3814fe691b0d6a1?cid=2afe87a64b0042dabf51f37318616965",
                        3.14, R.drawable.persona);

                Song MakeItRight = new Song("S1011", "Make It Right", "BTS",
                        "https://p.scdn.co/mp3-preview/1d84fe05e1fa9a2cab27fc14074abaeb73966fd1?cid=2afe87a64b0042dabf51f37318616965",
                        4.17, R.drawable.persona);

                Song Home = new Song("S1012", "Home", "BTS",
                        "https://p.scdn.co/mp3-preview/cdb595939e53669b62e9431ea066d423b8262b22?cid=2afe87a64b0042dabf51f37318616965",
                        4.30, R.drawable.persona);

                Song JamaisVu = new Song("S1013", "Jamais Vu", "BTS",
                        "https://p.scdn.co/mp3-preview/66826149cbd868d461e4b78d457c6291c794159f?cid=2afe87a64b0042dabf51f37318616965",
                        4.19, R.drawable.persona);

                Song Dionysus = new Song("S1014", "Dionysus", "BTS",
                        "https://p.scdn.co/mp3-preview/25b4f5cedd3edec85b88d7283e6ec6cea8ada6d6?cid=2afe87a64b0042dabf51f37318616965",
                        4.15, R.drawable.persona);


                //bts artist playlist
                Song Butter = new Song("S1015", "1.Butter", "BTS",
                        "https://p.scdn.co/mp3-preview/e93bc746bea9688b7b1ac5648cd678f74a0d1933?cid=2afe87a64b0042dabf51f37318616965",
                        3.00, R.drawable.butter);


                Song BlackSwan = new Song("S1016", "2.Black Swan", "BTS",
                        "https://p.scdn.co/mp3-preview/99b36846f15dc3d2363b439972695ce824f1221e?cid=2afe87a64b0042dabf51f37318616965",
                        3.30, R.drawable.blackswancover);


                //sm album
                Song alliwanttodo = new Song("S1017", "1.All i want to do", "Jay park",
                        "https://p.scdn.co/mp3-preview/ce3c04c93e3f03c0c010087a4afb4dbb29345774?cid=2afe87a64b0042dabf51f37318616965",
                        3.61, R.drawable.alliwanttodo);

                Song ganadara = new Song("S1018", "2.ganadara", "Jaypark",
                        "https://p.scdn.co/mp3-preview/458059573f7ac96a72702d9248477b48e9a204f0?cid=2afe87a64b0042dabf51f37318616965",
                        3.40, R.drawable.ganadara);


                songs[0]= lifegoeson;
                songs[1]= flytomyroom;
                songs[2]= blueandgrey;
                songs[3]= skit;
                songs[4]= telepathy;
                songs[5]= disease;
                songs[6]= Stay;
                songs[7]= Persona;
                songs[8]= BoyWithLuv;
                songs[9]= Mikrokosmos;
                songs[10]= MakeItRight;
                songs[11]= Home;
                songs[12]= JamaisVu;
                songs[13]= Dionysus;
                songs[14]= Butter;
                songs[15]= BlackSwan;
                songs[16]= alliwanttodo;
                songs[17]= ganadara;


            }




    public Song getCurrentSong(int currentSongId){

        return songs[currentSongId] ;
    }

    public int searchSongById(String id)
    {
        for(int index = 0; index < songs.length; index++)
        {
            Song tempSong = songs[index];
            if (tempSong.getId().equals(id))
            {
                return index;
            }
        }
        return -1;
    }
    public static Song searchById(String id){
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

