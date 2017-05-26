package com.thaina.exibirtexto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button botao;
    EditText texto;
    String stringDigit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = (Button) findViewById(R.id.botaoAperte);
        texto = (EditText) findViewById(R.id.textoDigit);
    }
    public void botaoClicado(View v){
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        stringDigit = texto.getText().toString();
        i.putExtra("Value", stringDigit);
        startActivity(i);
        finish();
    }
}
