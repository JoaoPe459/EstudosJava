package com.teste.java.javacore.BintroducaoMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
