package com.seoulmoon.stamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptor6 extends BaseAdapter {
    public String[] names = {"","","","","","","","","",""
                            ,"","","","","","","","","",""
                            ,"","","","","","","","","",""
                            ,"","","","","","","","","",""};

    public String[] getNames() {
        return names;
    }

    Context mContext;

    public Adaptor6(Context context) {
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
