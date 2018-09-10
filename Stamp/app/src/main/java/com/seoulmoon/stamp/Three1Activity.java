package com.seoulmoon.stamp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Three1Activity extends AppCompatActivity {

    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three1);

        listView2 = (ListView) findViewById(R.id.listview2);

        Adaptor2 adaptor2 = new Adaptor2(this);
        listView2.setAdapter(adaptor2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);
            }
        });
    }
}

class Adaptor2 extends BaseAdapter {

    public String[] names = {"동1", "동2", "동3", "동4", "동5", "동6", "동7", "동8", "동9", "동10"};

    Context mContext;

    public Adaptor2(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(mContext);
        view.setText(names[position]);
        view.setTextSize(50);

        return view;
    }
}