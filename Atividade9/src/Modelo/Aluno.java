package Modelo;

public class Aluno {
    String nome;
    String matricula;
    int idade;

    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getIdade() {
        return idade;
    }
}
