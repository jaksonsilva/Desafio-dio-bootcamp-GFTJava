package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número da tabuada: ");
        numero = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + i*numero);
        }


    }
}
