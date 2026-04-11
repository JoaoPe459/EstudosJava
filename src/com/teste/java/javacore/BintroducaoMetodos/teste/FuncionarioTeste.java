package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 25;
        funcionario.salario = new int[]{1000,2000,5000};
        funcionario.imprimir();
        funcionario.mediaSalarial();
    }
}
