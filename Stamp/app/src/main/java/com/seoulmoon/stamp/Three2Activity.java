package com.seoulmoon.stamp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Three2Activity extends AppCompatActivity {

    ListView listView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three2);

        listView3 = (ListView) findViewById(R.id.listview3);

        Adaptor3 adaptor3 = new Adaptor3(this);
        listView3.setAdapter(adaptor3);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);
            }
        });
    }
}

class Adaptor3 extends BaseAdapter {

    public String[] names = {"서1", "서2", "서3", "서4", "서5", "서6", "서7", "서8", "서9", "서10"};

    Context mContext;

    public Adaptor3(Context context) {
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