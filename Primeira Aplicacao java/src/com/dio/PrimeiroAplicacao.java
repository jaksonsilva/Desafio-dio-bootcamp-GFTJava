package com.dio;

import com.dio.model.Gato;

public class PrimeiroAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hellow Word");
		
		Gato gato = new Gato();
		Livros livro = new Livros();
	
		System.out.print(gato);
		System.out.print(livro);
	}
	
}

class Livros{
	private String nome;
	private String npag;

}
