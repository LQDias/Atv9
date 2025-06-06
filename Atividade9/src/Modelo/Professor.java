package Modelo;

public class Professor {
    String nome;
    int idade;
    String cadastro;

    public Professor(String nome, int idade, String cadastro) {
        this.nome = nome;
        this.idade = idade;
        this.cadastro = cadastro;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return nome;
    }
}
