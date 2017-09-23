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
            new Verse("Is66:1", "Is66:1Display", "Is66:1String"),
            new Verse("Ps139:7-10", "Ps139:7-10Display", "Ps139:7-10String"),
            new Verse("Jobs11", "Jobs11Display", "Jobs11String"),
            new Verse("1stkng8:12,13", "1stkng8:12,13Display", "1stkng8:12,13String"),
            new Verse("jn1:1", "jn1:1Display", "jn1:1String"),
            new Verse("hb1:2", "hb1:2Display", "hb1:2String"),
            new Verse("is53", "is53Display", "is53String"),
            new Verse("ps107:20", "ps107:20Display", "ps107:20String"),
            new Verse("1stjn4:12", "1stjn4:12Display", "1stjn4:12String"),
            new Verse("is55:11", "is55:11Display", "is55:11String"),
            new Verse("Jer23:23", "Jer23:23Display", "Jer23:23String"),
            new Verse("1stpt1:11", "1stpt1:11Display", "1stpt1:11String")

    };
}
