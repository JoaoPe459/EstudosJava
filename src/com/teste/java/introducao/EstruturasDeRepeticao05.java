package com.teste.java.introducao;

public class EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int carroVal = 30000;
        for (int i = carroVal; i >=1 ; i--) {
            if(carroVal/i < 1000){
                continue;
            }
            System.out.println("Parcela " + i + "   R$ " + (carroVal/i));
        }
    }
}
