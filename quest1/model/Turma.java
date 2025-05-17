package quest1.model;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos;
    private int totalAlunos;
    private final int MAX_ALUNOS = 30;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.totalAlunos = 0;
    }
    public String getNome() {
        return nome;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void adicionarAluno(Aluno aluno) {
        if (totalAlunos < MAX_ALUNOS) {
            // Verifica se o aluno já está na turma
            for (Aluno a : alunos) {
                if (a.getMatricula().equals(aluno.getMatricula())) {
                    System.out.println("Aluno já está na turma.");
                    return;
                }
            }   
            alunos.add(aluno);
            totalAlunos++;
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }
    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            totalAlunos--;
        } else {
            System.out.println("Aluno não encontrado na turma.");
        }
    }
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Alunos na turma " + nome + ":");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            }
        }
    }
    public void calcularMediaTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        double mediaTurma = soma / alunos.size();
        System.out.println("Média da turma " + nome + ": " + mediaTurma);
    }
    public void situacaoTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println("Situação do aluno " + aluno.getNome() + ": " + aluno.situacao());
        }
    }
    public void listarNotasTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println("Notas do aluno " + aluno.getNome() + ":");
            for (double nota : aluno.getNotas()) {
                System.out.println(nota);
            }
        }
    }
    public void aprovadosTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("Alunos aprovados na turma " + nome + ":");
        for (Aluno aluno : alunos) {
            if (aluno.situacao().equals("Aprovado")) {
                System.out.println(aluno.getNome());
            }
        }
    }
    public void reprovadosTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("Alunos reprovados na turma " + nome + ":");
        for (Aluno aluno : alunos) {
            if (aluno.situacao().equals("Reprovado")) {
                System.out.println(aluno.getNome());
            }
        }
    }
}
