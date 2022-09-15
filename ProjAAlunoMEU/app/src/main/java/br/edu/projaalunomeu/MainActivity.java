package br.edu.projaalunomeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    EditText edtMedia;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtMedia = findViewById(R.id.edtMedia);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void mostrarMediaDoEstudante(View view){
        Aluno objAluno = new Aluno();
        objAluno.setNome(edtNome.getText().toString());
        objAluno.setMedia(Double.parseDouble(edtMedia.getText().toString()));


        txtResultado.setText(objAluno.toString());
    }


}