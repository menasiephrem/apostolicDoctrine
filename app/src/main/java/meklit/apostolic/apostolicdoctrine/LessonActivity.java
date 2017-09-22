package meklit.apostolic.apostolicdoctrine;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class LessonActivity extends AppCompatActivity {

    Lesson curLesson;
    DBController controller;
    TextView LessonStr,VerseDisp,VerseString;
    String LessonID;
    ImageButton NextLesson, PrevLesson;
    ArrayList<Verse> verse;
    int currentVars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        controller = new DBController(this);

        LessonStr = (TextView) findViewById(R.id.LessonStr);
        VerseDisp = (TextView) findViewById(R.id.VerseTitle);
        VerseString = (TextView) findViewById(R.id.VerseStr);

        NextLesson = (ImageButton) findViewById(R.id.buttonNxt);
        PrevLesson = (ImageButton) findViewById(R.id.buttonPrev);

        LessonStr.setTextSize(22);
        VerseDisp.setTextSize(22);
        VerseString.setTextSize(16);
        verse = new ArrayList<>();

        Intent intent = getIntent();
        LessonID = intent.getStringExtra(Intent.EXTRA_TEXT);

        updateLesson();

        NextLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LessonID = curLesson.get_NXT_LESSON();
                updateLesson();
                PrevLesson.setEnabled(true);
            }
        });

        PrevLesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LessonID = curLesson.get_PR_LESSON();
                updateLesson();
                NextLesson.setEnabled(true);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        MenuItem Lan = menu.findItem(R.id.action_lan);

        if (!DBHandler.langIsEnglish)
           Lan.setTitle("ENGLISH");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_lan)
        {

            if (DBHandler.langIsEnglish){
                item.setTitle("ENGLISH");
                DBHandler.langIsEnglish = false;
            }else{
                item.setTitle("አማርኛ");
                DBHandler.langIsEnglish = true;
            }

            updateLesson();
            updateVersTV();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateLesson(){

        curLesson = controller.getLesson(LessonID);
        getSupportActionBar().setTitle(curLesson.getLESSON_TITLE());

        LessonStr.setText(extactVerse(curLesson.getLESSON_STRING()));
        LessonStr.setMovementMethod(LinkMovementMethod.getInstance());
        LessonStr.setHighlightColor(Color.TRANSPARENT);

        currentVars = verse.size()-1;
        updateVersTV();

        if (curLesson.get_PR_LESSON().equalsIgnoreCase("null"))
            PrevLesson.setEnabled(false);
        if (curLesson.get_NXT_LESSON().equalsIgnoreCase("null"))
            NextLesson.setEnabled(false);

    }

    private SpannableString extactVerse(String str)
    {
        verse.clear();

        Stack<Integer> ChVers = new Stack<>();
        Stack<Integer> ChIndex = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='$')
                ChVers.push(i);
        }

        while (!ChVers.isEmpty()) {
            int a =ChVers.pop();
            int b =ChVers.pop();
            String verStr = str.substring(b+1, a);
            Verse ver = controller.getVer(verStr);
            verse.add(ver);
            String oldVer = "$"+verStr+"$";
            String newVer = "*"+ver.getVERSE_DISPLAY()+"*";
           str= str.replace(oldVer,newVer);
        }
        ;

        for(int i=0; i<str.length(); i++){
                int j = 0;
            if(str.charAt(i)=='*')
            {    j=j+1;
                ChIndex.push(i-(j-(j%2)));

            }


        }
        str=str.replace('*',' ');
        SpannableString ss = new SpannableString(str);


        int i = 0;

        while (!ChIndex.isEmpty()) {
            int a = ChIndex.pop();
            int b = ChIndex.pop();


          ss.setSpan(new myClickbleSpan(i),b+1,a, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            i=i+1;

        }
      return ss;
    }

    private void updateVersTV()
    {
        if (currentVars >=0){
        VerseDisp.setText(verse.get(currentVars).getVERSE_DISPLAY());
        VerseString.setText(verse.get(currentVars).getVERSE_STRING());
        }
    }

    public class myClickbleSpan extends ClickableSpan
    {
        int pos;


        public myClickbleSpan(int pos) {
            this.pos = pos;
        }

        @Override
        public void onClick(View widget) {
            currentVars = pos;
            updateVersTV();
        }
    }
}
