package br.com.sp.senac.appsqliteestudante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    EditText edtIDAluno, edtNomeAluno;
    Button btnCarregaDados, btnAdicionar, btnBuscar, btnExcluir, btnAlterar;

    ListView listaAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIDAluno = findViewById(R.id.edtIDAluno);
        edtNomeAluno = findViewById(R.id.edtNomeAluno);

        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnAlterar = findViewById(R.id.btnAlterar);
        btnBuscar = findViewById(R.id.btnBuscar);
        btnCarregaDados = findViewById(R.id.btnCarregaDados);
        btnExcluir = findViewById(R.id.btnExcluir);

        listaAlunos = findViewById(R.id.listaAlunos);



    }
}
