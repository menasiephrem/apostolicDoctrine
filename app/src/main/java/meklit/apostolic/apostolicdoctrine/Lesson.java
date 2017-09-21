package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class Lesson {

    private String LESSON_ID;

    private String LESSON_MODULE;
    private String LESSON_TITLE;
    private String LESSON_STRING;
    private String _PR_LESSON;
    private String _NXT_LESSON;
    private String LESSON_STARTING_QUESTION;
    private String LESSON_CURRENT_QUESTION;

    public Lesson(String LESSON_ID,String LESSON_MODULE , String LESSON_TITLE, String LESSON_STRING, String _PR_LESSON,
                  String _NXT_LESSON, String LESSON_STARTING_QUESTION) {
        this.LESSON_ID = LESSON_ID;
        this.LESSON_TITLE = LESSON_TITLE;
        this.LESSON_MODULE = LESSON_MODULE;
        this.LESSON_STRING = LESSON_STRING;
        this._PR_LESSON = _PR_LESSON;
        this._NXT_LESSON = _NXT_LESSON;
        this.LESSON_STARTING_QUESTION = LESSON_STARTING_QUESTION;
        this.LESSON_CURRENT_QUESTION =LESSON_STARTING_QUESTION;
    }


    public String getLESSON_ID() {
        return LESSON_ID;
    }

    public String getLESSON_MODULE() {
        return LESSON_MODULE;
    }

    public String getLESSON_TITLE() {
        return LESSON_TITLE;
    }

    public String getLESSON_STRING() {
        return LESSON_STRING;
    }

    public String get_PR_LESSON() {
        return _PR_LESSON;
    }

    public String get_NXT_LESSON() {
        return _NXT_LESSON;
    }

    public String getLESSON_STARTING_QUESTION() {
        return LESSON_STARTING_QUESTION;
    }

    public String getLESSON_CURRENT_QUESTION() {
        return LESSON_CURRENT_QUESTION;
    }

    public static Lesson [] lessons = {

    };
}
