package meklit.apostolic.apostolicdoctrine;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Menasi on 9/12/2017.
 */

public class DBHandler extends SQLiteOpenHelper {
    
    private static final String DATABASE_NAME = "doctrine.db";
    private static final int DATABASE_VERSION = 1;

    /**
     * List of table names
     */

    private static final String TABLE_MODULE = "modules";
    private static final String TABLE_LESSON = "lesson";
    private static final String TABLE_QUESTION = "question";
    private static final String TABLE_VERSE = "verse";
    private static final String TABLE_FAQ = "faq";
    private static final String TABLE_LANG = "lang";


    /**
     * List of attributes for the Module table
     */

    private static final String MODULE_ID ="_id" ;
    private static final String MODULE_TITLE ="module_title" ;
    private static final String MODULE_STARTING_LESSON = "module_st_lesson";
    private static final String MODULE_CURRENT_LESSON ="module_cr_lesson" ;
    private static final String MODULE_COVER_STAT = "module_cover_stat";


    /**
     * List of attributes for the Lesson table
     */

    private static final String LESSON_ID = "lesson_id";
    private static final String LESSON_MODULE = "lesson_module";
    private static final String LESSON_TITLE = "lesson_title";
    private static final String LESSON_STRING = "lesson_string";
    private static final String _PR_LESSON = "_pr_lesson";
    private static final String _NXT_LESSON = "_next_lesson";
    private static final String LESSON_STARTING_QUESTION = "lesson_st_question";
    private static final String LESSON_CURRENT_QUESTION = "lesson_current_question";


    /**
     * List of attributes for the question table
     */

    private static final String QUESTION_ID = "question_id";
    private static final String QUESTION = "question";
    private static final String CHOICE_A = "choice_a";
    private static final String CHOICE_B = "choice_b";
    private static final String CHOICE_C = "choice_c";
    private static final String CHOICE_D = "choice_d";
    private static final String QUESTION_ANS = "question_ans";
    private static final String QUESTION_HINT = "question_hint";
    private static final String _PR_QUESTION = "_pr_question";
    private static final String _NXT_QUESTION = "_nxt_question";


    /**
     *  List of attributes for the verse table
     */
    private static final String VERSE_ID = "verse_id";
    private static final String VERSE_DISPLAY = "verse_display";
    private static final String VERSE_STRING = "verse_string";

    /**
     * List of attributes for the faq
     */

    private static final String FAQ_ID = "faq_id";
    private static final String FAQ_QUESTION = "faq_question";
    private static final String FAQ_ANSWER = "faq_answer";

    /**
     * List of attributes for the Lang
     * uses to store all the strings in
     * different languages.
     */

    private static final String LANG_ID = "lang_id";
    private static final String LANG_AMH = "lang_amh";
    private static final String LANG_ENG = "lang_eng";




    /**
     * Database Constructor
     */

    public DBHandler(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        String query_module = "CREATE TABLE " + TABLE_MODULE + "(" +

                MODULE_ID + " TEXT PRIMARY KEY ,"
                + MODULE_TITLE + " TEXT NOT NULL ,"
                + MODULE_STARTING_LESSON + " TEXT NOT NULL ,"
                + MODULE_CURRENT_LESSON + " TEXT NOT NULL ,"
                + MODULE_COVER_STAT + " TEXT NOT NULL "
                + ");";
        db.execSQL(query_module);

        String query_lesson = "CREATE TABLE " + TABLE_LESSON + "(" +

                LESSON_ID + " TEXT PRIMARY KEY ,"
                + LESSON_MODULE + " TEXT NOT NULL ,"
                + LESSON_TITLE + " TEXT NOT NULL ,"
                + LESSON_STRING + " TEXT NOT NULL ,"
                + _PR_LESSON + " TEXT ,"
                + _NXT_LESSON + " TEXT ,"
                + LESSON_STARTING_QUESTION + " TEXT ,"
                + LESSON_CURRENT_QUESTION + " TEXT "
                + ");";
        db.execSQL(query_lesson);

        String query_question = "CREATE TABLE " + TABLE_QUESTION + "(" +

                QUESTION_ID + " TEXT PRIMARY KEY ,"
                + QUESTION + " TEXT NOT NULL ,"
                + CHOICE_A + " TEXT NOT NULL ,"
                + CHOICE_B + " TEXT NOT NULL ,"
                + CHOICE_C + " TEXT NOT NULL ,"
                + CHOICE_D + " TEXT NOT NULL ,"
                + QUESTION_ANS + " TEXT NOT NULL ,"
                + QUESTION_HINT + " TEXT NOT NULL ,"
                + _PR_QUESTION + " TEXT ,"
                + _NXT_QUESTION + " TEXT "
                + ");";
        db.execSQL(query_question);

        String query_verse = "CREATE TABLE " + TABLE_VERSE + "(" +

                VERSE_ID + " TEXT PRIMARY KEY ,"
                + VERSE_DISPLAY + " TEXT NOT NULL ,"
                + VERSE_STRING + " TEXT NOT NULL "
                + ");";
        db.execSQL(query_verse);

        String query_faq = "CREATE TABLE " + TABLE_FAQ + "(" +

                FAQ_ID + " TEXT PRIMARY KEY ,"
                + FAQ_QUESTION + " TEXT NOT NULL ,"
                + FAQ_ANSWER + " TEXT NOT NULL "
                + ");";
        db.execSQL(query_faq);

        String query_lang = "CREATE TABLE " + TABLE_LANG + "(" +

                LANG_ID+ " TEXT PRIMARY KEY ,"
                + LANG_AMH + " TEXT  ,"
                + LANG_ENG + " TEXT "
                + ");";
        db.execSQL(query_lang);


        ContentValues ALL_MODULES = new ContentValues();
        for (int i = 0; i < Module.modules.length; i++) {
            ALL_MODULES.put(MODULE_ID, Module.modules[i].getMODULE_ID());
            ALL_MODULES.put(MODULE_TITLE, Module.modules[i].getMODULE_TITLE());
            ALL_MODULES.put(MODULE_STARTING_LESSON, Module.modules[i].getMODULE_STARTING_LESSON());
            ALL_MODULES.put(MODULE_CURRENT_LESSON, Module.modules[i].getMODULE_CURRENT_LESSON());
            ALL_MODULES.put(MODULE_COVER_STAT, Module.modules[i].getMODULE_COVER_STAT());
            db.insert(TABLE_MODULE, null, ALL_MODULES);
        }

        ContentValues ALL_LESSON = new ContentValues();
        for (int i = 0; i < Lesson.lessons.length; i++) {
           ALL_LESSON.put(LESSON_ID,Lesson.lessons[i].getLESSON_ID());
           ALL_LESSON.put(LESSON_MODULE,Lesson.lessons[i].getLESSON_MODULE());
           ALL_LESSON.put(LESSON_TITLE,Lesson.lessons[i].getLESSON_TITLE());
           ALL_LESSON.put(LESSON_STRING,Lesson.lessons[i].getLESSON_STRING());
           ALL_LESSON.put(_PR_LESSON,Lesson.lessons[i].get_PR_LESSON());
           ALL_LESSON.put(_NXT_LESSON,Lesson.lessons[i].get_NXT_LESSON());
           ALL_LESSON.put(LESSON_STARTING_QUESTION,Lesson.lessons[i].getLESSON_STARTING_QUESTION());
           ALL_LESSON.put(LESSON_CURRENT_QUESTION,Lesson.lessons[i].getLESSON_CURRENT_QUESTION());
            db.insert(TABLE_LESSON, null, ALL_LESSON);
        }


        ContentValues ALL_QUESTION = new ContentValues();
        for(int i = 0; i < Question.questions.length; i++) {
            ALL_QUESTION.put(QUESTION_ID,Question.questions[i].getQUESTION_ID());
            ALL_QUESTION.put(QUESTION,Question.questions[i].getQUESTION());
            ALL_QUESTION.put(CHOICE_A,Question.questions[i].getCHOICE_A());
            ALL_QUESTION.put(CHOICE_B,Question.questions[i].getCHOICE_B());
            ALL_QUESTION.put(CHOICE_C,Question.questions[i].getCHOICE_C());
            ALL_QUESTION.put(CHOICE_D,Question.questions[i].getCHOICE_D());
            ALL_QUESTION.put(QUESTION_ANS,Question.questions[i].getQUESTION_ANS());
            ALL_QUESTION.put(QUESTION_HINT,Question.questions[i].getQUESTION_HINT());
            ALL_QUESTION.put(_PR_QUESTION,Question.questions[i].get_PR_QUESTION());
            ALL_QUESTION.put(_NXT_QUESTION,Question.questions[i].get_NXT_QUESTION());
            db.insert(TABLE_QUESTION,null,ALL_QUESTION);
        }

        ContentValues ALL_FAQ = new ContentValues();
        for (int i = 0; i < FAQ.faqs.length; i++){
            ALL_FAQ.put(FAQ_ID,FAQ.faqs[i].getFAQ_ID());
            ALL_FAQ.put(FAQ_QUESTION,FAQ.faqs[i].getFAQ_QUESTION());
            ALL_FAQ.put(FAQ_ANSWER,FAQ.faqs[i].getFAQ_ANSWER());
            db.insert(TABLE_FAQ,null,ALL_FAQ);
        }

        ContentValues ALL_VERSE = new ContentValues();
        for (int i = 0; i < Verse.verses.length; i++){
            ALL_VERSE.put(VERSE_ID,Verse.verses[i].getVERSE_ID());
            ALL_VERSE.put(VERSE_DISPLAY,Verse.verses[i].getVERSE_DISPLAY());
            ALL_VERSE.put(VERSE_STRING,Verse.verses[i].getVERSE_STRING());
            db.insert(TABLE_VERSE,null,ALL_VERSE);
        }

        ContentValues ALL_LANG = new ContentValues();
        for (int i = 0; i < Lang.langs.length; i++){
            ALL_LANG.put(LANG_ID,Lang.langs[i].getLANG_ID());
            ALL_LANG.put(LANG_AMH,Lang.langs[i].getLANG_AMH());
            ALL_LANG.put(LANG_ENG,Lang.langs[i].getLANG_ENG());
            db.insert(TABLE_LANG,null,ALL_LANG);
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
