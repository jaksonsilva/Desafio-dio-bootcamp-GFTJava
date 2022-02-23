package br.dio.tratamentoExcecoes;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {

        String nomeDoArquivo = "Livros-super-heroi.txt";

        try{
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir!" + e.getCause());
        }
        catch (IOException e ){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte!" + e.getCause());
        }finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Continua o programa, mesmo apresentando exceção!!!");

    }

    public static void imprimirArquivoNoConsole (String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);

        bw.flush();
        br.close();

    }
}
