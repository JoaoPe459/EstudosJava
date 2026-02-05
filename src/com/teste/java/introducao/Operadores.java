package com.teste.java.introducao;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int resultado1 = num1 + num2;
        int resultado2 = num1 - num2;
        int resultado3 = num1 * num2;
        int resultado4 = num2 / num1;
        System.out.println(resultado4);

        //%
        int resto = 21%2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

    }
}
