package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class Question {

    private String QUESTION_ID;
    private String QUESTION;
    private String CHOICE_A;
    private String CHOICE_B;
    private String CHOICE_C;
    private String CHOICE_D;
    private String QUESTION_ANS;
    private String QUESTION_HINT;
    private String _PR_QUESTION;
    private String _NXT_QUESTION;

    public Question(String QUESTION_ID, String QUESTION, String CHOICE_A, String CHOICE_B,
                    String CHOICE_C, String CHOICE_D, String QUESTION_ANS,String QUESTION_HINT, String _PR_QUESTION,
                    String _NXT_QUESTION) {
        this.QUESTION_ID = QUESTION_ID;
        this.QUESTION = QUESTION;
        this.CHOICE_A = CHOICE_A;
        this.CHOICE_B = CHOICE_B;
        this.CHOICE_C = CHOICE_C;
        this.CHOICE_D = CHOICE_D;
        this.QUESTION_ANS = QUESTION_ANS;
        this.QUESTION_HINT = QUESTION_HINT;
        this._PR_QUESTION = _PR_QUESTION;
        this._NXT_QUESTION = _NXT_QUESTION;
    }

    public String getQUESTION_ID() {
        return QUESTION_ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public String getCHOICE_A() {
        return CHOICE_A;
    }

    public String getCHOICE_B() {
        return CHOICE_B;
    }

    public String getCHOICE_C() {
        return CHOICE_C;
    }

    public String getCHOICE_D() {
        return CHOICE_D;
    }

    public String getQUESTION_ANS() {
        return QUESTION_ANS;
    }

    public String getQUESTION_HINT() {
        return QUESTION_HINT;
    }

    public String get_PR_QUESTION() {
        return _PR_QUESTION;
    }

    public String get_NXT_QUESTION() {
        return _NXT_QUESTION;
    }

    public static Question [] questions = {

    };
}
