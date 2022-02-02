package br.com.dio.exercicios.arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class Ex4_Arraymultidimensionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (L % 2 == C % 2) {
            System.out.println("L % 2 = " + (L % 2) + "////C % 2 = " + (C % 2));
            System.out.println(1);
        }else {
            System.out.println("L % 2 = " + (L % 2) + "////C % 2 = " + (C % 2));
            System.out.println(0);
        }
        sc.close();
/*
        Random random = new Random();

        int[][] matrix = new int[4][4];

        for (int x = 0; x < matrix.length; x++){
            for (int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = random.nextInt(100);
            }
        }

        System.out.println("valores da matrix: ");
        for (int[] linha: matrix) {
            for (int coluna: linha) {
                System.out.print(coluna + "  ");
            }
            System.out.println();*/
        // }

    }
}