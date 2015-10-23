package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseInstallation;

import org.w3c.dom.Text;

public class MainActivity extends Activity {
    Button btn_Start;
    TextView tv_JntuhCalculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing Fonts
        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "font.ttf");

        //Initializing Views
        btn_Start = (Button) findViewById(R.id.btn_Start);
        tv_JntuhCalculator = (TextView) findViewById(R.id.tv_JntuhCalculator);

        //Initialising Push Notifications.
        Parse.initialize(this, "PqgtDLjKkS6RvDOozLq9YpDvJVWiemkRhOL2G2Qv", "YYA76iYldE7TRDGeNN4CcimTBHOUG2cQlPKP0Aa0");
        ParseInstallation.getCurrentInstallation().saveInBackground();


        //Setting Font to views
        btn_Start.setTypeface(mytypeface);
        tv_JntuhCalculator.setTypeface(mytypeface);

        //Making toast when Application is Started.
        Toast.makeText(MainActivity.this, R.string.DoneBy, Toast.LENGTH_SHORT).show();

        //ON CLICK START.
        btn_Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StudentDetails.class);
                startActivity(i);
            }
        });


    }
}