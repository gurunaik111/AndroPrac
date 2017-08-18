package com.guru.parentapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by GuRu on 12/08/2017.
 */

public class SignupActivity extends Activity{

    public static final String EXTRA_STRING_NAME="extraStringName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_signup);
        Button submitButton= (Button)findViewById(R.id.button_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String  ns= (String) findViewById(R.id.schoolName);
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
              //  intent.putExtra("School-q","oxford");
               // intent.putExtra("Div-q","asd");
                startActivity(intent);
            }
        });




    }
/*
    TextView schoolName=(TextView) findViewById(R.id.schoolName);
    TextView studClass=(TextView) findViewById(R.id.studentClass);
    TextView studDiv=(TextView) findViewById(R.id.studentDivision);





    public void onSubmitButtonClick(View view) {

       // String c= R.id.class;

        Intent iData = new Intent(this, MainActivity.class);
        final int result=1;
        iData.putExtra("calling ","Signup");
        startActivity(iData);

       iData.putExtra(
                EXTRA_STRING_NAME,
                "returnValueAsString" );

        setResult(android.app.Activity.RESULT_OK, iData);

       // MainActivity.onCreate(iData);

        //..returns us to the parent "MyMainActivity"..


    }  */
}
