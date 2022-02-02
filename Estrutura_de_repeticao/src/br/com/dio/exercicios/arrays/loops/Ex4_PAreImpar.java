package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex4_PAreImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qtdpares = 0;
        int qtdimpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        for (int i = 0; i < quantNumeros; i++){
            System.out.println("Número: ");
            numero  = scan.nextInt();
            if(numero  % 2 == 0) qtdpares++;
            else qtdimpares++;
        }
        System.out.println("A quantida de pares é: " + qtdpares);
        System.out.println("A quantida de ímpares é: " + qtdimpares);
    }
}
