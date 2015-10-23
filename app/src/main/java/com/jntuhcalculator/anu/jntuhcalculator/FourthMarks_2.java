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
public class FourthMarks_2 extends Activity {

    TextView tv_MS,tv_WS,tv_D_sec,tv_PW,tv_MP,tv_CV,tv_Sem;
    TextView tv_Subjects42, tv_Internal42, tv_External42;
    EditText et_Int_MS, et_Int_WS, et_Int_D_Sec, et_Int_MP, et_Int_Sem, et_Int_PW, et_Int_CV;
    EditText et_Ext_MS, et_Ext_WS, et_Ext_D_sec, et_Ext_MP, et_Ext_Sem, et_Ext_PW, et_Ext_CV;
    Button btn_Cal42, btn_Ok42;
    int IMS,IWS,ID_sec;
    int EMS,EWS,ED_sec;
    int MP,Sem,PW,CV;
    int ITotal42,ETotal42,Total42;
    float Percentage42;
    String f42;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthmarks_2);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects42 = (TextView) findViewById(R.id.tv_Subject42);
        tv_Internal42 = (TextView) findViewById(R.id.tv_Internal42);
        tv_External42 = (TextView) findViewById(R.id.tv_External42);
        tv_MS = (TextView) findViewById((R.id.tv_MS));
        tv_WS = (TextView) findViewById((R.id.tv_WS));
        tv_D_sec = (TextView) findViewById((R.id.tv_D_Sec));
        tv_MP = (TextView) findViewById((R.id.tv_MP));
        tv_Sem = (TextView) findViewById((R.id.tv_Sem));
        tv_PW = (TextView) findViewById((R.id.tv_PW));
        tv_CV = (TextView) findViewById((R.id.tv_CV));
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_MS = (EditText) findViewById(R.id.et_Int_MS);
        et_Int_WS = (EditText) findViewById(R.id.et_Int_WS);
        et_Int_D_Sec = (EditText) findViewById(R.id.et_Int_D_Sec);
        et_Int_MP = (EditText) findViewById(R.id.et_Int_MP);
        et_Int_Sem = (EditText) findViewById(R.id.et_Int_Sem);
        et_Int_PW = (EditText) findViewById(R.id.et_Int_PW);
        et_Int_CV = (EditText) findViewById(R.id.et_Int_CV);
        //EXTERNAL
        et_Ext_MS = (EditText) findViewById(R.id.et_Ext_MS);
        et_Ext_WS = (EditText) findViewById(R.id.et_Ext_WS);
        et_Ext_D_sec = (EditText) findViewById(R.id.et_Ext_D_Sec);
        et_Ext_MP = (EditText) findViewById(R.id.et_Ext_MP);
        et_Ext_Sem = (EditText) findViewById(R.id.et_Ext_Sem);
        et_Ext_PW = (EditText) findViewById(R.id.et_Ext_PW);
        et_Ext_CV = (EditText) findViewById(R.id.et_Ext_CV);
        //INITIALISING BUTTON
        btn_Cal42 = (Button) findViewById(R.id.btn_Cal42);
        btn_Ok42 = (Button) findViewById(R.id.btn_Ok42);
        //UNEDITABLE TEXT FIELD.
        et_Ext_MP.setEnabled(false);
        et_Ext_Sem.setEnabled(false);
        et_Ext_PW.setEnabled(false);
        et_Ext_CV.setEnabled(false);
       //DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
        tv_MS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_MS, "MS:Management Science");
            }
        });
        tv_D_sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_D_sec, "DS:Data Security");

            }
        });
        tv_MP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_MP, "Mini Project");
            }
        });
        tv_Sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_Sem, "Seminar");
            }
        });
        tv_PW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_PW, "PW:Project Work");
            }
        });
        tv_CV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_CV, "Comphrehensive Viva");
            }
        });
        tv_WS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_WS, "WS:Web Services");
            }
        });









        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                IMS = getIntValue(et_Int_MS);
                IWS = getIntValue(et_Int_WS);
                ID_sec = getIntValue(et_Int_D_Sec);
                MP = getIntValue(et_Int_MP);
                Sem = getIntValue(et_Int_Sem);
                PW = getIntValue(et_Int_PW);
                CV = getIntValue(et_Int_CV);
                //EXTERNALS.
                EMS = getIntValue(et_Ext_MS);
                EWS = getIntValue(et_Ext_WS);
                ED_sec = getIntValue(et_Ext_D_sec);

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal42 = (IMS + IWS + ID_sec + MP + Sem + PW + CV);
                //EXTERNAL TOTAL.
                ETotal42 = (EMS + EWS + ED_sec);
                //TOTAL.
                Total42 = (ITotal42 + ETotal42);
                //PERCENTAGE.
                Percentage42 =  ((Total42/700)*100);
                f42 = Float.toString(Percentage42);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Cal42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FourthMarks_2.this, FourthResults_2.class);
                Bundle b = new Bundle();
                b.putInt("res42", Total42);
                b.putString("per42", f42);
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
           Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }
}
