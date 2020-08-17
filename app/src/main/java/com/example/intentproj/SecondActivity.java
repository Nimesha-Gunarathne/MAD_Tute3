package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button add;
    private Button min;
    private Button mul;
    private Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView No1 = findViewById(R.id.view_No1);
        TextView No2 = findViewById(R.id.view_No2);

        add = findViewById(R.id.btn_ADD);
        min = findViewById(R.id.btn_MIN);
        mul = findViewById(R.id.btn_MUL);
        div = findViewById(R.id.btn_DIV);

        //getting extra values
        Intent i = getIntent();
        final int No_1 = i.getIntExtra("Num1",0);
        final int No_2 = i.getIntExtra("Num2",0);

        //setting values
        No1.setText(String.valueOf(No_1));
        No2.setText(String.valueOf(No_2));

        //add button (+)
        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView ans = findViewById(R.id.txtView_answer);

                int answer = No_1 + No_2;
                ans.setText(String.valueOf(No_1 + " + " + No_2 + " = " + answer));
            }
        });

        //minus button (-)
        min.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView ans = findViewById(R.id.txtView_answer);

                int answer = No_1 - No_2;
                ans.setText(String.valueOf(No_1 + " - " + No_2 + " = " + answer));
            }
        });

        //multiply button (*)
        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView ans = findViewById(R.id.txtView_answer);

                int answer = No_1 * No_2;
                ans.setText(String.valueOf(No_1 + " * " + No_2 + " = " + answer));
            }
        });

        //divide button (/)
        div.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView ans = findViewById(R.id.txtView_answer);

                int answer = No_1 / No_2;
                ans.setText(String.valueOf(No_1 + " / " + No_2 + " = " + answer));
            }
        });
    }
}