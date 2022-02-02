package br.com.dio.exercicios.arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {0, -5, 5, 50, 8, 4};
        int count = 0;

        System.out.println("Quantidade de campos que tem o vetor: " + vetor.length);

        while (count < (vetor.length)){
            System.out.print(vetor[count] + "  ");
            count++;
        }

        System.out.println("Vetor na ordem ivnersa: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i]+"  ");
        }
    }
}
