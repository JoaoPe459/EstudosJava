package com.teste.java.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }
    public void subitraiDoisNumeros() {
        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1*num2);
    }

    public double divisaoDoisNumeros(double num1, double num2) {
        if(num2!=0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimiDivisaoDoisNumeros(double num1, double num2) {
        if(num2==0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1/num2);
    }
}
