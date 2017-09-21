package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class Module {

    private String MODULE_ID;
    private String MODULE_TITLE;
    private String MODULE_STARTING_LESSON;
    private String MODULE_CURRENT_LESSON;
    private String MODULE_COVER_STAT;

    public Module(String MODULE_ID, String MODULE_TITLE, String MODULE_STARTING_LESSON,
                   String MODULE_COVER_STAT) {
        this.MODULE_ID = MODULE_ID;
        this.MODULE_TITLE = MODULE_TITLE;
        this.MODULE_STARTING_LESSON = MODULE_STARTING_LESSON;
        this.MODULE_CURRENT_LESSON = MODULE_STARTING_LESSON;
        this.MODULE_COVER_STAT = MODULE_COVER_STAT;
    }

    public String getMODULE_ID() {
        return MODULE_ID;
    }

    public String getMODULE_TITLE() {
        return MODULE_TITLE;
    }

    public String getMODULE_STARTING_LESSON() {
        return MODULE_STARTING_LESSON;
    }

    public String getMODULE_CURRENT_LESSON() {
        return MODULE_CURRENT_LESSON;
    }

    public String getMODULE_COVER_STAT() {
        return MODULE_COVER_STAT;
    }

    public static Module[] modules =
            {

            };

}

