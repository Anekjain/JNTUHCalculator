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
public class SecondResults_1 extends Activity {

    EditText et_Total21,et_Percentage21;
    Button btn_Exit21;
    int sres21;
    String sper21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_1result);

        //INITIALISING VIEWS.
        et_Total21 = (EditText) findViewById(R.id.et_Total21);
        et_Percentage21 = (EditText) findViewById(R.id.et_Percentage21);
        btn_Exit21 = (Button) findViewById(R.id.btn_Exit21);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres21 = b.getInt("res21", 0);
        sper21 = b.getString("per21");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total21.setText(sres21+"");
        et_Percentage21.setText(sper21+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres21);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}
