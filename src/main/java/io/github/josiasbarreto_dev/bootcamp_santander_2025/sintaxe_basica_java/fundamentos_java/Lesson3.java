package io.github.josiasbarreto_dev.bootcamp_santander_2025.sintaxe_basica_java.fundamentos_java;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor insira a Base do Retângulo:");
        var base = scan.nextInt();

        System.out.println("Favor insira a Altura do Retângulo:");
        var altura = scan.nextInt();

        var area = base * altura;

        System.out.println("A área do Retângulo é " + area);
    }
}
