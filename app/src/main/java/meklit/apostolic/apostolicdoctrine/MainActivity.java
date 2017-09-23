package meklit.apostolic.apostolicdoctrine;




import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Module> modules;
    String [] strArr;
    DBController controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       controller = new DBController(this);
        listView = (ListView)findViewById(R.id.MainList);

        updateListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0||position == 1){
                    Intent intent = new Intent(MainActivity.this,LessonActivity.class)
                            .putExtra(Intent.EXTRA_TEXT,modules.get(position).getMODULE_CURRENT_LESSON());
                    startActivity(intent);

                }
                else
                    Toast.makeText(MainActivity.this, "COMING SOON :)", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_lan)
        {

            if (DBHandler.langIsEnglish){
                item.setTitle("ENGLISH");
                getSupportActionBar().setTitle("የሐዋርያት ትምህርት");
                DBHandler.langIsEnglish = false;
            }else{
                item.setTitle("አማርኛ");
                getSupportActionBar().setTitle(R.string.app_name);
                DBHandler.langIsEnglish = true;
            }

            updateListView();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    void updateListView(){


        modules = controller.getAllMoudles();
        strArr = new String[modules.size()];
        for (int i = 0; i<strArr.length; i++)
        {
            strArr[i]=modules.get(i).getMODULE_TITLE();
        }

        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,
                strArr));
    }


}
