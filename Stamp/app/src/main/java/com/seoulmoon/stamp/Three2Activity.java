package com.seoulmoon.stamp;

import android.content.Context;
import android.content.Intent;
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

        final Adaptor3 adaptor3 = new Adaptor3(this);
        listView3.setAdapter(adaptor3);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);

                for(int i = 0; i < 10; i++){
                    if(selection == adaptor3.names[i]) {
                        Intent intent = new Intent(getApplicationContext(), Four2Activity.class);

                        if(i == 0) {
                            intent.putExtra("inform2", "0");
                        } else if(i == 1) {
                            intent.putExtra("inform2", "1");
                        } else if(i == 2) {
                            intent.putExtra("inform2", "2");
                        } else if(i == 3) {
                            intent.putExtra("inform2", "3");
                        } else if(i == 4) {
                            intent.putExtra("inform2", "4");
                        } else if(i == 5) {
                            intent.putExtra("inform2", "5");
                        } else if(i == 6) {
                            intent.putExtra("inform2", "6");
                        } else if(i == 7) {
                            intent.putExtra("inform2", "7");
                        } else if(i == 8) {
                            intent.putExtra("inform2", "8");
                        } else if(i == 9) {
                            intent.putExtra("inform2", "9");
                        }
                        setResult(RESULT_OK, intent);

                        startActivity(intent);
                    }
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), TwoActivity.class);
        intent.putExtra("code", "2");

        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}
/*
class Adaptor3 extends BaseAdapter {

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
}*/