package Servico;

import Modelo.Aluno;
import Modelo.Professor;
import Modelo.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroTurma {
    List<Turma> turmas;
    Scanner sc;

    public CadastroTurma() {
        turmas = new ArrayList<Turma>();
        sc = new Scanner(System.in);
    }

    public void CriarTurma(){
        System.out.println("Insira os Dados da Turma: ");

        System.out.println("Disciplina: ");
        String disciplina = sc.nextLine();

        System.out.println("Código da Turma: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome do professor da turma: ");
        String nomeProf = sc.nextLine();

        System.out.println("Digite a idade do professor da turma: ");
        int idadeProf = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o cadastro do professor da turma: ");
        String cadastroProf = sc.nextLine();

        Professor professor = new Professor(nomeProf, idadeProf, cadastroProf);
        Turma turma = new Turma(disciplina, codigo, professor);
        turmas.add(turma);
    }

    public void adicionarAluno() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada. Cadastre uma turma primeiro.");
            return;
        }

        System.out.println("=== Adicionar Aluno ===");

        System.out.println("Turmas disponíveis:");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getDisciplina());
        }
        System.out.print("Escolha o índice da turma para adicionar aluno: ");
        int indice = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (indice < 0 || indice >= turmas.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Turma turma = turmas.get(indice);

        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Matrícula do aluno: ");
        String matricula = sc.nextLine();

        Aluno aluno = new Aluno(nomeAluno, matricula, idade);
        turma.adicionarAluno(aluno);

        System.out.println("Aluno adicionado à turma " + turma.getDisciplina() + " com sucesso!\n");
    }

    public void exibirTurma(){
        if(turmas.isEmpty()) {
            System.out.println("Nenhuma turma foi encontrada");
            return;
        }
        System.out.println("\nTurmas Cadastradas:\n");
        for (Turma turma : turmas) {
            System.out.println("Código: " + turma.getCodigo());
            System.out.println("Disciplina: " + turma.getDisciplina());
            System.out.println("Professor: " + turma.getProfessor());
            System.out.println("Alunos: ");
            if (turma.getAlunos().isEmpty()) {
                System.out.println("Nenhum aluno foi encontrada");
            } else {
                for (Aluno aluno : turma.getAlunos()) {
                    System.out.println("-" + aluno.getNome() + " | Idade: " + aluno.getIdade() + " | Matrícula: " + aluno.getMatricula());

                }
            }
            System.out.println("\n-----------------\n");
        }
    }
}