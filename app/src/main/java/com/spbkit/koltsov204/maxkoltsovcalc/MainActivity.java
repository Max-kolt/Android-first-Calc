package com.spbkit.koltsov204.maxkoltsovcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText firstField;
    EditText secondField;
    TextView resultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstField = findViewById(R.id.firstNumber);
        secondField = findViewById(R.id.secondNumber);
        resultField = findViewById(R.id.resultNumber);
    }

    public void Operation(View v) {
        String aTxt = firstField.getText().toString();
        String bTxt = secondField.getText().toString();

        double a, b, c = 0;

        try {
            a = Double.parseDouble(aTxt);
            b = Double.parseDouble(bTxt);
        }
        catch(Exception e){
            resultField.setText(getString(R.string.InputError));
            return;
        }

        if(v.getId() == R.id.btnAdd){
            c = a + b;
        }
        else if(v.getId() == R.id.btnSub){
            c = a - b;
        }
        else if(v.getId() == R.id.btnMul){
            c = a * b;
        }
        else if(v.getId() == R.id.btnMul){
            c = a * b;
        }
        else if(v.getId() == R.id.btnDiv && b!=0){
            c = a / b;
        }
        else{
            resultField.setText("Делить на ноль нельзя");
            return;
        }
        resultField.setText(String.valueOf(c));



    }

}