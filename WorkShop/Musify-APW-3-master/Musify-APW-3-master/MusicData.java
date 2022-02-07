package com.company;

/**
 * Music Identity
 * @author Samin
 * @
 */
public class MusicData {
    public String music;
    public String Artist;
    public String Pyear;

    /**
     *
     * @param Artist who?
     * @param Pyear  When?
     */
    public MusicData(String music,String Artist,String Pyear) {
        this.music=music;
        this.Artist = Artist;
        this.Pyear=Pyear;
    }

    /**
     *
     * @return music
     */
    public String getMusic() {
        return music;
    }

    /**
     *
     * @param music name
     */
    public void setMusic(String music) {
        this.music = music;
    }

    /**
     *
     * @return Artist
     */
    public String getArtist() {
        return Artist;
    }

    /**
     *
     * @param artist name
     */
    public void setArtist(String artist) {
        Artist = artist;
    }

    /**
     *
     * @return year
     */
    public String getPyear() {
        return Pyear;
    }

    /**
     *
     * @param pyear Publish year
     */
    public void setPyear(String pyear) {
        Pyear = pyear;
    }
}
