package com.seoulmoon.stamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Four2Activity extends AppCompatActivity {

    private WebView mWebview2;
    private WebSettings mWebSettings2;

    String[] site = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four2);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mWebview2 = (WebView) findViewById(R.id.webview2);
        mWebview2.setWebViewClient(new WebViewClient());
        mWebSettings2 = mWebview2.getSettings();
        mWebSettings2.setJavaScriptEnabled(true);

        site[0] = "https://m.map.naver.com/search2/search.nhn?query=북한산국립공원#/map";
        site[1] = "https://m.map.naver.com/search2/search.nhn?query=서울 태릉과 강릉(유네스코세계문화유산)#/map";
        site[2] = "https://m.map.naver.com/search2/search.nhn?query=도봉서원#/map";
        site[3] = "https://m.map.naver.com/search2/search.nhn?query=국립 4.19민주묘지#/map";
        site[4] = "https://m.map.naver.com/search2/search.nhn?query=서울 정릉-신덕왕후(유네스코세계문화유산)#/map";
        site[5] = "https://m.map.naver.com/search2/search.nhn?query=청계천 버들습지#/map";
        site[6] = "https://m.map.naver.com/search2/search.nhn?query=옹기테마공원#/map";
        site[7] = "https://m.map.naver.com/search2/search.nhn?query=아차산생태공원#/map";
        site[8] = "https://m.map.naver.com/search2/search.nhn?query=미타사#/map";
        site[9] = "https://m.map.naver.com/search2/search.nhn?query=극락사#/map";

        Intent passedIntent2 = getIntent();
        if(passedIntent2 != null) {
            String inform2 = passedIntent2.getStringExtra("inform2");
            int num2;

            num2 = Integer.parseInt(inform2);

            if(num2 == 0) {
                mWebview2.loadUrl(site[0]);
            } else if(num2 == 1) {
                mWebview2.loadUrl(site[1]);
            } else if(num2 == 2) {
                mWebview2.loadUrl(site[2]);
            } else if(num2 == 3) {
                mWebview2.loadUrl(site[3]);
            } else if(num2 == 4) {
                mWebview2.loadUrl(site[4]);
            } else if(num2 == 5) {
                mWebview2.loadUrl(site[5]);
            } else if(num2 == 6) {
                mWebview2.loadUrl(site[6]);
            } else if(num2 == 7) {
                mWebview2.loadUrl(site[7]);
            } else if(num2 == 8) {
                mWebview2.loadUrl(site[8]);
            } else if(num2 == 9) {
                mWebview2.loadUrl(site[9]);
            }
        }
    }
}
