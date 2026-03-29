package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divisaoDoisNumeros(20, 10));
        calculadora.imprimiDivisaoDoisNumeros(20, 10);
    }
}
