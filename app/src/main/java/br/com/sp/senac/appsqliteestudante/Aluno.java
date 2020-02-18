package br.com.sp.senac.appsqliteestudante;

public class Aluno {

    private int idAluno;
    private String nomeAluno;

    public Aluno() {
    }
    public Aluno(int idAluno, String nomeAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
