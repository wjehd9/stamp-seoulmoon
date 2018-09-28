package com.seoulmoon.stamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptor4 extends BaseAdapter {
    public String[] names = {"서울 현릉", "세빛섬", "양재천", "암사동 유적", "올림픽 공원",
            "몽촌토성", "봉은사", "서울 선릉과 정릉", "시민의 숲", "한성백제박물관"};

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
        view.setTextSize(30);

        return view;
    }
}
