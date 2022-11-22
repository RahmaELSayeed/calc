package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num_one = findViewById(R.id.num1) ;
        EditText num_two = findViewById(R.id.num2) ;
        EditText Res = findViewById(R.id.res) ;

        Button Add = findViewById(R.id.Plus) ;
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int NumberOne = Integer.parseInt(num_one.getText().toString()) ;
                int NumberTwo = Integer.parseInt(num_two.getText().toString()) ;
                int Result = NumberOne + NumberTwo ;
                Res.setText(Integer.toString(Result));   }     });

        Button Min = findViewById(R.id.Minus) ;
        Min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int NumberOne = Integer.parseInt(num_one.getText().toString()) ;
                int NumberTwo = Integer.parseInt(num_two.getText().toString()) ;
                int Result = NumberOne - NumberTwo ;
                Res.setText(Integer.toString(Result));   }     });

        Button mul = findViewById(R.id.Multiply) ;
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int NumberOne = Integer.parseInt(num_one.getText().toString()) ;
                int NumberTwo = Integer.parseInt(num_two.getText().toString()) ;
                int Result = NumberOne * NumberTwo ;
                Res.setText(Integer.toString(Result));   }     });


        Button Dmn = findViewById(R.id.Divi) ;
        Dmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int NumberOne = Integer.parseInt(num_one.getText().toString()) ;
                int NumberTwo = Integer.parseInt(num_two.getText().toString()) ;
                int Result = NumberOne / NumberTwo ;
                Res.setText(Integer.toString(Result));   }     });



    }
}