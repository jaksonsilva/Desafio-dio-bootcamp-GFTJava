package br.dio.tratamentoExcecoes;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException {

        String nomeDoArquivo = "Livros-super-heroi.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

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
        }while (line != null);

        bw.flush();
        br.close();

    }
}
