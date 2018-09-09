package com.seoulmoon.stamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OneActivity extends AppCompatActivity {

    TextView textView;

    ImageView imageView;

    private BackPressCloseHandler backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView = (TextView) findViewById(R.id.textView);

        imageView = (ImageView) findViewById(R.id.imageView);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fiveIntent = new Intent(getApplicationContext(), FiveActivity.class);
                startActivity(fiveIntent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoIntent = new Intent(getApplicationContext(), TwoActivity.class);
                startActivity(twoIntent);
            }
        });

        backPressCloseHandler = new BackPressCloseHandler(this);
    }

    @Override
    public void onBackPressed() {
        backPressCloseHandler.onBackPressed();

    }
}

class BackPressCloseHandler {
    private long backKeyPressedTime = 0;
    private Toast toast;
    private OneActivity activity;

    public BackPressCloseHandler(OneActivity context) {
        this.activity = context;
    }

    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            showGuide();
            return;
        }
        if (System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            activity.finishAffinity();
            toast.cancel();
        }
    }

    public void showGuide() {
        toast = Toast.makeText(activity, "\'뒤로\'버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT);
        toast.show();
    }
}
