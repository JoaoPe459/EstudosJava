package com.teste.java.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salario = new int[3];

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
        int media = 0;
        for (int salario : salario) {
            media += salario;
        }

        media = media / salario.length;
        System.out.println("Media do funcionario: " + media);
    }

}
