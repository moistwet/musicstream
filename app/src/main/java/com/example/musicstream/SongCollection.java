package com.example.musicstream;

import static com.example.musicstream.album.favlist;

import android.util.Log;

public class SongCollection {
    //big list of all the songs in the app
    public static Song[] songs = new Song[34];
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

                //new song

                Song staythisway = new Song("S1019", "Stay this way", "Fromis_9",
                        "https://p.scdn.co/mp3-preview/9b0d2912430289ce25d581db603ae1ced20fb778?cid=2afe87a64b0042dabf51f37318616965",
                        3.26, R.drawable.staythisway);

                //thursdays minisode

                Song openingsequence = new Song("S1020", "opening sequence" , "Tommorrow By togather",
                        "https://p.scdn.co/mp3-preview/355323e998aa099a508dac1d98ac28b52662f719?cid=2afe87a64b0042dabf51f37318616965",
                        2.97, R.drawable.txt);

                Song goodboygonebad = new Song("S1021", "Good Boy Gone Bad", "Tommorow By togather",
                        "https://p.scdn.co/mp3-preview/cacf4e1c9786669888eaf0b4d405c33368e3245b?cid=2afe87a64b0042dabf51f37318616965",
                        3.18, R.drawable.txt);

                Song trustfundbaby = new Song("S1022", "Trust Fun Baby", "Tommorow By togather",
                        "https://p.scdn.co/mp3-preview/be90487e08577e96e194604a591643a46d61ba21?cid=2afe87a64b0042dabf51f37318616965",
                        3.01, R.drawable.txt);

                Song lonelyboy = new Song("S1023", "Lonely Boy", "Tommorow By togather",
                        "https://p.scdn.co/mp3-preview/94df5e2419aeb9a82fd978563d1179fe5e994a3a?cid=2afe87a64b0042dabf51f37318616965",
                        3.21, R.drawable.txt);

                Song thursdayschildhasfartogo = new Song("S1024", "Thursday's child has far to go", "Tommorow By togather",
                        "https://p.scdn.co/mp3-preview/ca2a81aff06970748c93b4b56390b2fac4fa1f9e?cid=2afe87a64b0042dabf51f37318616965",
                        3.52, R.drawable.txt);

                //loveyourself tear

                Song introsingularity = new Song("S1025", "Intro: Singularity", "BTS",
                        "https://p.scdn.co/mp3-preview/59659bb8aba27231bf3a1530ad9592b8e8c872f9?cid=2afe87a64b0042dabf51f37318616965",
                        3.28, R.drawable.tear);

                Song fakelove = new Song("S1026", "Fake Love", "BTS",
                        "https://p.scdn.co/mp3-preview/ba2f6a0afc23bf9f804c233d3e587009e52a14c2?cid=2afe87a64b0042dabf51f37318616965",
                        4.04, R.drawable.tear);

                Song thetruthuntold = new Song("S1027", "The Truth Untold (feat. Steve Aoki)", "BTS",
                        "https://p.scdn.co/mp3-preview/893cee7ac1b37e0d102320c82052fdff01b09dd4?cid=2afe87a64b0042dabf51f37318616965",
                        4.04, R.drawable.tear);

                Song onethreefourthreefour = new Song("S1028", "134340", "BTS",
                        "https://p.scdn.co/mp3-preview/ba1acaaefdbc91573e6ef6f3a9644b8c0f938d76?cid=2afe87a64b0042dabf51f37318616965",
                        4.23, R.drawable.tear);

                Song Paradise = new Song("S1029", "Paradise", "BTS",
                        "https://p.scdn.co/mp3-preview/542ae410d05c22f6a75f84fb20c6ea856f190aac?cid=2afe87a64b0042dabf51f37318616965",
                        3.52, R.drawable.tear);

                Song lovemaze = new Song("S1030", "Love Maze", "BTS",
                        "https://p.scdn.co/mp3-preview/6c4205f4fa495856cedbe8a4ba3d01d89d5f58a4?cid=2afe87a64b0042dabf51f37318616965",
                        4.19, R.drawable.tear);

                Song magicshop = new Song("S1031", "Magic Shop", "BTS",
                        "https://p.scdn.co/mp3-preview/8a84d3b9d5252ed45c87a3b865926c2537ac6cc6?cid=2afe87a64b0042dabf51f37318616965",
                        4.59, R.drawable.tear);

                Song airplanept2 = new Song("S1032", "Ariplane pt.2", "BTS",
                        "https://p.scdn.co/mp3-preview/20a977a5d9f2f71b1de174c7890c247a29e74630?cid=2afe87a64b0042dabf51f37318616965",
                        4.04, R.drawable.tear);

                Song anpanman = new Song("S1033", "Anpanman", "BTS",
                        "https://p.scdn.co/mp3-preview/8d213a599d989ed14686a9051cb406e725b32d75?cid=2afe87a64b0042dabf51f37318616965",
                        4.28, R.drawable.tear);

                Song sowhat = new Song("S1034", "So What", "BTS",
                        "https://p.scdn.co/mp3-preview/d2ac125318a419e49b05dbbf5066571c69f04948?cid=2afe87a64b0042dabf51f37318616965",
                        5.09, R.drawable.tear);




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
                songs[18]= staythisway;
                songs[19]= openingsequence;
                songs[20]= goodboygonebad;
                songs[21]= trustfundbaby;
                songs[22]= lonelyboy;
                songs[23]= thursdayschildhasfartogo;
                songs[24]= introsingularity;
                songs[25]= fakelove;
                songs[26]= thetruthuntold;
                songs[27]= onethreefourthreefour;
                songs[28]= Paradise;
                songs[29]= lovemaze;
                songs[30]= magicshop;
                songs[31]= airplanept2;
                songs[32]= anpanman;
                songs[33]= sowhat;


            }



    //gets current song ID
    public Song getCurrentSong(int currentSongId){

        return songs[currentSongId] ;
    }

    //searches the song id
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

    //searches the songs id
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

    //gets the next song id
    public int getNextSong(int currentSongIndex){
        if (currentSongIndex >= songs.length-1){
            return currentSongIndex;
        }
        else{
            return currentSongIndex +1;
        }
    }

    //gets the previous song id
    public int getPrevSong(int currentSongIndex){
        if( currentSongIndex <= 0){
            return currentSongIndex;
        }
        else{
            return currentSongIndex-1;
        }
    }

}

