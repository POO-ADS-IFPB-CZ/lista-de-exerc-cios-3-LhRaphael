package quest1.model;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private boolean aprovado;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
        this.aprovado = false;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public void adicionarNota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas do aluno " + nome + ":");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }
        scanner.close();
    }
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public String situacao() {
        double media = calcularMedia();
        if (media >= 7) {
            this.aprovado = true;
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
