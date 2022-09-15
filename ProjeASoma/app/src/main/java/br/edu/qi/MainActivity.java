package br.edu.qi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txn1;
    EditText txn2;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txn1 = findViewById(R.id.txnNumero1);
        txn2 = findViewById(R.id.txnNumero2);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void Somar(View view){
        int valor1 = Integer.parseInt(txn1.getText().toString());
        double valor2 = Double.parseDouble(txn2.getText().toString());
        txtResultado.setText(String.valueOf(valor1 + valor2));
    }
    public void Subtrair(View view){
        int valor1 = Integer.parseInt(txn1.getText().toString());
        double valor2 = Double.parseDouble(txn2.getText().toString());
        txtResultado.setText(String.valueOf(valor1 - valor2));
    }
    public void Multiplicar(View view){
        int valor1 = Integer.parseInt(txn1.getText().toString());
        double valor2 = Double.parseDouble(txn2.getText().toString());
        txtResultado.setText(String.valueOf(valor1 * valor2));
    }
    public void Dividir(View view){
        int valor1 = Integer.parseInt(txn1.getText().toString());
        double valor2 = Double.parseDouble(txn2.getText().toString());
        txtResultado.setText(String.valueOf(valor1 / valor2));
    }
}