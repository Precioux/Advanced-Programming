package com.company;
/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private MusicData music;
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {

        isPlaying = false;
    }

    /**
     *
     * @return music
     */
    public MusicData getMusic() {
        return music;
    }

    /**
     *
     * @param music data add
     */
    public void setMusic(MusicData music) {
        this.music = music;
    }

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param music The file to be played.
     */
    public void startPlaying(MusicData music)
    {
        System.out.println(music.getMusic() + " is playing...");
        isPlaying = true;
    }
    public void stop()
    {
        System.out.println("player is stopped!");
        isPlaying = false;
    }



}