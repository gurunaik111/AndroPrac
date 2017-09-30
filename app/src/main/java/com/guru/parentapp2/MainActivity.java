package com.guru.parentapp2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.NoticeClass:
                    fragment=new CNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();

                    return true;
                case R.id.News:
                    fragment=new SNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();

                    return true;
                case R.id.Calendar:
                    fragment=new CNotice();
                    fragmentTransaction.replace(R.id.frag_place,fragment).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
