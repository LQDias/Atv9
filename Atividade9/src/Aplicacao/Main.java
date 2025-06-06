package Aplicacao;

import Servico.CadastroTurma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroTurma cadastro = new CadastroTurma();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("--Menu Principal--");
            System.out.println("1 - Cadastrar Turma");
            System.out.println("2 - Adicionar Aluno na Turma");
            System.out.println("3 - Exibir Turmas");
            System.out.println("4 - Sair");
            opcao =  sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    cadastro.CriarTurma();
                    break;
                case 2:
                    cadastro.adicionarAluno();
                    break;
                case 3:
                    cadastro.exibirTurma();
                    break;
                case 4:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 4);
        sc.close();
    }
}
