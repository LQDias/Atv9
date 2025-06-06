package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    String disciplina;
    int codigo;
    Professor professor;
    List<Aluno> alunos;

    public Turma(String disciplina, int codigo, Professor professor) {
        this.disciplina = disciplina;
        this.codigo = codigo;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    public String getDisciplina() {
        return disciplina;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getProfessor() {
        return professor.toString();
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
