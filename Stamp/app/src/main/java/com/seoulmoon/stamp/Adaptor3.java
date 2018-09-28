package com.seoulmoon.stamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptor3 extends BaseAdapter {
    public String[] names = {"북한산국립공원", "서울 태릉과 강릉", "도봉서원", "국립 4.19 민주묘지", "서울 정릉, 선덕왕후",
            "청계천 버들습지", "옹기테마공원", "아차산생태공원", "마타사", "극락사"};

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
        view.setTextSize(30);

        return view;
    }
}
