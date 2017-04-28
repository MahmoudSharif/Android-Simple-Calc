package com.example.msharif.calco;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static int result = 0;
    static int temp = 0;
    static String operator = "";
    static int leftSide = 0;
    static int rightSide = 0;

    private void SetSides(int num){
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText(txtResult.getText().toString() + String.valueOf(num));
        if(operator.length() > 0)
        {
            if(rightSide > 0)
                rightSide = (rightSide * 10) + num;
            else
                rightSide = num;
        }
        else {
            if (leftSide > 0)
                leftSide = (leftSide * 10) + num;
            else
                leftSide = num;
        }
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

        if (operator.length() > 0) {
            switch (operator) {
                case "+":
                    result = leftSide + rightSide;
                    break;
                case "-":
                    result = leftSide - rightSide;
                    break;
                case "*":
                    result = leftSide * rightSide;
                    break;
                case "/":
                    result = leftSide / rightSide;
                    break;
            }
            txtResult.setText(txtResult.getText().toString() + " = " + String.valueOf(result));
        }
        else
            Toast.makeText(this,"Please choose operator",Toast.LENGTH_SHORT).show();


    }
    public void btnClear_click(View view) {
        TextView txtResult = (TextView) findViewById(R.id.txtresult);
        txtResult.setText("");
        result=0;
        leftSide=0;
        rightSide=0;
        operator="";
    }

    public void btn1_click(View view) {
        SetSides(1);
    }

    public void btn2_click(View view) {
        SetSides(2);
    }

    public void btn3_click(View view) {
        SetSides(3);
    }

    public void btn4_click(View view) {
        SetSides(4);
    }

    public void btn5_click(View view) {
        SetSides(5);
    }

    public void btn6_click(View view) {
        SetSides(6);
    }

    public void btn7_click(View view) {
        SetSides(7);
    }

    public void btn8_click(View view) {
        SetSides(8);
    }

    public void btn9_click(View view) {
        SetSides(9);
    }

    public void btn0_click(View view) {
        SetSides(0);
    }
}
