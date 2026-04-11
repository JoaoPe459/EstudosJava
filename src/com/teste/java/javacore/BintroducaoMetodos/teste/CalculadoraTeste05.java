package com.teste.java.javacore.BintroducaoMetodos.teste;

import com.teste.java.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaArray(new int[]{1,2,3,4,5});
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
