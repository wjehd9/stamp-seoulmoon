package com.seoulmoon.stamp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Three1Activity extends AppCompatActivity {

    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three1);

        listView2 = (ListView) findViewById(R.id.listview2);

        final Adaptor2 adaptor2 = new Adaptor2(this);
        listView2.setAdapter(adaptor2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object selection = (Object) parent.getItemAtPosition(position);

                for (int i = 0; i < 10; i++) {
                    if (selection == adaptor2.names[i]) {
                        Intent intent = new Intent(getApplicationContext(), Four1Activity.class);

                        if (i == 0) {
                            intent.putExtra("inform1", "0");
                        } else if (i == 1) {
                            intent.putExtra("inform1", "1");
                        } else if (i == 2) {
                            intent.putExtra("inform1", "2");
                        } else if (i == 3) {
                            intent.putExtra("inform1", "3");
                        } else if (i == 4) {
                            intent.putExtra("inform1", "4");
                        } else if (i == 5) {
                            intent.putExtra("inform1", "5");
                        } else if (i == 6) {
                            intent.putExtra("inform1", "6");
                        } else if (i == 7) {
                            intent.putExtra("inform1", "7");
                        } else if (i == 8) {
                            intent.putExtra("inform1", "8");
                        } else if (i == 9) {
                            intent.putExtra("inform1", "9");
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
        intent.putExtra("code", "1");

        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}
/*
class Adaptor2 extends BaseAdapter {

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
*/
