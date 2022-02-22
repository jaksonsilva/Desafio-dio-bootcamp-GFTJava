package one.digitalinovation.oo.heranca;

import java.util.Scanner;

public class RodarAplicacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        int a = leitor.nextInt();
        int b = leitor.nextInt();

        //digite o seu código
        int x = a + b;

        System.out.println(x);





        Funcionario funcionario = new Gerente();

        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();


        //Gerente gerente2 = (Gerente) new Funcionario();

    }
}
