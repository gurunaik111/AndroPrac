package com.guru.parentapp2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
 //  String School= getIntent().getStringExtra("School-q");
 //  String Div= getIntent().getStringExtra("Div-q");

    //..for logging..
 //   private static final String TAG = "MainActivity";

    //..The request code is supposed to be unique?..
  //  public static final int MY_REQUEST_CODE = 123;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();




            switch (item.getItemId()) {
                case R.id.notice:


                    return true;
                case R.id.Calendar:

                    return true;
                case R.id.classNotice:
                    mTextMessage.setText(R.string.title_classnotice);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
/*
    private void pushFxn()
    {
        Intent intent =
                new Intent(
                        this,
                        SignupActivity.class );

        startActivityForResult( intent, MY_REQUEST_CODE );
    }

    protected void onActivityResult(
            int requestCode,
            int resultCode,
            Intent pData)
    {
        if ( requestCode == MY_REQUEST_CODE )
        {
            if (resultCode == Activity.RESULT_OK )
            {
                final String zData = pData.getExtras().getString( SignupActivity.EXTRA_STRING_NAME );

                //..do something with our retrieved value..

                Log.v( TAG, "Retrieved Value zData is "+zData );
                //..logcats "Retrieved Value zData is returnValueAsString"

            }
        }

    }
*/
}
