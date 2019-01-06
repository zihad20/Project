package com.example.asus.zihadsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });

        thread.start();
        //doWork();
       // startApp();
    }


    public void doWork(){
        for(progress = 20; progress <=100; progress = progress + 20){
            try{
                Thread.sleep(1000);
                //progressBar.setProgress(progress);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void startApp(){
        Intent intent = new Intent(MainActivity.this,Home.class);
        startActivity(intent);
        finish();
    }
}
