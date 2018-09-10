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

public class Three4Activity extends AppCompatActivity {

    ListView listView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three4);

        listView5 = (ListView) findViewById(R.id.listview5);

        Adaptor5 adaptor5 = new Adaptor5(this);
        listView5.setAdapter(adaptor5);

        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);
            }
        });
    }
}

class Adaptor5 extends BaseAdapter {

    public String[] names = {"북1", "북2", "북3", "북4", "북5", "북6", "북7", "북8", "북9", "북10"};

    Context mContext;

    public Adaptor5(Context context) {
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