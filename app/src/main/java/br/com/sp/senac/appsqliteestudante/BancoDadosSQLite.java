package br.com.sp.senac.appsqliteestudante;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class BancoDadosSQLite extends SQLiteOpenHelper {

    public static String NOME_BANCO = "dbAluno.sql";
    public static int VERSAO_BANCO = 1;

    public static final String NOME_TABELA = "tbAlunos";
    public static final String COLUNA_ID_ALUNO = "idAluno";
    public static final String COLUNA_NOME_ALUNO = "nomeAluno";


    public BancoDadosSQLite(@Nullable Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CRIAR_TABELA =
                "CREATE TABLE " + NOME_TABELA + " (" +
                        COLUNA_ID_ALUNO + " INTEGER PRIMARY KEY," +
                        COLUNA_NOME_ALUNO + " TEXT )";
        db.execSQL(CRIAR_TABELA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void inserirAlunos(Aluno aluno){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("idAluno",aluno.getIdAluno());
        values.put("nomeAluno",aluno.getNomeAluno());

        db.insert(NOME_TABELA,null,values);





    }
}
