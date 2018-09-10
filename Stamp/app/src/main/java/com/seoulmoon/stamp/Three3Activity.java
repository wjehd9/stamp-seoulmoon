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

public class Three3Activity extends AppCompatActivity {

    ListView listView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three3);

        listView4 = (ListView) findViewById(R.id.listview4);

        Adaptor4 adaptor4 = new Adaptor4(this);
        listView4.setAdapter(adaptor4);

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);
            }
        });
    }
}

class Adaptor4 extends BaseAdapter {

    public String[] names = {"남1", "남2", "남3", "남4", "남5", "남6", "남7", "남8", "남9", "남10"};

    Context mContext;

    public Adaptor4(Context context) {
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