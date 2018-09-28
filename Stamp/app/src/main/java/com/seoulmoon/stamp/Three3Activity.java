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

public class Three3Activity extends AppCompatActivity {

    ListView listView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three3);

        listView4 = (ListView) findViewById(R.id.listview4);

        final Adaptor4 adaptor4 = new Adaptor4(this);
        listView4.setAdapter(adaptor4);

        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);

                for(int i = 0; i < 10; i++){
                    if(selection == adaptor4.names[i]) {
                        Intent intent = new Intent(getApplicationContext(), Four3Activity.class);

                        if(i == 0) {
                            intent.putExtra("inform3", "0");
                        } else if(i == 1) {
                            intent.putExtra("inform3", "1");
                        } else if(i == 2) {
                            intent.putExtra("inform3", "2");
                        } else if(i == 3) {
                            intent.putExtra("inform3", "3");
                        } else if(i == 4) {
                            intent.putExtra("inform3", "4");
                        } else if(i == 5) {
                            intent.putExtra("inform3", "5");
                        } else if(i == 6) {
                            intent.putExtra("inform3", "6");
                        } else if(i == 7) {
                            intent.putExtra("inform3", "7");
                        } else if(i == 8) {
                            intent.putExtra("inform3", "8");
                        } else if(i == 9) {
                            intent.putExtra("inform3", "9");
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
        intent.putExtra("code", "3");

        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}
/*
class Adaptor4 extends BaseAdapter {

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
}*/