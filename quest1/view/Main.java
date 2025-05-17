package quest1.view;

import quest1.model.Aluno;
import quest1.model.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criação de um aluno
        Aluno aluno = new Aluno("João", "123456");
        // Adicionando notas
        aluno.adicionarNota();
        // Calculando a média
        double media = aluno.calcularMedia();
        // Exibindo a situação do aluno
        System.out.println("Situação do aluno " + aluno.getNome() + ": " + aluno.situacao());
        // Exibindo a média do aluno
        System.out.println("Média do aluno " + aluno.getNome() + ": " + media);
        // Exibindo as notas do aluno
        System.out.println("Notas do aluno " + aluno.getNome() + ":");
        for (double nota : aluno.getNotas()) {
            System.out.println(nota);
        }
        // Exibindo a matrícula do aluno
        System.out.println("Matrícula do aluno " + aluno.getNome() + ": " + aluno.getMatricula());
        // Exibindo o nome do aluno
        System.out.println("Nome do aluno: " + aluno.getNome());

        // Criação de uma turma
        Turma turma = new Turma("Turma A");
        // Adicionando alunos à turma
        turma.adicionarAluno(aluno);
        // Listando alunos da turma
        turma.listarAlunos();
        // Calculando a média da turma
        turma.calcularMediaTurma();
        // Exibindo a situação dos alunos da turma
        turma.situacaoTurma();
        // Listando notas dos alunos da turma       
        turma.listarNotasTurma();
        // Exibindo alunos aprovados da turma
        turma.aprovadosTurma();
        // Exibindo alunos reprovados da turma
        turma.reprovadosTurma();

    }
}