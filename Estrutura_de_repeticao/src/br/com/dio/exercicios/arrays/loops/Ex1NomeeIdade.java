package br.com.dio.exercicios.arrays.loops;

import java.util.Scanner;

public class Ex1NomeeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = scan.next();

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if (nome.equals("0")) break;

            System.out.println("Continua o programa!!!");

        }


    }
}
