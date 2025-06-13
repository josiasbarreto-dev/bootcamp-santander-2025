package io.github.josiasbarreto_dev.bootcamp_santander_2025.sintaxe_basica_java.fundamentos_java;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor insira o lado do Quadrado: ");
        var lado = scan.nextInt();

        var area = lado * lado;
        System.out.println("O resultado da área do Quadrado com lado " + lado + " x " + lado + " é = " + area);
    }
}
