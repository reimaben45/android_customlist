package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView theListView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        String[] favoriteTVShows = {"Pushing Daisies", "Better Off Ted",
                "Twin Peaks", "Freaks and Geeks", "Orphan Black", "Walking",
                "Breaking Bad", "The 400", "Alphas", "Life on Mars"};


        ArrayAdapter<String> theAdapter = new MyListAdapter(this, favoriteTVShows);
        this.theListView1 = (ListView) findViewById(R.id.theListView);
        theListView1.setAdapter(theAdapter);

        // Set item click listener
        theListView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClicked(position);
            }
        });
    }

    private void onListItemClicked(int position) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}
