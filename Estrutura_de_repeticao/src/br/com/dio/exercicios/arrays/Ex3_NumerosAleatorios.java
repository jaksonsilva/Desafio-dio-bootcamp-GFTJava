package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++){
            int numeroaleatorio = random.nextInt(100);
            numeros[i] = numeroaleatorio;
        }

        System.out.println("Números aleatórios: ");
        for (int aleatorio: numeros) {
            System.out.print(aleatorio + " ");

        }
    }
}
