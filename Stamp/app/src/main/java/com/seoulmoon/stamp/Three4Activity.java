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

public class Three4Activity extends AppCompatActivity {

    ListView listView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three4);

        listView5 = (ListView) findViewById(R.id.listview5);

        final Adaptor5 adaptor5 = new Adaptor5(this);
        listView5.setAdapter(adaptor5);

        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);

                for(int i = 0; i < 10; i++){
                    if(selection == adaptor5.names[i]) {
                        Intent intent = new Intent(getApplicationContext(), Four4Activity.class);

                        if(i == 0) {
                            intent.putExtra("inform4", "0");
                        } else if(i == 1) {
                            intent.putExtra("inform4", "1");
                        } else if(i == 2) {
                            intent.putExtra("inform4", "2");
                        } else if(i == 3) {
                            intent.putExtra("inform4", "3");
                        } else if(i == 4) {
                            intent.putExtra("inform4", "4");
                        } else if(i == 5) {
                            intent.putExtra("inform4", "5");
                        } else if(i == 6) {
                            intent.putExtra("inform4", "6");
                        } else if(i == 7) {
                            intent.putExtra("inform4", "7");
                        } else if(i == 8) {
                            intent.putExtra("inform4", "8");
                        } else if(i == 9) {
                            intent.putExtra("inform4", "9");
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
        intent.putExtra("code", "4");

        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}

class Adaptor5 extends BaseAdapter {

    public String[] names = {"서울푸른수목원", "강서습지생태공원", "여의도샛강생태공원", "현충원", "호암산성",
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