package io.github.josiasbarreto_dev.bootcamp_santander_2025.sintaxe_basica_java.fundamentos_java;

import java.time.LocalDate;
import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        var name = scan.nextLine();

        System.out.println(name + ", Digite o seu ano de nascimento");
        var year = scan.nextInt();

        var age = LocalDate.now().getYear() - year;

        System.out.printf("%s, a sua idade é: %s anos", name, age);
    }
}
