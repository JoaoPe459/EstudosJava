package com.teste.java.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 infantil
        //idade >=15 && idade <18 juvenil
        //idade > 18 adulto
         int idade = 17;
         String categoria;
         if(idade<15){
             categoria = "infantil";
         } else if(idade<18) {
             categoria = "juvenil";
         } else {
             categoria ="adulto";
         }
         System.out.println(categoria);
    }
}
