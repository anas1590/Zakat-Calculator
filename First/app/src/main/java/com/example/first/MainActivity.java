package com.example.first;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("HELLO");
    }

    public void calculateBtnClick(View view){
        TextInputEditText txt1 = findViewById(R.id.textInputEditText);
        TextInputEditText txt2 = findViewById(R.id.textInputEditText2);
        TextInputEditText txt3 = findViewById(R.id.textInputEditText3);
        TextInputEditText txt4 = findViewById(R.id.textInputEditText4);
        TextInputEditText txt5 = findViewById(R.id.textInputEditText5);
        TextInputEditText txt6 = findViewById(R.id.textInputEditText6);
        TextInputEditText txt7 = findViewById(R.id.textInputEditText7);
        TextInputEditText txt8 = findViewById(R.id.textInputEditText8);

        int cash = Integer.parseInt(String.valueOf(txt1.getText()));
        int stockValue = Integer.parseInt(String.valueOf(txt2.getText()));
        int givenLoan = Integer.parseInt(String.valueOf(txt3.getText()));
        int borrow = Integer.parseInt(String.valueOf(txt4.getText()));
        int goldValue = Integer.parseInt(String.valueOf(txt6.getText()));
        int silverValue = Integer.parseInt(String.valueOf(txt5.getText()));
        double gold = Integer.parseInt(String.valueOf(txt7.getText()));
        double silver = Integer.parseInt(String.valueOf(txt8.getText()));

        RadioButton r1 = findViewById(R.id.radioButton2);
        RadioButton r2 = findViewById(R.id.radioButton3);
        double zakat = 0;

        if (r2.isChecked())
        {
            double tolaToGram = 11.66;
            gold = gold/tolaToGram;
            silver = silver/tolaToGram;
        }

        zakat = cash+stockValue+givenLoan-borrow+(goldValue*gold)+(silverValue*silver);
        zakat = zakat /40;

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Your ZAKAT : "+ zakat + " PKR");
        builder1.setCancelable(true);

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }

    public void resetBtnClick(View view){
        TextInputEditText t1 = findViewById(R.id.textInputEditText);
        TextInputEditText t2 = findViewById(R.id.textInputEditText2);
        TextInputEditText t3 = findViewById(R.id.textInputEditText3);
        TextInputEditText t4 = findViewById(R.id.textInputEditText4);
        TextInputEditText t5 = findViewById(R.id.textInputEditText5);
        TextInputEditText t6 = findViewById(R.id.textInputEditText6);
        TextInputEditText t7 = findViewById(R.id.textInputEditText7);
        TextInputEditText t8 = findViewById(R.id.textInputEditText8);

        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        t6.setText(null);
        t7.setText(null);
        t8.setText(null);

        t7.setHint("GOLD WEIGHT (Tola)");
        t8.setHint("SILVER WEIGHT (Tola)");

        RadioButton r1 = findViewById(R.id.radioButton2);
        RadioButton r2 = findViewById(R.id.radioButton3);

        r1.setChecked(true);
        r2.setChecked(false);
    }

    public void tolaRadioClick(View view) {
        TextInputEditText t1 = findViewById(R.id.textInputEditText7);
        TextInputEditText t2 = findViewById(R.id.textInputEditText8);
        t1.setHint("GOLD WEIGHT (Tola)");
        t2.setHint("SILVER WEIGHT (Tola)");
    }

    public void gramRadioClick(View view) {
        TextInputEditText t1 = findViewById(R.id.textInputEditText7);
        TextInputEditText t2 = findViewById(R.id.textInputEditText8);
        t1.setHint("GOLD WEIGHT (Gram)");
        t2.setHint("SILVER WEIGHT (Gram)");
    }

}