package com.company;

import com.company.MusicData;
import com.company.MusicPlayer;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<MusicData> files;
   // private ArrayList<MusicData> favorite;
    // A player for the music files.
    private MusicPlayer player;


    /**
     * Constructor
     * Create a MusicCollection
     */
    public MusicCollection() {
        player = new MusicPlayer();
        files = new ArrayList<MusicData>();
       // favorite = new ArrayList<MusicData>();
    }

    /**
     * Add a file to the collection.
     *
     * @param music The file to be added.
     */
    public void addFile(MusicData music) {
      //  System.out.println("Enter music data:");
        files.add(music);
    }

    /**
     * @param musicData add to favorite
     */
   /* public void addfav(MusicData musicData) {
        System.out.println(musicData.music+" Marked as favorite!\n");
        favorite.add(musicData);
    }

    /**
     * @param music remove favorite
     */
  /*  public void removefav(MusicData music) {
        System.out.println("Remove from Favorite");
        favorite.remove(music);

    }

    /**
     * Favorite full list
     */
   /* public void listAllFav() {
        System.out.println("Full favorite List : ");
        System.out.println("**************************");
        for(MusicData element: favorite) {
            System.out.println("Name: " + element.music);
            System.out.println("Artist: "+element.Artist);
            System.out.println("Year: "+element.Pyear);
            System.out.println("**************************");
        }
    }
*/
    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
      //  System.out.println("Size of list is given:");
        int size = files.size();
        return size;
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        MusicData element=files.get(index);
        System.out.println("\nResult :");
        System.out.println("Name: " + element.music);
        System.out.println("Artist: "+element.Artist);
        System.out.println("Year: "+element.Pyear);

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        System.out.println("Full List : ");
        System.out.println("**************************");
        for(MusicData element: files) {
            System.out.println("Name: " + element.music);
            System.out.println("Artist: "+element.Artist);
            System.out.println("Year: "+element.Pyear);
            System.out.println("**************************");
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        //System.out.println("Remove part");
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        System.out.println("Start playing!");
        player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    public boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        int n = files.size();
        if (index < n && index >= 0)
            return true;
        else {
            System.out.println("Invalid Index!");
            return false;
        }

    }

    /**
     * @param name searching
     */
    void searchlist(String name) {
        int flag=0;
        for (MusicData element : files) {
            if (element.music.contains(name)) {
                flag=1;
                System.out.println("\nResult Found :");
                System.out.println("Name: " + element.music);
                System.out.println("Artist: "+element.Artist);
                System.out.println("Year: "+element.Pyear);
            }
        }
        if(flag==0)
            System.out.println("Not Found");
    }
}