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

        //&& (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean dentroDaLei1 = idade >= 30 && salario >= 4612;
        boolean dentroDaLei2 = idade < 30 && salario >= 3381;

        System.out.println("Lei 1 "+dentroDaLei1);
        System.out.println("Lei 2 "+dentroDaLei2);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayStation5Compravel "+isPlayStation5Compravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 2000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus "+bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}
