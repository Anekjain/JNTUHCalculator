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
public class FourthResults_1 extends Activity {

    EditText et_Total41,et_Percentage41;
    Button btn_Exit41;
    int sres41;
    String sper41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_1result);

        //INITIALISING VIEWS.
        et_Total41 = (EditText) findViewById(R.id.et_Total41);
        et_Percentage41 = (EditText) findViewById(R.id.et_Percentage41);
        btn_Exit41 = (Button) findViewById(R.id.btn_Exit41);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres41 = b.getInt("res41", 0);
        sper41 = b.getString("per41");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total41.setText(sres41+"");
        et_Percentage41.setText(sper41+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres41);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}
