package com.example.listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //variables
    TextView txtResultado;
    EditText n1, n2;
    Button btnSuma, btnResta, btnMult, btnDivision;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResultado = (TextView) findViewById(R.id.resultado);
        n1 = (EditText) findViewById(R.id.numero1);
        n2 = (EditText) findViewById(R.id.numero2);
        btnSuma = (Button) findViewById(R.id.suma);
        btnResta = (Button) findViewById(R.id.resta);
        btnMult = (Button) findViewById(R.id.multiplicacion);
        btnDivision = (Button) findViewById(R.id.division);

        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDivision.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

    }
    switch(v.getId()) {
            case R.id.suma:
                txtResultado.setText("El resultado es: " + suma);
                break;
            case R.id.resta:
            txtResultado.setText("El resultado es: " + resta);
                break;
            case R.id.multiplicacion:
            txtResultado.setText("El resultado es: " + mult);
                break;
            case R.id.division:
            txtResultado.setText("El resultado es: " + div);
                break;
            default:
            txtResultado.setText("Ingrese numero corerecto");
        }
    }
