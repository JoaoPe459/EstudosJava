package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        pessoa.setIdade(18);
        pessoa.imprimir();
    }
}
