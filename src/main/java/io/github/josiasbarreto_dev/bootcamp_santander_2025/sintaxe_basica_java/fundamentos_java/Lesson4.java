package io.github.josiasbarreto_dev.bootcamp_santander_2025.sintaxe_basica_java.fundamentos_java;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor insira o nome da 1ª Pessoa: ");
        var firstPersonName = scan.nextLine();

        System.out.println(firstPersonName + ", insira a sua idade: ");
        var ageFirstPersonName = scan.nextInt();
        scan.nextLine();

        System.out.println("Favor insira o nome da 2ª Pessoa: ");
        var secondPersonName = scan.nextLine();

        System.out.println(firstPersonName + ", insira a sua idade: ");
        var ageSecondPersonName = scan.nextInt();

        var result = Math.abs(ageFirstPersonName - ageSecondPersonName);

        System.out.println("A diferença de idade de " + firstPersonName + " e " + secondPersonName + " é " + result);
    }
}
