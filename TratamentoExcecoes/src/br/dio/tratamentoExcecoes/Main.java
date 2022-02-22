package br.dio.tratamentoExcecoes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        boolean continueLopping =true;

        do {
            try{
                String a = JOptionPane.showInputDialog("Numerador: ");
                String b = JOptionPane.showInputDialog("Denominador: ");

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLopping = false;

            }catch (NumberFormatException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Inválida, digite um número inteiro! " + e.getMessage());

            }  catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por 0! " + e.getMessage());

            }
            finally {
                System.out.println("Chegou no finally!!!");
            }

        }while (continueLopping);


        System.out.println("O código continua!!!");
    }

    public static int dividir(int a, int b) {return a/b; }
}
