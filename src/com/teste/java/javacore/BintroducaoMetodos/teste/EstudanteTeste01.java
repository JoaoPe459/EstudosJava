package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Estudante;
import com.teste.java.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Lloyd";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Alice";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        System.out.println("--------------------------------");
        impressoraEstudante.imprime(estudante02);
    }
}
