package com.seoulmoon.stamp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.widget.Toast;

public class Four4Activity extends AppCompatActivity {

    private WebView mWebview4;
    private WebSettings mWebSettings4;

    String[] site = new String[10];

    final Adaptor5 adaptor5 = new Adaptor5(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four4);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mWebview4 = (WebView) findViewById(R.id.webview4);
        mWebview4.setWebViewClient(new WebViewClient());
        mWebSettings4 = mWebview4.getSettings();
        mWebSettings4.setJavaScriptEnabled(true);

        site[0] = "https://m.map.naver.com/search2/search.nhn?query=서울푸른수목원#/map/1/32581850";
        site[1] = "https://m.map.naver.com/search2/search.nhn?query=강서습지생태공원#/map/1/13470978";
        site[2] = "https://m.map.naver.com/search2/search.nhn?query=여의도샛강생태공원#/map/1/13323260";
        site[3] = "https://m.map.naver.com/search2/search.nhn?query=현충원#/map/1/11620310";
        site[4] = "https://m.map.naver.com/search2/search.nhn?query=폭포공원#/map/1/18993662";
        site[5] = "https://m.map.naver.com/search2/search.nhn?query=관악산 생태공원#/map/1/19816086";
        site[6] = "https://m.map.naver.com/search2/search.nhn?query=보라매공원#/map/1/11622412";
        site[7] = "https://m.map.naver.com/search2/search.nhn?query=서울대박물관#/map/1/11784405";
        site[8] = "https://m.map.naver.com/search2/search.nhn?query=선유도공원#/map/1/12366522";
        site[9] = "https://m.map.naver.com/search2/search.nhn?query=한국기독교박물관#/map/1/11784502";

        final Intent passedIntent4 = getIntent();

        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inform4 = passedIntent4.getStringExtra("inform4");
                int num4;

                num4 = Integer.parseInt(inform4);

                if (num4 == 0) {

                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_1, (ViewGroup) findViewById(R.id.popup4_1));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 1) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_2, (ViewGroup) findViewById(R.id.popup4_2));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 2) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_3, (ViewGroup) findViewById(R.id.popup4_3));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 3) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_4, (ViewGroup) findViewById(R.id.popup4_4));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 4) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_5, (ViewGroup) findViewById(R.id.popup4_5));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 5) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_6, (ViewGroup) findViewById(R.id.popup4_6));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 6) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_7, (ViewGroup) findViewById(R.id.popup4_7));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 7) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_8, (ViewGroup) findViewById(R.id.popup4_8));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 8) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_9, (ViewGroup) findViewById(R.id.popup4_9));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

                    aDialog.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

                    AlertDialog ad = aDialog.create();
                    ad.show();
                } else if (num4 == 9) {
                    Context mContext = getApplicationContext();
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

                    View layout4 = inflater.inflate(R.layout.inform4_10, (ViewGroup) findViewById(R.id.popup4_10));
                    AlertDialog.Builder aDialog = new AlertDialog.Builder(Four4Activity.this);

                    aDialog.setTitle("장소정보");
                    aDialog.setView(layout4);

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

        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inform4 = passedIntent4.getStringExtra("inform4");
                int num4;

                num4 = Integer.parseInt(inform4);

                for (int i = 0; i < 10; i++) {
                    Intent intent = new Intent(getApplicationContext(), FiveActivity.class);

                    if (num4 == i) {
                        intent.putExtra("name", adaptor5.names[i]);
                        setResult(RESULT_OK, intent);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });

        if(passedIntent4 != null) {
            String inform4 = passedIntent4.getStringExtra("inform4");
            int num4;

            num4 = Integer.parseInt(inform4);

            if(num4 == 0) {
                mWebview4.loadUrl(site[0]);
            } else if(num4 == 1) {
                mWebview4.loadUrl(site[1]);
            } else if(num4 == 2) {
                mWebview4.loadUrl(site[2]);
            } else if(num4 == 3) {
                mWebview4.loadUrl(site[3]);
            } else if(num4 == 4) {
                mWebview4.loadUrl(site[4]);
            } else if(num4 == 5) {
                mWebview4.loadUrl(site[5]);
            } else if(num4 == 6) {
                mWebview4.loadUrl(site[6]);
            } else if(num4 == 7) {
                mWebview4.loadUrl(site[7]);
            } else if(num4 == 8) {
                mWebview4.loadUrl(site[8]);
            } else if(num4 == 9) {
                mWebview4.loadUrl(site[9]);
            }
        }
    }
}
