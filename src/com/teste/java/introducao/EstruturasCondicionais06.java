package com.teste.java.introducao;

public class EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se o dia é util ou final de semana
        //considerando 1 como domingo
        //Utilize Switch
        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcão inválida");
        }

    }
}
