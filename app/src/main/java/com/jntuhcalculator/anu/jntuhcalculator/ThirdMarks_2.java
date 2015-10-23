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
public class ThirdMarks_2 extends Activity {
    TextView tv_Dr_S,tv_IS,tv_OOAA,tv_STM,tv_MEFA,tv_WT,tv_CTWTLab,tv_AECSLab;
    TextView tv_Subjects32, tv_Internal32, tv_External32;
    EditText et_Int_Dr_s, et_Int_IS, et_Int_OOAA, et_Int_STM, et_Int_MEFA, et_Int_WT, et_Int_CTWTLab, et_Int_AECSLab;
    EditText et_Ext_Dr_s, et_Ext_IS, et_Ext_OOAA, et_Ext_STM, et_Ext_MEFA, et_Ext_WT, et_Ext_CTWTLab, et_Ext_AECSLab;
    Button btn_Cal32, btn_Ok32;
    int IDr_s,IIS,IOOAA,ISTM,IMEFA,IWT,ICTWT_Lab,IAECS_Lab;
    int EDr_s,EIS,EOOAA,ESTM,EMEFA,EWT,ECTWT_Lab,EAECS_Lab;
    int ITotal32,ETotal32,Total32;
    float Percentage32;
    String f32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdmarks_2);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects32 = (TextView) findViewById(R.id.tv_Subject32);
        tv_Internal32 = (TextView) findViewById(R.id.tv_Internal32);
        tv_External32 = (TextView) findViewById(R.id.tv_External32);
        //SUBJECT TEXT VIEWS.
        tv_Dr_S = (TextView) findViewById((R.id.tv_Dr_S));
        tv_IS = (TextView) findViewById((R.id.tv_IS));
        tv_OOAA = (TextView) findViewById((R.id.tv_OOAA));
        tv_STM = (TextView) findViewById((R.id.tv_STM));
        tv_MEFA = (TextView) findViewById((R.id.tv_MEFA));
        tv_WT = (TextView) findViewById((R.id.tv_WT));
        tv_CTWTLab = (TextView) findViewById((R.id.tv_CTWT_Lab));
        tv_AECSLab = (TextView) findViewById((R.id.tv_AECS_Lab));

        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_Dr_s = (EditText) findViewById(R.id.et_Int_Dr_s);
        et_Int_IS = (EditText) findViewById(R.id.et_Int_IS);
        et_Int_OOAA = (EditText) findViewById(R.id.et_Int_OOAA);
        et_Int_STM = (EditText) findViewById(R.id.et_Int_STM);
        et_Int_MEFA = (EditText) findViewById(R.id.et_Int_MEFA);
        et_Int_WT = (EditText) findViewById(R.id.et_Int_WT);
        et_Int_CTWTLab = (EditText) findViewById(R.id.et_Int_CTWTLab);
        et_Int_AECSLab = (EditText) findViewById(R.id.et_Int_AECSLab);
        //EXTERNAL
        et_Ext_Dr_s = (EditText) findViewById(R.id.et_Ext_Dr_s);
        et_Ext_IS = (EditText) findViewById(R.id.et_Ext_IS);
        et_Ext_OOAA = (EditText) findViewById(R.id.et_Ext_OOAA);
        et_Ext_STM = (EditText) findViewById(R.id.et_Ext_STM);
        et_Ext_MEFA = (EditText) findViewById(R.id.et_Ext_MEFA);
        et_Ext_WT = (EditText) findViewById(R.id.et_Ext_WT);
        et_Ext_CTWTLab = (EditText) findViewById(R.id.et_Ext_CTWTLab);
        et_Ext_AECSLab = (EditText) findViewById(R.id.et_Ext_AECSLab);
        //INITIALISING BUTTON
        btn_Cal32 = (Button) findViewById(R.id.btn_Cal32);
        btn_Ok32 = (Button) findViewById(R.id.btn_Ok32);



        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                IDr_s = getIntValue(et_Int_Dr_s);
                IIS = getIntValue(et_Int_IS);
                IOOAA = getIntValue(et_Int_OOAA);
                ISTM = getIntValue(et_Int_STM);
                IMEFA = getIntValue(et_Int_MEFA);
                IWT = getIntValue(et_Int_WT);
                ICTWT_Lab = getIntValue(et_Int_CTWTLab);
                IAECS_Lab = getIntValue(et_Int_AECSLab);
                //EXTERNALS.
                EDr_s = getIntValue(et_Ext_Dr_s);
                EIS = getIntValue(et_Ext_IS);
                EOOAA = getIntValue(et_Ext_OOAA);
                ESTM = getIntValue(et_Ext_STM);
                EMEFA = getIntValue(et_Ext_MEFA);
                EWT = getIntValue(et_Ext_WT);
                ECTWT_Lab = getIntValue(et_Ext_CTWTLab);
                EAECS_Lab = getIntValue(et_Ext_AECSLab);
                //DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
                tv_Dr_S.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        disp(tv_Dr_S, "DS:Distributed Systems ");
                    }
                });
                tv_IS.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        disp(tv_IS, "IS:Information Security");

                    }
                });
                tv_OOAA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {disp(tv_OOAA, "Object Oriented Analysis & Design");
                    }
                });
                tv_STM.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        disp(tv_STM, "Software Testing Methodologies");
                    }
                });
                tv_MEFA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        disp(tv_MEFA, "Managerial Economical & Financial Analysis");
                    }
                });
                tv_WT.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) { disp(tv_WT, "Web Technologies");
                    }
                });
                tv_CTWTLab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) { disp(tv_CTWTLab, "Case Tool & Web Technologies Lab");
                    }
                });
                tv_AECSLab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {disp(tv_AECSLab, "Adv. English Communication Skills Lab");
                    }
                });

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal32 = (IDr_s+IIS+IOOAA+ISTM+IMEFA+IWT+ICTWT_Lab+IAECS_Lab);
                //EXTERNAL TOTAL.
                ETotal32 = (EDr_s+EIS+EOOAA+ESTM+EMEFA+EWT+ECTWT_Lab+EAECS_Lab);
                //TOTAL.
                Total32 = (ITotal32+ETotal32);
                //PERCENTAGE.
                Percentage32 = ((Total32/750)*100);
                f32 = Float.toString(Percentage32);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Cal32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ThirdMarks_2.this,ThirdResults_2.class);
                Bundle b = new Bundle();
                b.putInt("res32",Total32);
                b.putString("per32", f32);
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
