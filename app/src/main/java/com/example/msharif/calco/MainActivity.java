package com.example.msharif.calco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int result = 0;
    static String operator = "";

    private void doCalc(int num){
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText(txtResult.getText().toString() + String.valueOf(num));
        if(result >0)
            switch (operator) {
                case"+":result = result+num;
                    break;
                case"-":result = result-num;
                    break;
                case"*":result = result*num;
                    break;
                case"/":result=result/num;
                    break;
            }
        else
            result=num;
    }
    private void setOperator(String op){
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText(txtResult.getText().toString() + " "+op+" ");
        operator = op;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnPlus_click(View view) {
        setOperator("+");
    }
    public void btnMinus_click(View view) {
        setOperator("-");
    }
    public void btnMultiply_click(View view) {
        setOperator("*");
    }
    public void btnDevi_click(View view) {
        setOperator("/");
    }
    public void btnEqual_click(View view) {
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText(txtResult.getText().toString() + " = " + String.valueOf(result));
    }
    public void btnClear_click(View view) {
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText("");
        result=0;
        operator="";
    }

    public void btn1_click(View view) {
        doCalc(1);
    }

    public void btn2_click(View view) {
        doCalc(2);
    }

    public void btn3_click(View view) {
        doCalc(3);
    }

    public void btn4_click(View view) {
        doCalc(4);
    }

    public void btn5_click(View view) {
        doCalc(5);
    }

    public void btn6_click(View view) {
        doCalc(6);
    }

    public void btn7_click(View view) {
        doCalc(7);
    }

    public void btn8_click(View view) {
        doCalc(8);
    }

    public void btn9_click(View view) {
        doCalc(9);
    }

    public void btn0_click(View view) {
        TextView txtresult = (TextView)findViewById(R.id.txtresult);
        result=result*10;
        txtresult.setText(String.valueOf(result));
    }
}
