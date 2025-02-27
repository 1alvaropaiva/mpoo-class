package com.java.exercicio;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = scan.nextDouble();
        double area = Math.pow(raio, 2) * Math.PI;
        double circ = (Math.PI * 2) * raio;
        System.out.printf("raio: %.2f\narea: %.2f\ncirc: %.2f\n", raio, area, circ);
    }
}
