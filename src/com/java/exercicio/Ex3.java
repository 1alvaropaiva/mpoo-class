package com.java.exercicio;

import java.util.Scanner;

//
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        double raiz = Math.cbrt(a*b*c);
        raiz = Math.pow(a*b*c, 1/3);
        System.out.printf("%.2f", raiz);

    }
}
