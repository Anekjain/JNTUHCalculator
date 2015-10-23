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
public class ThirdResults_2 extends Activity {

    EditText et_Total32,et_Percentage32;
    Button btn_Exit32;
    int sres32;
    String sper32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_2result);

        //INITIALISING VIEWS.
        et_Total32 = (EditText) findViewById(R.id.et_Total32);
        et_Percentage32 = (EditText) findViewById(R.id.et_Percentage32);
        btn_Exit32 = (Button) findViewById(R.id.btn_Exit32);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres32 = b.getInt("res32", 0);
        sper32 = b.getString("per32");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total32.setText(sres32+"");
        et_Percentage32.setText(sper32+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres32);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}
