package com.example.nandhu.qoutes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private  authorsAdapter apadapter;
    private ArrayList<authors> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_action_log);
    list= new ArrayList<>();
        list.add(new authors(1,"Abraham Lincoln"));
        list.add(new authors(2,"Helen Keller"));
        list.add(new authors(3,"Bruce Lee"));
       list.add(new authors(4,"Mahatma Gandhi"));
        list.add(new authors(5,"Albert Einstein"));
        list.add(new authors(6,"Thomas A. Edison"));
        list.add(new authors(7,"Oscar Wilde"));
        list.add(new authors(8,"Eleanor Roosevelt"));
        list.add(new authors(9,"Aristotle"));
        list.add(new authors(10,"C.S. Lewis"));
        list.add(new authors(11,"Marilyn Monroen"));
        list.add(new authors(12,"Theodore Roosevelt"));
        list.add(new authors(13,"Oprah Winfrey"));
        list.add(new authors(14,"Steve Jobs"));
        list.add(new authors(15,"Mother Teresa"));
        list.add(new authors(16,"Eleanor Roosevelt"));
        list.add(new authors(17,"Bob Marley"));
        list.add(new authors(18,"Oscar Wilde"));
        list.add(new authors(19,"Oscar Wilde"));
        list.add(new authors(20,"Margaret Thatcher"));
        list.add(new authors(21,"Dr. Seuss"));
        list.add(new authors(22,"Bernard M. Baruch"));
        list.add(new authors(23,"Dr. Seuss"));
        list.add(new authors(24,"William W. Purkey"));
        list.add(new authors(25,"George Bernard Shaw"));
        list.add(new authors(26,"Henry David Thoreau"));
        list.add(new authors(27,"Napoleon Hill"));
        list.add(new authors(28,"Mark Twain"));
        list.add(new authors(29,"Deepak Chopra"));
        list.add(new authors(30,"Wayne Dyer"));
        list.add(new authors(31,"Napoleon Bonaparte"));
        list.add(new authors(32,"Arthur C. Clarke"));
        list.add(new authors(33,"Mark Twain"));
        list.add(new authors(34,"Zig Ziglar"));
        list.add(new authors(35,"Anthony Robbins"));
        list.add(new authors(36,"Euripides"));
        list.add(new authors(37,"Albert Camus"));
        list.add(new authors(38,"Robert Frost"));
        list.add(new authors(39,"Dale Carnegie"));
        list.add(new authors(40,"liver Wendell Holmes, Jr"));
        list.add(new authors(41,"Steve Jobs"));
        list.add(new authors(42,"Bill Gates"));
        list.add(new authors(43,"Bill Gates"));
        list.add(new authors(44,"Steve Jobs"));
        list.add(new authors(45,"Bill Gates"));
        list.add(new authors(46,"Mark Zuckerberg"));
        list.add(new authors(47,"Steve Jobs"));
        list.add(new authors(48,"Bill Gates"));
        list.add(new authors(49,"Mark Zuckerberg"));
        list.add(new authors(50,"Steve Jobs"));
        ListView listView = (ListView)findViewById(R.id.list);
        apadapter = new authorsAdapter(this,list);
        listView.setAdapter(apadapter);
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);

            intent.putExtra("intent",list.get(position).getId());
            startActivity(intent);

        }
    });
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.listview,menu);
//        MenuItem item = menu.findItem(R.id.search_bar);
//        SearchView searchView = (SearchView) item.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                for(int i=0;i<newText.length();i++){
//
//                    if(list.get(i)3
//                            .getName().contains(newText)){
//
//                    }
//                }
//
//                return false;
//            }
//        });
//        return super.onCreateOptionsMenu(menu);
    }


