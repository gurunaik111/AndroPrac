package com.guru.parentapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by GuRu on 12/08/2017.
 */

public class SignupActivity extends Activity{

    public static final String EXTRA_STRING_NAME="extraStringName";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_signup);


    }

    public void onSubmitButtonClick(View view) {
       // String c= R.id.class;

        Intent iData = new Intent();
        iData.putExtra(
                EXTRA_STRING_NAME,
                "returnValueAsString" );

        setResult(
                android.app.Activity.RESULT_OK,
                iData );

        //..returns us to the parent "MyMainActivity"..
        finish();

    }
}
