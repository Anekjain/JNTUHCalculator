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
public class FourthResults_2 extends Activity {

    EditText et_Total42,et_Percentage42;
    Button btn_Exit42;
    int sres42;
    String sper42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_2result);

        //INITIALISING VIEWS.
        et_Total42 = (EditText) findViewById(R.id.et_Total42);
        et_Percentage42 = (EditText) findViewById(R.id.et_Percentage42);
        btn_Exit42 = (Button) findViewById(R.id.btn_Exit42);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres42 = b.getInt("res42", 0);
        sper42 = b.getString("per42");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total42.setText(sres42+"");
        et_Percentage42.setText(sper42+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres42);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}
