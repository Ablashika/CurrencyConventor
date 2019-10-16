package com.example.cc.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert  (View view) {

        EditText cediAmountEditText = (EditText) findViewById(R.id.cediAmountEditText);

        Double cediAmountDouble = Double.parseDouble(cediAmountEditText.getText().toString());

        Double dollarAmount = cediAmountDouble * 0.18;

        Toast.makeText(MainActivity.this, "$" + dollarAmount.toString(), Toast.LENGTH_SHORT).show();

        Log.i("amount", cediAmountEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
