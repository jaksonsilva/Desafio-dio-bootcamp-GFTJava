package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex6_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        System.out.println("Digite o número Fatorial: ");
        numero = scan.nextInt();

        for (int i = 1; i <= numero ;i++){
            fatorial = fatorial * i;
        }

        System.out.println("Resultado do fatorial de "+ numero +": "+fatorial);
    }
}
