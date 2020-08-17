package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btnOk;
    final EditText num1 = findViewById(R.id.editTextNo1);
    final EditText num2 = findViewById(R.id.editTextNo2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOk = findViewById(R.id.btn_OK);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startActivity(new Intent(FirstActivity.this, SecondActivity.class));

                //toast
                Context context = getApplicationContext();
                CharSequence msg = "Moving to second page";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,msg,duration);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();

                //getting inputs as strings
                String number1 = num1.getText().toString();
                int passNum1 = Integer.parseInt(number1);

                String number2 = num2.getText().toString();
                int passNum2 = Integer.parseInt(number2);

                //intent
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);

                //extras
                i.putExtra("NUMBER1",passNum1);
                i.putExtra("NUMBER2",passNum2);

                startActivity(i);
            }
        });

    }
}