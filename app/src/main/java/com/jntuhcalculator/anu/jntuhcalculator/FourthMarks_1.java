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
 * Created by anu on 20/9/15.
 */
public class FourthMarks_1 extends Activity {

    TextView tv_LP,tv_DP,tv_DWDM,tv_CC,tv_CG,tv_AI,tv_LPLab,tv_DWMLab;
    TextView tv_Subjects41, tv_Internal41, tv_External41;
    EditText et_Int_LP, et_Int_DP, et_Int_DWDM, et_Int_CC, et_Int_CG, et_Int_AI, et_Int_LPLab, et_Int_DWMLab;
    EditText et_Ext_LP, et_Ext_DP, et_Ext_DWDM, et_Ext_CC, et_Ext_CG, et_Ext_AI, et_Ext_LPLab, et_Ext_DWMLab;
    Button btn_Cal41, btn_Ok41;
    int ILP,IDP,IDWDM,ICC,ICG,IAI,ILP_Lab,IDWM_Lab;
    int ELP,EDP,EDWDM,ECC,ECG,EAI,ELP_Lab,EDWM_Lab;
    int ITotal41,ETotal41,Total41;
    float Percentage41;
    String f41;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthmarks_1);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects41 = (TextView) findViewById(R.id.tv_Subject41);
        tv_Internal41 = (TextView) findViewById(R.id.tv_Internal41);
        tv_External41 = (TextView) findViewById(R.id.tv_External41);
        //SUBJECT TEXT VIEWS.
        tv_LP = (TextView) findViewById((R.id.tv_LP));
        tv_DP = (TextView) findViewById((R.id.tv_DP));
        tv_DWDM = (TextView) findViewById((R.id.tv_DWDM));
        tv_CC = (TextView) findViewById((R.id.tv_CC));
        tv_CG = (TextView) findViewById((R.id.tv_CG));
        tv_LPLab = (TextView) findViewById((R.id.tv_LP_Lab));
        tv_DWMLab = (TextView) findViewById((R.id.tv_DWM_Lab));
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_LP = (EditText) findViewById(R.id.et_Int_LP);
        et_Int_DP = (EditText) findViewById(R.id.et_Int_DP);
        et_Int_DWDM = (EditText) findViewById(R.id.et_Int_DWDM);
        et_Int_CC = (EditText) findViewById(R.id.et_Int_CC);
        et_Int_CG = (EditText) findViewById(R.id.et_Int_CG);
        et_Int_AI = (EditText) findViewById(R.id.et_Int_AI);
        et_Int_LPLab = (EditText) findViewById(R.id.et_Int_LPLab);
        et_Int_DWMLab = (EditText) findViewById(R.id.et_Int_DWMLab);
        //EXTERNAL
        et_Ext_LP = (EditText) findViewById(R.id.et_Ext_LP);
        et_Ext_DP = (EditText) findViewById(R.id.et_Ext_DP);
        et_Ext_DWDM = (EditText) findViewById(R.id.et_Ext_DWDM);
        et_Ext_CC = (EditText) findViewById(R.id.et_Ext_CC);
        et_Ext_CG = (EditText) findViewById(R.id.et_Ext_CG);
        et_Ext_AI = (EditText) findViewById(R.id.et_Ext_AI);
        et_Ext_LPLab = (EditText) findViewById(R.id.et_Ext_LPLab);
        et_Ext_DWMLab = (EditText) findViewById(R.id.et_Ext_DWMLab);
        //INITIALISING BUTTON
        btn_Cal41 = (Button) findViewById(R.id.btn_Cal41);
        btn_Ok41 = (Button) findViewById(R.id.btn_Ok41);
        //DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
        tv_LP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_LP, "LP:Linux Programming");
            }
        });
        tv_DP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_DP, "DP:Design Patterns");

            }
        });
        tv_DWDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_DWDM, "Data Warehouse and Data Mining");
            }
        });
        tv_CC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_CC, "Cloud Computing");
            }
        });
        tv_CG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_CG, "Computer Graphics");
            }
        });
        tv_AI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_AI, "Artificial Intelligence");
            }
        });
        tv_LPLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_LPLab, "Linux Programming Lab");
            }
        });
        tv_DWMLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_DWMLab, "Data WareHouse and Mining Lab");
            }
        });




        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                ILP = getIntValue(et_Int_LP);
                IDP = getIntValue(et_Int_DP);
                IDWDM = getIntValue(et_Int_DWDM);
                ICC = getIntValue(et_Int_CC);
                ICG = getIntValue(et_Int_CG);
                IAI = getIntValue(et_Int_AI);
                ILP_Lab = getIntValue(et_Int_LPLab);
                IDWM_Lab = getIntValue(et_Int_DWMLab);
                //EXTERNALS.
                ELP = getIntValue(et_Ext_LP);
                EDP = getIntValue(et_Ext_DP);
                EDWDM = getIntValue(et_Ext_DWDM);
                ECC = getIntValue(et_Ext_CC);
                ECG = getIntValue(et_Ext_CG);
                EAI = getIntValue(et_Ext_AI);
                ELP_Lab = getIntValue(et_Ext_LPLab);
                EDWM_Lab = getIntValue(et_Ext_DWMLab);

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal41 = (ILP+IDP+IDWDM+ICC+ICG+IAI+ILP_Lab+IDWM_Lab);
                //EXTERNAL TOTAL.
                ETotal41 = (ELP+EDP+EDWDM+ECC+ECG+EAI+ELP_Lab+EDWM_Lab);
                //TOTAL.
                Total41 = (ITotal41+ETotal41);
                //PERCENTAGE.
                Percentage41 = ((Total41/750)*100);
                f41 = Float.toString(Percentage41);
                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Cal41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthMarks_1.this,FourthResults_1.class);
                Bundle b = new Bundle();
                b.putInt("res41",Total41);
                b.putString("per41", f41);
                i.putExtras(b);
                startActivity(i);
                finish();
            }
        });




    }



    //SUB-FUNCTION FOR GETTING INTEGER FROM EDITTEXT.
    private int getIntValue(EditText et) throws NumberFormatException {
        int i = 0;
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
