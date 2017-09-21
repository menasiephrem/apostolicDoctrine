package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/21/2017.
 */

public class Lang {
    private String LANG_ID;
    private String LANG_AMH;
    private String LANG_ENG;

    public Lang(String LANG_ID, String LANG_AMH, String LANG_ENG) {
        this.LANG_ID = LANG_ID;
        this.LANG_AMH = LANG_AMH;
        this.LANG_ENG = LANG_ENG;
    }

    public String getLANG_ID() {
        return LANG_ID;
    }

    public String getLANG_AMH() {
        return LANG_AMH;
    }

    public String getLANG_ENG() {
        return LANG_ENG;
    }

    public static Lang [] langs ={

    };
}
