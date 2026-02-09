package com.teste.java.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioanual = 45000;
        double imposto;

        if (salarioanual <= 34712) {
            imposto = salarioanual * 0.097;
        } else if (salarioanual > 34712 && salarioanual <= 68507) {
            imposto = salarioanual * 0.3735;
        } else {
            imposto = salarioanual * 0.4950;
        }
        System.out.println(salarioanual);
        System.out.println(imposto);
    }
}
