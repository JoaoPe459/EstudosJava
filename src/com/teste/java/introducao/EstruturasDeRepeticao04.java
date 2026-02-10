package com.teste.java.introducao;

public class EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int carroVal = 30000;
        for (int i = 1; i < carroVal; i++) {
            if(carroVal/i < 1000){
                break;
            }
            System.out.println("Parcela" + i + "R$ " + (carroVal/i));
        }
    }
}
