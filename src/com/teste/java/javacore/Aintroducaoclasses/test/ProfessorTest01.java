package com.teste.java.javacore.Aintroducaoclasses.test;

import com.teste.java.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.nome = "Nome";
        p1.idade = 21;
        p1.sexo = 'M';
        System.out.println(p1.nome + " " + p1.idade + " " + p1.sexo);
    }
}
