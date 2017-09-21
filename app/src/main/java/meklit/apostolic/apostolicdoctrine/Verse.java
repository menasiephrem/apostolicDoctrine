package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class Verse {
    private String VERSE_ID;
    private String VERSE_DISPLAY;
    private String VERSE_STRING;


    public Verse(String VERSE_ID, String VERSE_DISPLAY, String VERSE_STRING) {
        this.VERSE_ID = VERSE_ID;
        this.VERSE_DISPLAY = VERSE_DISPLAY;
        this.VERSE_STRING = VERSE_STRING;
    }

    public String getVERSE_ID() {
        return VERSE_ID;
    }

    public String getVERSE_DISPLAY() {
        return VERSE_DISPLAY;
    }

    public String getVERSE_STRING() {
        return VERSE_STRING;
    }

    public static Verse [] verses = {

    };
}
