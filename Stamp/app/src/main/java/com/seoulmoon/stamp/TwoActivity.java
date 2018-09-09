package com.seoulmoon.stamp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);

        listView = (ListView) findViewById(R.id.listview);

        Adaptor adaptor = new Adaptor(this);
        listView.setAdapter(adaptor);
    }
}

class Adaptor extends BaseAdapter {

    public String[] names = {"서울(동)", "서울(서)", "서울(남)", "서울(북)"};

    Context mContext;

    public Adaptor(Context context) {
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
