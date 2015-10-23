package com.jntuhcalculator.anu.jntuhcalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
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
public class SecondMarks_1 extends Activity {

    TextView tv_PS,tv_MFCS,tv_DS,tv_DLD,tv_EDC,tv_BEE,tv_EELab,tv_DSLab;
    TextView tv_Subjects21, tv_Internal21, tv_External21;
    EditText et_Int_PS, et_Int_MFCS, et_Int_DS, et_Int_DLD, et_Int_EDC, et_Int_BEE, et_Int_EELab, et_Int_DSLab;
    EditText et_Ext_PS, et_Ext_MFCS, et_Ext_DS, et_Ext_DLD, et_Ext_EDC, et_Ext_BEE, et_Ext_EELab, et_Ext_DSLab;
    Button btn_Cal21, btn_Ok21;
    int IPS,IMFCS,IDS,IDLD,IEDC,IBEE,IEE_Lab,IDS_Lab;
    int EPS,EMFCS,EDS,EDLD,EEDC,EBEE,EEE_Lab,EDS_Lab;
    int ITotal21,ETotal21,Total21;
    float Percentage21;
    String f21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondmarks_1);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects21 = (TextView) findViewById(R.id.tv_Subject21);
        tv_Internal21 = (TextView) findViewById(R.id.tv_Internal21);
        tv_External21 = (TextView) findViewById(R.id.tv_External21);
        //SUBJECT TEXT VIEWS.
        tv_PS = (TextView) findViewById((R.id.tv_PS));
        tv_MFCS = (TextView) findViewById((R.id.tv_MFCS));
        tv_DS = (TextView) findViewById((R.id.tv_DS));
        tv_DLD = (TextView) findViewById((R.id.tv_DLD));
        tv_EDC = (TextView) findViewById((R.id.tv_EDC));
        tv_BEE = (TextView) findViewById((R.id.tv_BEE));
        tv_EELab = (TextView) findViewById((R.id.tv_EE_Lab));
        tv_DSLab = (TextView) findViewById((R.id.tv_DS_Lab));
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_PS = (EditText) findViewById(R.id.et_Int_PS);
        et_Int_MFCS = (EditText) findViewById(R.id.et_Int_MFCS);
        et_Int_DS = (EditText) findViewById(R.id.et_Int_DS);
        et_Int_DLD = (EditText) findViewById(R.id.et_Int_DLD);
        et_Int_EDC = (EditText) findViewById(R.id.et_Int_EDC);
        et_Int_BEE = (EditText) findViewById(R.id.et_Int_BEE);
        et_Int_EELab = (EditText) findViewById(R.id.et_Int_EELab);
        et_Int_DSLab = (EditText) findViewById(R.id.et_Int_DSLab);
        //EXTERNAL
        et_Ext_PS = (EditText) findViewById(R.id.et_Ext_PS);
        et_Ext_MFCS = (EditText) findViewById(R.id.et_Ext_MFCS);
        et_Ext_DS = (EditText) findViewById(R.id.et_Ext_DS);
        et_Ext_DLD = (EditText) findViewById(R.id.et_Ext_DLD);
        et_Ext_EDC = (EditText) findViewById(R.id.et_Ext_EDC);
        et_Ext_BEE = (EditText) findViewById(R.id.et_Ext_BEE);
        et_Ext_EELab = (EditText) findViewById(R.id.et_Ext_EELab);
        et_Ext_DSLab = (EditText) findViewById(R.id.et_Ext_DSLab);
        //INITIALISING BUTTON
        btn_Cal21 = (Button) findViewById(R.id.btn_Cal21);
        btn_Ok21 = (Button) findViewById(R.id.btn_Ok21);
//DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
        tv_PS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_PS, "PS:Probabilty & Statistics");
            }
        });
        tv_MFCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_MFCS, "MFCS:Mathematical Foundation Of Computer Science");

            }
        });
        tv_DS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_DS, "DS:Data Structures");
            }
        });
        tv_DLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_DLD, "DLD:Digital Logic Design");
            }
        });
        tv_EDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_EDC, "EDC:Electronic Devices & Circuits");
            }
        });
        tv_BEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_BEE, "BEE:Basic Electrical Engineering");
            }
        });
        tv_EELab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_EELab, "Electrical & Electronics Lab");
            }
        });
        tv_DSLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_DSLab, "Data Structures Lab");
            }
        });


        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                IPS = getIntValue(et_Int_PS);
                IMFCS = getIntValue(et_Int_MFCS);
                IDS = getIntValue(et_Int_DS);
                IDLD = getIntValue(et_Int_DLD);
                IEDC = getIntValue(et_Int_EDC);
                IBEE = getIntValue(et_Int_BEE);
                IEE_Lab = getIntValue(et_Int_EELab);
                IDS_Lab = getIntValue(et_Int_DSLab);
                //EXTERNALS.
                EPS = getIntValue(et_Ext_PS);
                EMFCS = getIntValue(et_Ext_MFCS);
                EDS = getIntValue(et_Ext_DS);
                EDLD = getIntValue(et_Ext_DLD);
                EEDC = getIntValue(et_Ext_EDC);
                EBEE = getIntValue(et_Ext_BEE);
                EEE_Lab = getIntValue(et_Ext_EELab);
                EDS_Lab = getIntValue(et_Ext_DSLab);

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal21 = (IPS+IMFCS+IDS+IDLD+IEDC+IBEE+IEE_Lab+IDS_Lab);
                //EXTERNAL TOTAL.
                ETotal21 = (EPS+EMFCS+EDS+EDLD+EEDC+EBEE+EEE_Lab+EDS_Lab);
                //TOTAL.
                Total21 = (ITotal21+ETotal21);
                //PERCENTAGE.
                Percentage21 = ((Total21/750)*100);
                f21 = Float.toString(Percentage21);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

          btn_Cal21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondMarks_1.this,SecondResults_1.class);
                Bundle b = new Bundle();
                b.putInt("res21",Total21);
                b.putString("per21",f21);
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
