package com.example.liuhe.huarongdao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void game(View view) {
        Intent intent1 = new Intent(this,MusicServer.class);
        startService(intent1);
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void game2(View view) {
        Intent intent1 = new Intent(this,MusicServer2.class);
        startService(intent1);
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void game3(View view) {
        Intent intent1 = new Intent(this,MusicServer3.class);
        startService(intent1);
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void game4(View view) {
        Intent intent1 = new Intent(this,MusicServer4.class);
        startService(intent1);
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent(this,MusicServer.class);
        stopService(intent);
        Intent intent2 = new Intent(this,MusicServer2.class);
        stopService(intent2);
        Intent intent3 = new Intent(this,MusicServer3.class);
        stopService(intent3);
        Intent intent4 = new Intent(this,MusicServer4.class);
        stopService(intent4);
    }
}
