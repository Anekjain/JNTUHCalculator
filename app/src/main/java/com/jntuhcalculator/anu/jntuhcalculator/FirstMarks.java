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
 * Created by anu on 18/9/15.
 */
public class FirstMarks extends Activity {

    TextView tv_Subjects1, tv_Internal1, tv_External1;
    EditText et_Int_Eng, et_Int_M1, et_Int_MM, et_Int_Phy, et_Int_Chem, et_Int_Cp, et_Int_ElcsLab, et_Int_EpLab, et_Int_ItLab, et_Int_Draw;
    EditText et_Ext_Eng, et_Ext_M1, et_Ext_MM, et_Ext_Phy, et_Ext_Chem, et_Ext_Cp, et_Ext_ElcsLab, et_Ext_EpLab, et_Ext_ItLab, et_Ext_Draw;
    Button btn_Cal1, btn_Ok1;
    int IEng,IM1,IMM,IEPhy,IEChem,ICp,IEDraw,IELCS_Lab,IEP_LAB,IIT_LAB;
    int EEng,EM1,EMM,EEPhy,EEChem,ECp,EEDraw,EELCS_Lab,EEP_LAB,EIT_LAB;
    int ITotal1,ETotal1,Total1;
    float Percentage1;
    String f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marks_1);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects1 = (TextView) findViewById(R.id.tv_Subject1);
        tv_Internal1 = (TextView) findViewById(R.id.tv_Internal1);
        tv_External1 = (TextView) findViewById(R.id.tv_External1);
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_Eng = (EditText) findViewById(R.id.et_Int_Eng);
        et_Int_M1 = (EditText) findViewById(R.id.et_Int_M1);
        et_Int_MM = (EditText) findViewById(R.id.et_Int_MM);
        et_Int_Phy = (EditText) findViewById(R.id.et_Int_Phy);
        et_Int_Chem = (EditText) findViewById(R.id.et_Int_Chem);
        et_Int_Cp = (EditText) findViewById(R.id.et_Int_Cp);
        et_Int_ElcsLab = (EditText) findViewById(R.id.et_Int_ElcsLab);
        et_Int_EpLab = (EditText) findViewById(R.id.et_Int_EpLab);
        et_Int_ItLab = (EditText) findViewById(R.id.et_Int_ItLab);
        et_Int_Draw = (EditText) findViewById(R.id.et_Int_Draw);
        //EXTERNAL
        et_Ext_Eng = (EditText) findViewById(R.id.et_Ext_Eng);
        et_Ext_M1 = (EditText) findViewById(R.id.et_Ext_M1);
        et_Ext_MM = (EditText) findViewById(R.id.et_Ext_MM);
        et_Ext_Phy = (EditText) findViewById(R.id.et_Ext_Phy);
        et_Ext_Chem = (EditText) findViewById(R.id.et_Ext_Chem);
        et_Ext_Cp = (EditText) findViewById(R.id.et_Ext_Cp);
        et_Ext_ElcsLab = (EditText) findViewById(R.id.et_Ext_ElcsLab);
        et_Ext_EpLab = (EditText) findViewById(R.id.et_Ext_EpLab);
        et_Ext_ItLab = (EditText) findViewById(R.id.et_Ext_ItLab);
        et_Ext_Draw = (EditText) findViewById(R.id.et_Ext_Draw);
        //INITIALISING BUTTON
        btn_Cal1 = (Button) findViewById(R.id.btn_Cal1);
        btn_Ok1 = (Button) findViewById(R.id.btn_Ok1);




        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                IEng = getIntValue(et_Int_Eng);
                IM1 = getIntValue(et_Int_M1);
                IMM = getIntValue(et_Int_MM);
                IEPhy = getIntValue(et_Int_Phy);
                IEChem = getIntValue(et_Int_Chem);
                ICp = getIntValue(et_Int_Cp);
                IEDraw = getIntValue(et_Int_Draw);
                IELCS_Lab = getIntValue(et_Int_ElcsLab);
                IEP_LAB = getIntValue(et_Int_EpLab);
                //EXTERNALS.
                EEng = getIntValue(et_Ext_Eng);
                EM1 = getIntValue(et_Ext_M1);
                EMM = getIntValue(et_Ext_MM);
                EEPhy = getIntValue(et_Ext_Phy);
                EEChem = getIntValue(et_Ext_Chem);
                ECp = getIntValue(et_Ext_Cp);
                EEDraw = getIntValue(et_Ext_Draw);
                EELCS_Lab = getIntValue(et_Ext_ElcsLab);
                EEP_LAB = getIntValue(et_Ext_EpLab);
                EIT_LAB = getIntValue(et_Ext_ItLab);

             //CALCUATIONS.
                //INTERNAL TOTAL.
                ITotal1 = (IEng+IM1+IMM+IEPhy+IEChem+ICp+IEDraw+IELCS_Lab+IEP_LAB+IIT_LAB);
                //EXTERNAL TOTAL.
                ETotal1 = (EEng+EM1+EMM+EEPhy+EEChem+ECp+EEDraw+EELCS_Lab+EEP_LAB+EIT_LAB);
                //TOTAL.
                Total1 = (ITotal1+ETotal1);
                //PERCENTAGE.
                Percentage1 = (float)(Total1/10);
                f1 = Float.toString(Percentage1);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();

            }
        });

        btn_Cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstMarks.this,FirstResult.class);
                Bundle b = new Bundle();
                b.putInt("res1",Total1);
                b.putString("per1",f1);
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


  }

