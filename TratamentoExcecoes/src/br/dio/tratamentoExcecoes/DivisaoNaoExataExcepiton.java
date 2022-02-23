package br.dio.tratamentoExcecoes;

public class DivisaoNaoExataExcepiton extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExataExcepiton(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
