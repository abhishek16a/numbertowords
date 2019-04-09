package com.example.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 private Button btnConverter;
 private EditText etNumber;
 private TextView tvOutput;
 int number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConverter= findViewById(R.id.btnConverter);
        etNumber=findViewById(R.id.etNumber);
        tvOutput=findViewById(R.id.tvOutput);

        btnConverter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast toast;
        String Word;
        switch (v.getId()){
            case R.id.btnConverter:
                number = Integer.parseInt(etNumber.getText().toString());
                Word = converter(number);
                tvOutput.setText(Word.toString());
                toast = Toast.makeText(this, " " + number, Toast.LENGTH_LONG);
                toast.show();
                break;

        }
        }

    public static final String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "Twenty",    // 2
            "Thirty",    // 3
            "Forty",    // 4
            "Fifty",    // 5
            "Sixty",    // 6
            "Seventy",    // 7
            "Eighty",    // 8
            "Ninety"    // 9
    };

    public static String converter(int number){
        if (number < 0){
            return "0";
        }
        else if (number < 20 ){
            return units[number];
        }
        return null;
    }
    }

