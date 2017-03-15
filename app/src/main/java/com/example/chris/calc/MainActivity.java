package com.example.chris.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc= (Button) findViewById(R.id.calc);
        final EditText dividend= (EditText) findViewById(R.id.dividend);
        final EditText divisor = (EditText) findViewById(R.id.divisor);
        final TextView erg = (TextView) findViewById(R.id.ergebniss);


        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String zählerString = dividend.getText().toString();
                String nennerString = divisor.getText().toString();

                //just in case
                if(zählerString.matches("^[0-9]*[.]?[0-9]*$") && nennerString.matches("^[0-9]*[.]?[0-9]*$")){
                    double zähler = Double.parseDouble(zählerString);
                    double nenner = Double.parseDouble(nennerString);
                    double ergebniss = (double)zähler/nenner;
                    erg.setText(ergebniss+"");

                }else{
                    erg.setText("No letters");
                }



            }
        });



    }

}
