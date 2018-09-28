package com.seoulmoon.stamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptor2 extends BaseAdapter{
    public String[] names = {"덕수궁", "남산골한옥마을", "경의선숲길", "청계천", "조계사",
            "숭례문", "남산서울타워", "서대문형무소역사관", "국립중앙박물관", "은평한옥마을"};

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
        view.setTextSize(30);

        return view;
    }
}
