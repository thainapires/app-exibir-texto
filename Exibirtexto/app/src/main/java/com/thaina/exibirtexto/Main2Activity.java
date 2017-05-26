package com.thaina.exibirtexto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView texto2;
    String stringDigit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        texto2 = (TextView) findViewById(R.id.digitado);
        stringDigit2 = getIntent().getExtras().getString("Value");
        texto2.setText(stringDigit2);
    }
}
