package com.jntuhcalculator.anu.jntuhcalculator;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

/**
 * Created by anu on 18/9/15.
 */
public class SecondResults_2 extends Activity {

    EditText et_Total22,et_Percentage22;
    Button btn_Exit22;
    int sres22;
    String sper22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_2result);

        //INITIALISING VIEWS.
        et_Total22 = (EditText) findViewById(R.id.et_Total22);
        et_Percentage22 = (EditText) findViewById(R.id.et_Percentage22);
        btn_Exit22 = (Button) findViewById(R.id.btn_Exit22);

        //GETTING DATA FROM PREVIOUS ACTIVITY.
        Bundle b = getIntent().getExtras();
        sres22 = b.getInt("res22", 0);
        sper22 = b.getString("per22");

        //Converting Float Into String.
        //f = Float.toString(sper1);

        //SETTING RESULTS.
        et_Total22.setText(sres22+"");
        et_Percentage22.setText(sper22+"%");

        //WHEN EXIT IS CLICKED.
        btn_Exit22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), YearDetails.class);
                i.putExtra("Total",sres22);
                startActivity(i);
                finish();
                System.exit(0);
            }
        });


    }
}


