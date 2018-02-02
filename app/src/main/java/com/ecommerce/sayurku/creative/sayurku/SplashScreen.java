package com.ecommerce.sayurku.creative.sayurku;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by MRX on 24/01/2018.
 */

public class SplashScreen extends AppCompatActivity {

    private static int splashInterval = 10000; //mengatur durasi splash screen
    private ProgressBar progressBar;
    private int progressStatus = 0; //Mengatur durasi splashscreen
    private TextView textView;
    private Handler handler = new Handler(); //Membuat Handler
    private static long time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splashscreen_activity);

        progressBar = (ProgressBar) findViewById(R.id.progressbar); //mengambil id progressbar
        textView = (TextView) findViewById(R.id.loading); //mengambil id loading

        //membuat kondisi untuk progressbar
        new Thread(new Runnable(){
            public void run() {
                while (progressStatus < 100) {
                    progressStatus +=1;

                    //menampilkan status di progressbar ke textview dengan id loading
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                            textView.setText(progressStatus+"/"+progressBar.getMax());
                        }
                    });
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        //Memindahkan activity sesuai durasi yang sudah ditentukan menggunakan Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class); //Memindahkan Activity dari Splashscreen ke MainActivity
                startActivity(i); //Menampilkan Activity MainActivity

                this.finish(); //Menutup Activity SplashScreen
            }
            private void finish(){

            }
        }, splashInterval);

    }
}

