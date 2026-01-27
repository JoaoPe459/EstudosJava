package com.teste.java.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, boolean, byte, byte, short
        int idade = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 3000;
        char caracter = 'a';
        short idadeShort = 100;
        boolean ligado = true;
        byte idadeByte = 100;
        char caracter1 = '\u0041';//Unicode table
        char caracter2 = 87;//ASCII table

        System.out.println(idade);
        System.out.println("idade");
        System.out.println("A idade é "+idade+"anos");
        System.out.println("char "+caracter);
        System.out.println("char "+caracter1);
        System.out.println("char "+caracter2);
    }
}
