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
public class ThirdResults_1 extends Activity {

    EditText et_Total31,et_Percentage31;
    Button btn_Exit31;
    int sres31;
    String sper31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_1result);

        //INITIALISING VIEWS.
        et_Total31 = (EditText) findViewById(R.id.et_Total31);
        et_Percentage31 = (EditText) findViewById(R.id.et_Percentage31);
        btn_Exit31 = (Button) findViewById(R.id.btn_Exit31);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres31 = b.getInt("res31", 0);
        sper31 = b.getString("per31");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total31.setText(sres31+"");
        et_Percentage31.setText(sper31+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres31);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}
