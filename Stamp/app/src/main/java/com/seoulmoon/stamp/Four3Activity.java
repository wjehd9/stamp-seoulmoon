package com.seoulmoon.stamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Four3Activity extends AppCompatActivity {

    private WebView mWebview3;
    private WebSettings mWebSettings3;

    String[] site = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four3);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mWebview3 = (WebView) findViewById(R.id.webview3);
        mWebview3.setWebViewClient(new WebViewClient());
        mWebSettings3 = mWebview3.getSettings();
        mWebSettings3.setJavaScriptEnabled(true);

        site[0] = "https://m.map.naver.com/search2/search.nhn?query=서울 헌릉#/map/1/20095516";
        site[1] = "https://m.map.naver.com/search2/search.nhn?query=세빛섬#/map/1/35719873";
        site[2] = "https://m.map.naver.com/search2/search.nhn?query=양재천#/map/1/12375874";
        site[3] = "https://m.map.naver.com/search2/search.nhn?query=암사동 유적#/map/1/11784391";
        site[4] = "https://m.map.naver.com/search2/search.nhn?query=올림픽 공원#/map/1/12268494";
        site[5] = "https://m.map.naver.com/search2/search.nhn?query=몽촌토성#/map/1/13491675";
        site[6] = "https://m.map.naver.com/search2/search.nhn?query=봉은사#/map/1/11664007";
        site[7] = "https://m.map.naver.com/search2/search.nhn?query=서울 선릉#/map/1/13542608";
        site[8] = "https://m.map.naver.com/search2/search.nhn?query=시민의 숲#/map/1/11559430";
        site[9] = "https://m.map.naver.com/search2/search.nhn?query=한성백제박물관#/map/1/18882132";

        Intent passedIntent3 = getIntent();
        if(passedIntent3 != null) {
            String inform3 = passedIntent3.getStringExtra("inform3");
            int num3;

            num3 = Integer.parseInt(inform3);

            if(num3 == 0) {
                mWebview3.loadUrl(site[0]);
            } else if(num3 == 1) {
                mWebview3.loadUrl(site[1]);
            } else if(num3 == 2) {
                mWebview3.loadUrl(site[2]);
            } else if(num3 == 3) {
                mWebview3.loadUrl(site[3]);
            } else if(num3 == 4) {
                mWebview3.loadUrl(site[4]);
            } else if(num3 == 5) {
                mWebview3.loadUrl(site[5]);
            } else if(num3 == 6) {
                mWebview3.loadUrl(site[6]);
            } else if(num3 == 7) {
                mWebview3.loadUrl(site[7]);
            } else if(num3 == 8) {
                mWebview3.loadUrl(site[8]);
            } else if(num3 == 9) {
                mWebview3.loadUrl(site[9]);
            }
        }
    }
}
