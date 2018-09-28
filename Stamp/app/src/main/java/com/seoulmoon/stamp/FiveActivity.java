package com.seoulmoon.stamp;

import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.BaseAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

public class FiveActivity extends AppCompatActivity {

    TextView textView2;

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;
    private ListView listView6;

    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        textView2 = (TextView) findViewById(R.id.textView2);
        listView6 = (ListView) findViewById(R.id.listview6);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneIntent = new Intent(getApplicationContext(), OneActivity.class);
                startActivity(oneIntent);
            }
        });
        final Intent passedIntent5 = getIntent();
        if(passedIntent5 != null) {
            name = passedIntent5.getStringExtra("name");
        }
        items = new ArrayList<String>();

        if(name != null) {
            items.add(name);
        }

        registerForContextMenu(listView6);

        adapter = new ArrayAdapter<String>(FiveActivity.this, android.R.layout.simple_list_item_1, items);

        listView6.setAdapter(adapter);
    }

    /*protected void onResume() {
        super.onResume();

        items.clear();

        defalutData();

        adapter.notifyDataSetChanged();
    }

    protected void defalutData() {
        if(name != null) {
            items.add(name);
        }
    }*/
}