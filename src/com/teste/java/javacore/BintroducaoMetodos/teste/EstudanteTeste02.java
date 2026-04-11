package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Estudante;
import com.teste.java.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Lloyd";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Alice";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        System.out.println("--------------------");
        estudante02.imprime();
    }
}
