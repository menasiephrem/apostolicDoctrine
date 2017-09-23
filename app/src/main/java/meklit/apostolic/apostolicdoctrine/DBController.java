package meklit.apostolic.apostolicdoctrine;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;

import java.util.ArrayList;
import java.util.logging.Handler;

/**
 * Created by Menasi on 9/22/2017.
 */

public class DBController {

    DBHandler handler;
    SQLiteDatabase db;


    public DBController(Context context) {
        handler = new DBHandler(context);
        db = handler.getWritableDatabase();
    }

    public ArrayList<Module> getAllMoudles()
    {
        ArrayList<Module> ret = new ArrayList<>();

        String MODULE_ID;
        String MODULE_TITLE;
        String MODULE_STARTING_LESSON;
        String MODULE_CURRENT_LESSON;
        String MODULE_COVER_STAT;

        String cur [] = {DBHandler.MODULE_ID,DBHandler.MODULE_TITLE,
                DBHandler.MODULE_STARTING_LESSON,DBHandler.MODULE_CURRENT_LESSON,
                DBHandler.MODULE_COVER_STAT};


        Cursor cursor = db.query(true, DBHandler.TABLE_MODULE, cur, null, null, null, null,
                DBHandler.MODULE_ID, null);


        while (cursor.moveToNext()) {
            MODULE_ID = cursor.getString(cursor.getColumnIndex(DBHandler.MODULE_ID));
            MODULE_TITLE = cursor.getString(cursor.getColumnIndex(DBHandler.MODULE_TITLE));
            MODULE_STARTING_LESSON = cursor.getString(cursor.getColumnIndex(DBHandler.MODULE_STARTING_LESSON));
            MODULE_CURRENT_LESSON = cursor.getString(cursor.getColumnIndex(DBHandler.MODULE_CURRENT_LESSON));
            MODULE_COVER_STAT = cursor.getString(cursor.getColumnIndex(DBHandler.MODULE_COVER_STAT));


            ret.add(new Module (MODULE_ID,getLan(MODULE_TITLE),MODULE_STARTING_LESSON,
                        MODULE_CURRENT_LESSON,MODULE_COVER_STAT));
        }
        cursor.close();
        return ret;
    }

    public String getLan(String id)
    {
        String ret = "" ;
        String[] cur = {handler.LANG_ENG, handler.LANG_AMH};
        Cursor cursor =db.query(DBHandler.TABLE_LANG, cur, DBHandler.LANG_ID + "= '" + id +
            "'", null, null, null, null);
        while (cursor.moveToNext()) {

            int index;
            if (DBHandler.langIsEnglish)
                index = cursor.getColumnIndex(DBHandler.LANG_ENG);
            else
                index = cursor.getColumnIndex(DBHandler.LANG_AMH);

            ret = cursor.getString(index);
        }

        return ret;
    }

    public Lesson getLesson(String id)
    {
        Lesson ret = null;

        String LESSON_ID;
        String LESSON_MODULE;
        String LESSON_TITLE;
        String LESSON_STRING;
        String _PR_LESSON;
        String _NXT_LESSON;
        String LESSON_STARTING_QUESTION;
        String LESSON_CURRENT_QUESTION;

        String col [] = {DBHandler.LESSON_ID,DBHandler.LESSON_MODULE,DBHandler.LESSON_TITLE,
                DBHandler.LESSON_STRING,DBHandler._PR_LESSON,DBHandler._NXT_LESSON,
                DBHandler.LESSON_STARTING_QUESTION,DBHandler.LESSON_CURRENT_QUESTION};

        Cursor cursor =db.query(DBHandler.TABLE_LESSON, col, DBHandler.LESSON_ID + "= '" + id +
                "'", null, null, null, null);

        while (cursor.moveToNext()) {
           LESSON_ID = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_ID));
           LESSON_MODULE = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_MODULE));
           LESSON_TITLE = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_TITLE));
           LESSON_STRING = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_STRING));
           _PR_LESSON = cursor.getString(cursor.getColumnIndex(DBHandler._PR_LESSON));
           _NXT_LESSON = cursor.getString(cursor.getColumnIndex(DBHandler._NXT_LESSON));
           LESSON_STARTING_QUESTION = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_STARTING_QUESTION));
           LESSON_CURRENT_QUESTION = cursor.getString(cursor.getColumnIndex(DBHandler.LESSON_CURRENT_QUESTION));

            ret = new Lesson(LESSON_ID,LESSON_MODULE,getLan(LESSON_TITLE),getLan(LESSON_STRING),
                     _PR_LESSON,_NXT_LESSON,LESSON_STARTING_QUESTION,LESSON_CURRENT_QUESTION);
        }
        cursor.close();

        return ret;
    }

    public Verse getVer(String id)
    {
        Verse ret = null;
        String VERSE_ID;
        String VERSE_DISPLAY;
        String VERSE_STRING;

        String[] cur = {handler.VERSE_ID, handler.VERSE_DISPLAY,handler.VERSE_STRING};
        Cursor cursor =db.query(DBHandler.TABLE_VERSE, cur, DBHandler.VERSE_ID + "= '" + id +
                "'", null, null, null, null);
        while (cursor.moveToNext()) {

            VERSE_ID = cursor.getString(cursor.getColumnIndex(DBHandler.VERSE_ID));
            VERSE_DISPLAY = cursor.getString(cursor.getColumnIndex(DBHandler.VERSE_DISPLAY));
            VERSE_STRING = cursor.getString(cursor.getColumnIndex(DBHandler.VERSE_STRING));

            ret = new Verse(VERSE_ID,getLan(VERSE_DISPLAY),getLan(VERSE_STRING));
        }

        return ret;
    }

    public String getLessonCount(String id)
    {
        String ret = "";
        ArrayList<String> Lessons = new ArrayList();
        String[] col = {DBHandler.LESSON_ID};
        Cursor cursor = db.query(true, DBHandler.TABLE_LESSON, col, DBHandler.LESSON_MODULE +
                "= '" + id + "'", null, null, null, null, null);

        while (cursor.moveToNext()) {
            int index = cursor.getColumnIndex(DBHandler.LESSON_ID);
            Lessons.add(cursor.getString(index));
        }
        ret = Lessons.size()+"";
        cursor.close();
        return ret;
    }
}
