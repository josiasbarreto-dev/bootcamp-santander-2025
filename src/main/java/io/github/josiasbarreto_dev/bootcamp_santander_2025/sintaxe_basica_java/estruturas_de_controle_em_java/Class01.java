package io.github.josiasbarreto_dev.bootcamp_santander_2025.sintaxe_basica_java.estruturas_de_controle_em_java;

import java.util.Scanner;

//1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor digite um número de 0 a 9:");
        var numero = scanner.nextInt();

        for (int i = 0 ; i <= 10 ; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
