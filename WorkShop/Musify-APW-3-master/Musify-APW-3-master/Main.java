package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        MusicData pop1 = new MusicData("UnStoppable","Sia","2016");
        MusicData pop2 = new MusicData("Shape of you","Ed Sheeren", "2017");
        MusicData Jazz1= new MusicData("J1","unKnown","2021");
        MusicData Jazz2= new MusicData("J3","unKnown1","2020");
        MusicData Jazz3= new MusicData("J2","unKnown2","2019");
        MusicData r1= new MusicData("R1","unKnown4","2018");
        MusicData c1= new MusicData("C1","unKnown5","2010");
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        //add part
        pop.addFile(pop1);
        pop.addFile(pop2);
        System.out.println("Pop Collection");
        pop.listAllFiles();
        jazz.addFile(Jazz1);
        jazz.addFile(Jazz2);
        jazz.addFile(Jazz3);
        System.out.println("Jazz Collection");
        jazz.listAllFiles();
        rock.addFile(r1);
        System.out.println("Rock Collection");
        rock.listAllFiles();
        country.addFile(c1);
        System.out.println("Country Collection");
        country.listAllFiles();
        //******************************
        //Favorite part
        MusicCollection favarite=new MusicCollection();
        favarite.addFile(pop1);
        favarite.addFile(c1);
        favarite.addFile(Jazz1);
        System.out.println("\nFavorite:");
        favarite.listAllFiles();
        //*******************************
        //number of files
        System.out.println("Number of pop songs: "+pop.getNumberOfFiles());
        //*******************************
        //get file
        jazz.listFile(2);
        //******************************
        //remove
        System.out.println("\nRemoving part");
        favarite.listAllFiles();
        favarite.removeFile(0);
        favarite.listAllFiles();
        //*****************************
        //play
        pop.startPlaying(0);
        //******************************
        //stop
        pop.stopPlaying();
        //*******************************
        //index
        boolean w=pop.validIndex(8);
        //*******************************
        //Search
        jazz.searchlist("J1");
        pop.searchlist("Pop");
    }
}
