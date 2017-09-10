package com.guru.parentapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoScreen extends android.app.Activity {
    Button btnTeactherLogin;
    Button btnStudnetLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_screen);
//        TextView tv = (TextView) findViewById(R.id.txtview);
//        ImageView iv = (ImageView) findViewById(R.id.imgview);
//        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
//        tv.startAnimation(myanim);
//        iv.startAnimation(myanim);
//        final Intent i=new Intent(this,SignupActivity.class);
//        Thread timer=new Thread(){
//            public  void run(){
//
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e1) {
//                    e1.printStackTrace();
//                }
//
//                finally {
//                    startActivity(i);
//                    finish();
//                }
//            }
//
//        };
//        timer.start();
        btnTeactherLogin = (Button) findViewById(R.id.btnTeacherLogin);
        btnTeactherLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginActivity =  new Intent(LogoScreen.this, LoginActivity.class);
                loginActivity.putExtra("btnTeacherLogin","Teacher");
                startActivity(loginActivity);
            }
        });

        btnStudnetLogin= (Button) findViewById(R.id.btnStudnetLogin);
        btnStudnetLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent loginActivity = new Intent(LogoScreen.this, LoginActivity.class);
                loginActivity.putExtra("btnStudentLogin","Student");
                startActivity(loginActivity);
            }
        });

    }
}
