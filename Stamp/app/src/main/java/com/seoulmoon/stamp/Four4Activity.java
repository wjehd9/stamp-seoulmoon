package com.seoulmoon.stamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Four4Activity extends AppCompatActivity {

    private WebView mWebview4;
    private WebSettings mWebSettings4;

    String[] site = new String[10];

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

        site[0] = "https://m.map.naver.com/search2/search.nhn?query=서울푸른수목원#/map";
        site[1] = "https://m.map.naver.com/search2/search.nhn?query=강서습지생태공원#/map";
        site[2] = "https://m.map.naver.com/search2/search.nhn?query=여의도샛강생태공원#/map";
        site[3] = "https://m.map.naver.com/search2/search.nhn?query=현충원#/map";
        site[4] = "https://m.map.naver.com/search2/search.nhn?query=호암산성#/map";
        site[5] = "https://m.map.naver.com/search2/search.nhn?query=관악산 생태공원#/map";
        site[6] = "https://m.map.naver.com/search2/search.nhn?query=보라매공원#/map";
        site[7] = "https://m.map.naver.com/search2/search.nhn?query=서울대박물관#/map";
        site[8] = "https://m.map.naver.com/search2/search.nhn?query=선유도공원#/map";
        site[9] = "https://m.map.naver.com/search2/search.nhn?query=한국기독교박물관#/map";

        Intent passedIntent4 = getIntent();
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
