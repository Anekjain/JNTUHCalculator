package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by anu on 17/9/15.
 */
public class YearDetails extends Activity {

    TextView tvCse;
    Button btn1, btn2_1, btn2_2, btn3_1, btn3_2, btn4_1, btn4_2,btn_Close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year_details);

        //INITIALISING FONT TYPE.
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "font.ttf");

        //INITIALIZING VIEWS.
        tvCse = (TextView) findViewById(R.id.tv_Cse);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2_1 = (Button) findViewById(R.id.btn_2_1);
        btn2_2 = (Button) findViewById(R.id.btn_2_2);
        btn3_1 = (Button) findViewById(R.id.btn_3_1);
        btn3_2 = (Button) findViewById(R.id.btn_3_2);
        btn4_1 = (Button) findViewById(R.id.btn_4_1);
        btn4_2 = (Button) findViewById(R.id.btn_4_2);
        btn_Close = (Button) findViewById(R.id.btn_Close);
       // btn_agg = (Button) findViewById(R.id.btn_agg);

        //SETTING FONT.
        tvCse.setTypeface(mytypeface);
        btn1.setTypeface(mytypeface);
        btn2_1.setTypeface(mytypeface);
        btn2_2.setTypeface(mytypeface);
        btn3_1.setTypeface(mytypeface);
        btn3_2.setTypeface(mytypeface);
        btn4_1.setTypeface(mytypeface);
        btn4_2.setTypeface(mytypeface);
        btn_Close.setTypeface(mytypeface);


        //SETTING ON CLICK LISTENERS.

        //1 YEAR.
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, FirstMarks.class);
                startActivity(i);
            }
        });

        //2-1 YEAR.
        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, SecondMarks_1.class);
                startActivity(i);
            }
        });

        //2-1 YEAR.
        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, SecondMarks_2.class);
                startActivity(i);
            }
        });
        //3-1 YEAR.
        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, ThirdMarks_1.class);
                startActivity(i);
            }
        });
        //3-2 YEAR.
        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, ThirdMarks_2.class);
                startActivity(i);
            }
        });
        //4-1 YEAR.
        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, FourthMarks_1.class);
                startActivity(i);
            }
        });
        //4-2 YEAR.
        btn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearDetails.this, FourthMarks_2.class);
                startActivity(i);
            }
        });
        //CLOSE BUTTON.
       btn_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });



    }
}
