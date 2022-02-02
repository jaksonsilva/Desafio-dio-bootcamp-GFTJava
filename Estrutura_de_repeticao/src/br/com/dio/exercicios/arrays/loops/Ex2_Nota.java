package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota1;

        System.out.println("Digite o valor de uma nota: ");
        nota1 = scan.nextInt();

        while (nota1 > 10 || nota1 < 0) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota1 = scan.nextInt();
        }
    }
}
