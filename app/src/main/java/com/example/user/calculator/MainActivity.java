package com.example.user.calculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button mul;
    private Button add;
    private Button sub;
    private Button equal;
    private Button clear;
    private Button div;
    private TextView result;
    private final char addition = '+';
    private final char subtraction = '-';
    private final char multiplication = '*';
    private final char division = '/';
    private char Do;
    private double val1;
    private double val2;
    private final char Equal=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setup();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString() + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString()+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().toString()+"9");

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setup();
                operation();
                Do=addition;
                result.setText(String.valueOf(val1)+"+");


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                Do=subtraction;
                result.setText(String.valueOf(val1)+"-");



            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                Do=multiplication;
                result.setText(String.valueOf(val1)+"*");


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                Do=division;
                result.setText(String.valueOf(val1)+"/");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(null);



            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                Do=Equal;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));

            }
        });
    }

    public void setup() {

        Button zero = (Button) findViewById(R.id.btn0);
        Button one = (Button) findViewById(R.id.btn1);
        Button two = (Button) findViewById(R.id.btn2);
        Button three = (Button) findViewById(R.id.btn3);
        Button four = (Button) findViewById(R.id.btn4);
        Button five = (Button) findViewById(R.id.btn5);
        Button six = (Button) findViewById(R.id.btn6);
        Button seven = (Button) findViewById(R.id.btn7);
        Button eight = (Button) findViewById(R.id.btn8);
        Button nine = (Button) findViewById(R.id.btn9);
        Button mul = (Button) findViewById(R.id.btnMul);
        Button add = (Button) findViewById(R.id.btnAdd);
        Button sub = (Button) findViewById(R.id.btnSub);
        Button div = (Button) findViewById(R.id.btnDiv);
        Button equal = (Button) findViewById(R.id.btnEqual);
        Button clear = (Button) findViewById(R.id.btnClear);
        TextView result = (TextView) findViewById(R.id.tvResult);

    }
    private void operation(){
        val1 = Double.parseDouble(result.getText().toString());
        val2 = Double.parseDouble(result.getText().toString());

        switch (Do){
            case(addition):
                val1=val1+val2;
                break;
            case(subtraction):
                val1=val1-val2;
                break;
            case(multiplication):
                val1=val1*val2;
                break;
            case(division):
                val1=val1/val2;
                break;
            case(Equal):
                break;
        }
    }






}
