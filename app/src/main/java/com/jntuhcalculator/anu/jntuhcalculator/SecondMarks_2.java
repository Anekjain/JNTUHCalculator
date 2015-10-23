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
public class SecondMarks_2 extends Activity {

    TextView tv_CO,tv_DBMS,tv_Java,tv_ES,tv_FLAT,tv_DAA,tv_JavaLab,tv_DBMSLab;
    TextView tv_Subjects22, tv_Internal22, tv_External22;
    EditText et_Int_CO, et_Int_DBMS, et_Int_Java, et_Int_ES, et_Int_FLAT, et_Int_DAA, et_Int_JavaLab, et_Int_DBMSLab;
    EditText et_Ext_CO, et_Ext_DBMS, et_Ext_Java, et_Ext_ES, et_Ext_FLAT, et_Ext_DAA, et_Ext_JavaLab, et_Ext_DBMSLab;
    Button btn_Cal22, btn_Ok22;
    int ICO,IDBMS,IJava,IES,IFLAT,IDAA,IJava_Lab,IDBMS_Lab;
    int ECO,EDBMS,EJava,EES,EFLAT,EDAA,EJava_Lab,EDBMS_Lab;
    int ITotal22,ETotal22,Total22;
    float Percentage22;
    String f22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondmarks_2);


        //INITIALISING VIEWS.
        //INITIALISING TEXT VIEWS.
        tv_Subjects22 = (TextView) findViewById(R.id.tv_Subject22);
        tv_Internal22 = (TextView) findViewById(R.id.tv_Internal22);
        tv_External22 = (TextView) findViewById(R.id.tv_External22);
        //SUBJECT TEXT VIEWS.
        tv_CO = (TextView) findViewById((R.id.tv_CO));
        tv_DBMS = (TextView) findViewById((R.id.tv_DBMS));
        tv_Java = (TextView) findViewById((R.id.tv_Java));
        tv_ES = (TextView) findViewById((R.id.tv_ES));
        tv_FLAT = (TextView) findViewById((R.id.tv_FLAT));
        tv_DAA = (TextView) findViewById((R.id.tv_DAA));
        tv_JavaLab = (TextView) findViewById((R.id.tv_Java_Lab));
        tv_DBMSLab = (TextView) findViewById((R.id.tv_DBMS_Lab));
        //INITIALISING EDIT TEXT.
        //INTERNAL
        et_Int_CO = (EditText) findViewById(R.id.et_Int_CO);
        et_Int_DBMS = (EditText) findViewById(R.id.et_Int_DBMS);
        et_Int_Java = (EditText) findViewById(R.id.et_Int_Java);
        et_Int_ES = (EditText) findViewById(R.id.et_Int_ES);
        et_Int_FLAT = (EditText) findViewById(R.id.et_Int_FLAT);
        et_Int_DAA = (EditText) findViewById(R.id.et_Int_DAA);
        et_Int_JavaLab = (EditText) findViewById(R.id.et_Int_JavaLab);
        et_Int_DBMSLab = (EditText) findViewById(R.id.et_Int_DBMSLab);
        //EXTERNAL
        et_Ext_CO = (EditText) findViewById(R.id.et_Ext_CO);
        et_Ext_DBMS = (EditText) findViewById(R.id.et_Ext_DBMS);
        et_Ext_Java = (EditText) findViewById(R.id.et_Ext_Java);
        et_Ext_ES = (EditText) findViewById(R.id.et_Ext_ES);
        et_Ext_FLAT = (EditText) findViewById(R.id.et_Ext_FLAT);
        et_Ext_DAA = (EditText) findViewById(R.id.et_Ext_DAA);
        et_Ext_JavaLab = (EditText) findViewById(R.id.et_Ext_JavaLab);
        et_Ext_DBMSLab = (EditText) findViewById(R.id.et_Ext_DBMSLab);
        //INITIALISING BUTTON
        btn_Cal22 = (Button) findViewById(R.id.btn_Cal22);
        btn_Ok22 = (Button) findViewById(R.id.btn_Ok22);

        //DISPLAYING SUBJECT NAMES WHEN TEXT VIEW IS CLICKED.
        tv_CO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_CO, "CO:Computer Organisation");
            }
        });
        tv_DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_DBMS, "DBMS:Database Management System");

            }
        });
        tv_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_Java, "Java");
            }
        });
        tv_ES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_ES, "ES:Environmental Studies");
            }
        });
        tv_FLAT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp(tv_FLAT, "FLAT:Formal Language & Automata Theory");
            }
        });
        tv_DAA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_DAA, "DAA:Design & Analysis of Algorithm");
            }
        });
        tv_JavaLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { disp(tv_JavaLab, "Java Lab");
            }
        });
        tv_DBMSLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {disp(tv_DBMSLab, "DBMS Lab");
            }
        });





        //WHEN SAVE BUTTON IS CLICKED.
        btn_Ok22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //GETTING VALUES FROM EDIT TEXT.
                //INTERNALS.
                ICO = getIntValue(et_Int_CO);
                IDBMS = getIntValue(et_Int_DBMS);
                IJava = getIntValue(et_Int_Java);
                IES = getIntValue(et_Int_ES);
                IFLAT = getIntValue(et_Int_FLAT);
                IDAA = getIntValue(et_Int_DAA);
                IJava_Lab = getIntValue(et_Int_JavaLab);
                IDBMS_Lab = getIntValue(et_Int_DBMSLab);
                //EXTERNALS.
                ECO = getIntValue(et_Ext_CO);
                EDBMS = getIntValue(et_Ext_DBMS);
                EJava = getIntValue(et_Ext_Java);
                EES = getIntValue(et_Ext_ES);
                EFLAT = getIntValue(et_Ext_FLAT);
                EDAA = getIntValue(et_Ext_DAA);
                EJava_Lab = getIntValue(et_Ext_JavaLab);
                EDBMS_Lab = getIntValue(et_Ext_DBMSLab);

                //CALCULATIONS.
                //INTERNAL TOTAL.
                ITotal22 = (ICO+IDBMS+IJava+IES+IFLAT+IDAA+IJava_Lab+IDBMS_Lab);
                //EXTERNAL TOTAL.
                ETotal22 = (ECO+EDBMS+EJava+EES+EFLAT+EDAA+EJava_Lab+EDBMS_Lab);
                //TOTAL.
                Total22 = (ITotal22+ETotal22);
                //PERCENTAGE.
                Percentage22 = ((Total22/750)*100);
                f22 = Float.toString(Percentage22);

                //CREATING TOAST.
                Toast.makeText(getBaseContext(),"Press Result",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Cal22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondMarks_2.this,SecondResults_2.class);
                Bundle b = new Bundle();
                b.putInt("res22",Total22);
                b.putString("per22",f22);
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
