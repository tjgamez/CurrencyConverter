package com.tjgamez.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText number = (EditText) findViewById(R.id.editText);

        double numberDoubled = Double.parseDouble(number.getText().toString());

        double numberConverted = numberDoubled*0.77;

        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", numberConverted), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
