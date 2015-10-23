package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anu on 19/9/15.
 */
public class ThirdMarks_1 extends Activity {
    TextView tv_PPL,tv_IPR,tv_SE,tv_CD,tv_OS,tv_CN,tv_OSLab,tv_CDLab;
    TextView tv_Subjects31, tv_Internal31, tv_External31;
    EditText et_Int_PPL, et_Int_IPR, et_Int_SE, et_Int_CD, et_Int_OS, et_Int_CN, et_Int_OSLab, et_Int_CDLab;
    EditText et_Ext_PPL, et_Ext_IPR, et_Ext_SE, et_Ext_CD, et_Ext_OS, et_Ext_CN, et_Ext_OSLab, et_Ext_CDLab;
    Button btn_Cal31, btn_Ok31;
    int IPPL,IIPR,ISE,ICD,IOS,ICN,IOS_Lab,ICD_Lab;
    int EPPL,EIPR,ESE,ECD,EOS,ECN,EOS_Lab,ECD_Lab;
    int ITotal31,ETotal31,Total31;
    float Percentage31;
    String f31;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdmarks_1);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects31 = (TextView) findViewById(R.id.tv_Subject31);
        tv_Internal31 = (TextView) findViewById(R.id.tv_Internal31);
        tv_External31 = (TextView) findViewById(R.id.tv_External31);
        //SUBJECT TEXT VIEWS.
        tv_PPL = (TextView) findViewById((R.id.tv_PPL));
        tv_IPR = (TextView) findViewById((R.id.tv_IPR));
        tv_SE = (TextView) findViewById((R.id.tv_SE));
        tv_CD = (TextView) findViewById((R.id.tv_CD));
        tv_OS = (TextView) findViewById((R.id.tv_OS));
        tv_CN = (TextView) findViewById((R.id.tv_CN));
        tv_OSLab = (TextView) findViewById((R.id.tv_OS_Lab));
        tv_CDLab = (TextView) findViewById((R.id.tv_CD_Lab));
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_PPL = (EditText) findViewById(R.id.et_Int_PPL);
        et_Int_SE = (EditText) findViewById(R.id.et_Int_SE);
        et_Int_CD = (EditText) findViewById(R.id.et_Int_CD);
        et_Int_OS = (EditText) findViewById(R.id.et_Int_OS);
        et_Int_CN = (EditText) findViewById(R.id.et_Int_CN);
        et_Int_IPR = (EditText) findViewById(R.id.et_Int_IPR);
        et_Int_OSLab = (EditText) findViewById(R.id.et_Int_OSLab);
        et_Int_CDLab = (EditText) findViewById(R.id.et_Int_CDLab);
        //EXTERNAL
        et_Ext_PPL = (EditText) findViewById(R.id.et_Ext_PPL);
        et_Ext_SE = (EditText) findViewById(R.id.et_Ext_SE);
        et_Ext_OS = (EditText) findViewById(R.id.et_Ext_OS);
        et_Ext_CN = (EditText) findViewById(R.id.et_Ext_CN);
        et_Ext_IPR = (EditText) findViewById(R.id.et_Ext_IPR);
        et_Ext_CD = (EditText) findViewById(R.id.et_Ext_CD);
        et_Ext_OSLab = (EditText) findViewById(R.id.et_Ext_OSLab);
        et_Ext_CDLab = (EditText) findViewById(R.id.et_Ext_CDLab);
        //INITIALISING BUTTON
        btn_Cal31 = (Button) findViewById(R.id.btn_Cal31);
        btn_Ok31 = (Button) findViewById(R.id.btn_Ok31);

        //DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
        tv_PPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_PPL, "Principles of Programming Language");
            }
        });
        tv_IPR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_IPR, "Intellectual Property Rights");

            }
        });
        tv_SE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_SE, "Software Engineering");
            }
        });
        tv_CD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_CD, "Compiler Design");
            }
        });
        tv_OS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_OS, "Operating System");
            }
        });
        tv_CN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_CN, "Computer Networks");
            }
        });
        tv_OSLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_OSLab, "Opreating System Lab");
            }
        });
        tv_CDLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_CDLab, "Compiler Design Lab");
            }
        });




        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                IPPL = getIntValue(et_Int_PPL);
                ISE = getIntValue(et_Int_SE);
                IOS = getIntValue(et_Int_OS);
                ICD = getIntValue(et_Int_CD);
                ICN = getIntValue(et_Int_CN);
                IIPR = getIntValue(et_Int_IPR);
                IOS_Lab = getIntValue(et_Int_OSLab);
                ICD_Lab = getIntValue(et_Int_CDLab);
                //EXTERNALS.
                EPPL = getIntValue(et_Ext_PPL);
                ESE = getIntValue(et_Ext_SE);
                EOS = getIntValue(et_Ext_OS);
                ECN = getIntValue(et_Ext_CN);
                EIPR = getIntValue(et_Ext_IPR);
                ECD = getIntValue(et_Ext_CD);
                EOS_Lab = getIntValue(et_Ext_OSLab);
                ECD_Lab = getIntValue(et_Ext_CDLab);

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal31 = (IPPL+ISE+IOS+ICD+ICN+IIPR+IOS_Lab+ICD_Lab);
                //EXTERNAL TOTAL.
                ETotal31 = (EPPL+ESE+EOS+ECD+ECN+EIPR+EOS_Lab+ECD_Lab);
                //TOTAL.
                Total31 = (ITotal31+ETotal31);
                //PERCENTAGE.
                Percentage31 = ((Total31/750)*100);
                f31 = Float.toString(Percentage31);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Cal31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdMarks_1.this,ThirdResults_1.class);
                Bundle b = new Bundle();
                b.putInt("res31",Total31);
                b.putString("per31", f31);
                i.putExtras(b);
                startActivity(i);
                finish();
            }
        });




    }



    //SUB-FUNCTION FOR GETTING INTEGER FROM EDITTEXT.
    private int getIntValue(EditText et) throws NumberFormatException {
        int i =0;
        String s;
        try {
            s = et.getText().toString();
            if(s.equals("")){
                Toast.makeText(getApplicationContext(),"Invalid Marks",Toast.LENGTH_SHORT).show();
            }
            i = Integer.parseInt(s);
            return i;

        } catch (NumberFormatException e) {
            Log.e("ERROR:", "NOT A NUMBER");
        }
        return 0;

    }

    private void disp(TextView tv,String s){
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
    
    
}


