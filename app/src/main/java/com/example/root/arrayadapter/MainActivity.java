package com.example.root.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> arrayOfUser = new ArrayList<User>();
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUser);
        ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(adapter);

        User newUser = new User("Lyse", "Jacmel", "femin");
        adapter.add(newUser);
    }
}
