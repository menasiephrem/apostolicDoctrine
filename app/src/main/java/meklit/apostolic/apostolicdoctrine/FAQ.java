package meklit.apostolic.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class FAQ {
    private String FAQ_ID;
    private String FAQ_QUESTION;
    private String FAQ_ANSWER;

    public FAQ(String FAQ_ID, String FAQ_QUESTION, String FAQ_ANSWER) {
        this.FAQ_ID = FAQ_ID;
        this.FAQ_QUESTION = FAQ_QUESTION;
        this.FAQ_ANSWER = FAQ_ANSWER;
    }

    public String getFAQ_ID() {
        return FAQ_ID;
    }

    public String getFAQ_QUESTION() {
        return FAQ_QUESTION;
    }

    public String getFAQ_ANSWER() {
        return FAQ_ANSWER;
    }

    public static FAQ [] faqs = {

    };

}
