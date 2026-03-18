package com.teste.java.javacore.Aintroducaoclasses.test;

import com.teste.java.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 =  new Carro();
        carro1.nome = "Ferrari";
        carro1.modelo = "Ferrari";
        carro1.ano = 2021;

        Carro carro2 =  new Carro();
        carro2.nome = "BMW";
        carro2.modelo = "BMW";
        carro2.ano = 2022;

        System.out.println("NOME: " + carro1.nome);
        System.out.println("MODELO: " + carro1.modelo);
        System.out.println("ANO: " + carro1.ano);
        System.out.println("-------------------------------");
        System.out.println("NOME: " + carro2.nome);
        System.out.println("MODELO: " + carro2.modelo);
        System.out.println("ANO: " + carro2.ano);

    }
}
