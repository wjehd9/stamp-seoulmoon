package com.seoulmoon.stamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptor5 extends BaseAdapter {
    public String[] names = {"서울푸른수목원", "강서습지생태공원", "여의도샛강생태공원", "국립서울현충원", "용마폭포공원",
            "관악산 생태공원", "보라매공원", "서울대박물관", "선유도공원", "한국기독교박물관"};

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
        view.setTextSize(30);

        return view;
    }
}
