package com.teste.java.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, double, float 0
        //char '/u0000' ' '
        //bolean false
        //String null

        String[] nomes = new String[4];
        nomes[0] = "Lloyd";
        nomes[1] = "Arthur";
        nomes[2] = "Chung Myung";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }


    }
}
