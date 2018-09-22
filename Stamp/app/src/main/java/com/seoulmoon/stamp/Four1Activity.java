package com.seoulmoon.stamp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.io.InputStream;

public class Four1Activity extends AppCompatActivity {

    private WebView mWebview;
    private WebSettings mWebSettings;

    String[] site = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four1);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mWebview = (WebView) findViewById(R.id.webview);
        mWebview.setWebViewClient(new WebViewClient());
        mWebSettings = mWebview.getSettings();
        mWebSettings.setJavaScriptEnabled(true);

        site[0] = "https://m.map.naver.com/search2/search.nhn?query=덕수궁#/map/1/11571730";
        site[1] = "https://m.map.naver.com/search2/search.nhn?query=남산골한옥마을#/map/1/13198659";
        site[2] = "https://m.map.naver.com/search2/search.nhn?query=경의선숲길#/map/1/37992172";
        site[3] = "https://m.map.naver.com/search2/search.nhn?query=청계천#/map/1/13491093";
        site[4] = "https://m.map.naver.com/search2/search.nhn?query=조계사#/map/1/12127463";
        site[5] = "https://m.map.naver.com/search2/search.nhn?query=숭례문#/map/1/13491509";
        site[6] = "https://m.map.naver.com/search2/search.nhn?query=남산서울타워#/map/1/38345004";
        site[7] = "https://m.map.naver.com/search2/search.nhn?query=서대문형무소역사관#/map/1/12384776";
        site[8] = "https://m.map.naver.com/search2/search.nhn?query=국립중앙박물관#/map/1/11620570";
        site[9] = "https://m.map.naver.com/search2/search.nhn?query=은평한옥마을#/map/1/37825869";

        final Intent passedIntent1 = getIntent();

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inform1 = passedIntent1.getStringExtra("inform1");
                int num1;

                num1 = Integer.parseInt(inform1);

                if (num1 == 0) {

                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_1, (ViewGroup) findViewById(R.id.popup1_1));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("덕수궁");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 1) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_2, (ViewGroup) findViewById(R.id.popup1_2));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("남산골 한옥마을");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 2) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_3, (ViewGroup) findViewById(R.id.popup1_3));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("경의선 숲길");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 3) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_4, (ViewGroup) findViewById(R.id.popup1_4));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("청계천");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 4) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_5, (ViewGroup) findViewById(R.id.popup1_5));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("조계사");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 5) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_6, (ViewGroup) findViewById(R.id.popup1_6));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("숭례문");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 6) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_7, (ViewGroup) findViewById(R.id.popup1_7));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("남산서울타워");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 7) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_8, (ViewGroup) findViewById(R.id.popup1_8));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("서대문형무소역사관");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 8) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_9, (ViewGroup) findViewById(R.id.popup1_9));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("국립중앙박물관");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num1 == 9) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout1 = inflater.inflate(R.layout.inform1_10, (ViewGroup) findViewById(R.id.popup1_10));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four1Activity.this);

                    aDialog.setTitle("은평한옥마을");
                    aDialog.setView(layout1);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                }
            }
        });

        if (passedIntent1 != null) {
            String inform1 = passedIntent1.getStringExtra("inform1");
            int num1;

            num1 = Integer.parseInt(inform1);

            if (num1 == 0) {
                mWebview.loadUrl(site[0]);
            } else if (num1 == 1) {
                mWebview.loadUrl(site[1]);
            } else if (num1 == 2) {
                mWebview.loadUrl(site[2]);
            } else if (num1 == 3) {
                mWebview.loadUrl(site[3]);
            } else if (num1 == 4) {
                mWebview.loadUrl(site[4]);
            } else if (num1 == 5) {
                mWebview.loadUrl(site[5]);
            } else if (num1 == 6) {
                mWebview.loadUrl(site[6]);
            } else if (num1 == 7) {
                mWebview.loadUrl(site[7]);
            } else if (num1 == 8) {
                mWebview.loadUrl(site[8]);
            } else if (num1 == 9) {
                mWebview.loadUrl(site[9]);
            }
        }
    }
}
