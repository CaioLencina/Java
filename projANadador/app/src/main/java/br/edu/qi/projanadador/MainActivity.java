package br.edu.qi.projanadador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    EditText nbrIdade;
    TextView txtDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        nbrIdade = findViewById(R.id.nbrIdade);
        txtDados = findViewById(R.id.txtDados);
    }

    public void mostrarDadosDoNadador(View view){
        Nadador objNadador = new Nadador();
        objNadador.setNome(edtNome.getText().toString());
        objNadador.setIdade(Byte.parseByte(nbrIdade.getText().toString()));


        txtDados.setText(objNadador.toString());
    }

}