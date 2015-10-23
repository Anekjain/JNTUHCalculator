package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by anu on 18/9/15.
 */
public class FirstResult extends Activity {

    EditText et_Total1,et_Percentage1;
    Button btn_Exit1;
    int sres1;
    String sper1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_first);

        //INITIALISING VIEWS.
        et_Total1 = (EditText) findViewById(R.id.et_Total1);
        et_Percentage1 = (EditText) findViewById(R.id.et_Percentage1);
        btn_Exit1 = (Button) findViewById(R.id.btn_Exit1);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
         sres1 = b.getInt("res1", 0);
         sper1 = b.getString("per1");

       //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total1.setText(sres1+"");
        et_Percentage1.setText(sper1+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres1);
                startActivity(i);
                finish();
                System.exit(0);
           }
        });


    }
}
