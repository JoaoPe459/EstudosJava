package com.teste.java.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isMaiorDeIdade = idade >= 18;
        if(isMaiorDeIdade){
            System.out.println("Maior de idade");
        }

        if(!isMaiorDeIdade){
            System.out.println("Menor de idade");
        }

        boolean c = true;
        if(c==false)
        {
            System.out.println("Nunca fazer atrubição no if");
        }
        System.out.println("Fora do if");
    }
}
