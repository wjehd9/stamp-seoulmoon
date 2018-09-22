package com.seoulmoon.stamp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.GONE);
        imageView4.setVisibility(View.GONE);
        imageView5.setVisibility(View.GONE);
        imageView6.setVisibility(View.GONE);

        listView = (ListView) findViewById(R.id.listview);

        final Adaptor adaptor = new Adaptor(this);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);

                if(selection == adaptor.names[0]) {
                    Intent intent = new Intent(getApplicationContext(), Three1Activity.class);
                    startActivityForResult(intent, 1);
                }
                else if(selection == adaptor.names[1]) {
                    Intent intent2 = new Intent(getApplicationContext(), Three2Activity.class);
                    startActivityForResult(intent2, 2);
                }
                else if(selection == adaptor.names[2]) {
                    Intent intent3 = new Intent(getApplicationContext(), Three3Activity.class);
                    startActivityForResult(intent3, 3);
                }
                else if(selection == adaptor.names[3]) {
                    Intent intent4 = new Intent(getApplicationContext(), Three4Activity.class);
                    startActivityForResult(intent4, 4);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String code = data.getStringExtra("code");
        int num;

        num = Integer.parseInt(code);

        if(num == 1) {
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.GONE);
            imageView5.setVisibility(View.GONE);
            imageView6.setVisibility(View.GONE);
        }
        else if(num == 2) {
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.GONE);
            imageView4.setVisibility(View.VISIBLE);
            imageView5.setVisibility(View.GONE);
            imageView6.setVisibility(View.GONE);
        }
        else if(num == 3) {
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.GONE);
            imageView4.setVisibility(View.GONE);
            imageView5.setVisibility(View.VISIBLE);
            imageView6.setVisibility(View.GONE);
        }
        else if(num == 4) {
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.GONE);
            imageView4.setVisibility(View.GONE);
            imageView5.setVisibility(View.GONE);
            imageView6.setVisibility(View.VISIBLE);
        }
    }
}

class Adaptor extends BaseAdapter {

    public String[] names = {"서울(마포, 은평, 서대문, 종로, 중구, 용산)", "서울(노원, 도봉, 강북, 성북, 동대문, 중랑, 광진, 성동)",
            "서울(서초, 강동, 송파, 강남)", "서울(강서, 양천, 구로, 영등포, 동작, 금천, 관악)"};

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
        view.setTextSize(30);

        return view;
    }
}
