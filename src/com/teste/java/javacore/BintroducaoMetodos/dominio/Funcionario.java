package com.teste.java.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salario = new int[3];
    private int media = 0;

    public void imprimir() {
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("Idade do funcionario: " + this.idade);
        if (salario != null) {
            System.out.println("Salario 1 do funcionario: " + this.salario[0]);
            System.out.println("Salario 2 do funcionario: " + this.salario[1]);
            System.out.println("Salario 3 do funcionario: " + this.salario[2]);
        }
    }

    public void mediaSalarial() {
        if (salario == null)
            return;
        for (int salario : salario) {
            media += salario;
        }

        media = media / salario.length;
        System.out.println("Media do funcionario: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }

    public int getMedia() {
        return media;
    }

}
