package com.example.android.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    //setting some variables

    private Button calc;
    private EditText g1;
    private EditText g2;
    private EditText g3;
    private EditText g4;
    private EditText g5;
    private TextView result;
    private TextView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//getting variable contents for usage
        g1 = findViewById(R.id.editText4);
        g2 = findViewById(R.id.editText5);
        g3 = findViewById(R.id.editText7);
        g4 = findViewById(R.id.editText8);
        g5 = findViewById(R.id.editText9);
        calc = findViewById(R.id.button);
        result = findViewById(R.id.editText6);
        background = findViewById(R.id.textView);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //calculations and output provided the input is not null

                if ((g1.getText().length()>0)&&(g2.getText().length()>0)&&(g3.getText().length()>0)&&(g4.getText().length()>0)&&(g5.getText().length()>0)) {

                    //casting and calculating

                    double x = Double.parseDouble(g1.getText().toString());
                    double y = Double.parseDouble(g2.getText().toString());
                    double a = Double.parseDouble(g3.getText().toString());
                    double b = Double.parseDouble(g4.getText().toString());
                    double c = Double.parseDouble(g5.getText().toString());
                    double z = (x + y + a + b + c) / 5;
                    result.setText(String.valueOf(z));
                    calc.setTextColor(Color.WHITE);

                    //changing color based on result and outputting result

                    if (z>=80)

                        background.setBackgroundColor(Color.GREEN);


                    else if (z<=60)
                        background.setBackgroundColor(Color.RED);


                    else
                        background.setBackgroundColor(Color.YELLOW);



                }

                //sends message to user if input field is blank

                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter Grades",Toast.LENGTH_LONG);
                    toast.show();
                }

                calc.setTextColor(Color.DKGRAY);
            }
        });
    }
}
