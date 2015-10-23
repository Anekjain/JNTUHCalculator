package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by anu on 17/9/15.
 */
public class StudentDetails extends Activity {

    TextView tvName, tvRollno;
    EditText etName, etRollno;
    Button btnNext, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);

        //SETTING FONT TYPEFACE.
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "font.ttf");

        //INITIALISING VIEWS
        tvName = (TextView) findViewById(R.id.tv_Name);
        tvRollno = (TextView) findViewById(R.id.tv_Rollno);
        etName = (EditText) findViewById(R.id.et_Name);
        etRollno = (EditText) findViewById(R.id.et_Rollno);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnClose = (Button) findViewById(R.id.btn_Close);

        //SETTING FONT.
        tvName.setTypeface(mytypeface);
        tvRollno.setTypeface(mytypeface);
        etName.setTypeface(mytypeface);
        etRollno.setTypeface(mytypeface);
        btnNext.setTypeface(mytypeface);

        //SETTING ON CLICK LISTENER.

        //NEXT BUTTON.
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudentDetails.this, YearDetails.class);
                startActivity(i);
                finish();
            }
        });

        //CLOSE BUTTON
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);

            }
        });

        //METHOD FOR STORING NAME AND ROLL NO IN PARSE DATABASE



    }
}
