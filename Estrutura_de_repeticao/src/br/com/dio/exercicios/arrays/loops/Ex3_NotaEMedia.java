package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex3_NotaEMedia {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do {
            System.out.println(count + " - Digite um número(While): ");
            numero = Scan.nextInt();
            if (numero > maior) maior = numero;
            soma = soma +numero;
            count++;
        }while (count < 5);

        System.out.println("O maior número digitado é(while): "+maior);
        System.out.println("A média dos números do bloco While é: " + soma/5);
        maior = 0;
        soma = 0;

        System.out.println("Inicializando outro bloco -----");
        for (int i = 0; i <5;i++){
            System.out.println(i + " - Digite um número(fo1r): ");
            numero = Scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
        }
        System.out.println("O maior número digitado é(For): "+maior);
        System.out.println("A média dos números do bloco For é: " + soma/5);

    }
}
