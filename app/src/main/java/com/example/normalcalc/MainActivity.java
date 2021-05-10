package com.example.normalcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText frstInput, scndInput;
    private Button add,sub,prod,div;
    private TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frstInput = findViewById(R.id.frstEdittxt);
        scndInput = findViewById(R.id.scndEditTxt);
        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.subBtn);
        prod = findViewById(R.id.prodBtn);
        div = findViewById(R.id.divBtn);
        showResult = findViewById(R.id.showResult);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        prod.setOnClickListener(this);
        div.setOnClickListener(this);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {


            try {
                String num1 = frstInput.getText().toString();
                String num2 = scndInput.getText().toString();

                double one = Double.parseDouble(num1);
                double two = Double.parseDouble(num2);


                if (v.getId() == R.id.addBtn){
                    double answer = one + two;
                    showResult.setText("The additon is "+ frstInput.getText() +" and " + scndInput.getText() + " is: " + answer);
                }
                else if(v.getId() == R.id.prodBtn){
                    double answer = one * two;
                    showResult.setText("The production is "+ frstInput.getText() +" and " + scndInput.getText() + " is: " + answer);
                }
                else if(v.getId() == R.id.divBtn){
                    double answer = one / two;
                    showResult.setText("The divison is "+ frstInput.getText() +" and " + scndInput.getText() + " is: " + answer);
                }

                else {
                    double answer = one - two;
                    showResult.setText("The substaction of "+ frstInput.getText() +" and " + scndInput.getText() + " is: " + answer);
                }
            }catch (Exception e){
                showResult.setText("You haven't put anything yet");
            }

    }
}