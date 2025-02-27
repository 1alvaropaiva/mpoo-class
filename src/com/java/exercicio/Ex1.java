package com.java.exercicio;
import java.util.Scanner;
import java.util.Locale;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();
        System.out.println(String.format("Nome: %s\nPeso: %.2f\nAltura: %.2f\n", nome, peso, altura));
        System.out.printf("IMC: %.2f", peso/(altura*altura));

        scan.close();
    }
}

