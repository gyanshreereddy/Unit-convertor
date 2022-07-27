package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    EditText textView;
    String cost;
    double amt;
    RadioButton a,b,c;
    Button button;
    double sr;
    Switch round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.cost);
        button=findViewById(R.id.button);
        a=findViewById(R.id.radioButton);
        b=findViewById(R.id.radioButton2);
        c=findViewById(R.id.radioButton3);
        round=findViewById(R.id.switch1);
        textView2=findViewById(R.id.textView2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cost=textView.getText().toString();
                amt=Double.parseDouble(cost);
//
                 if(a.isChecked()){
                    sr=20*amt;
                }
                else if(b.isChecked()){
                    sr=10*amt/100;
                }
                else{
                    sr=2*amt/100;
                }
//                if(round.isChecked()){
//
//                    sr=Math.floor(sr);
//                }

                textView2.setText(""+sr);

                textView.setText(""+0);

            }
        });



    }
}