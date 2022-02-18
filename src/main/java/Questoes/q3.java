package Questoes;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {

	public static int repeticao(String n) {

		int i = 0, j, contador = 0;

		char c, d;

		for (i = 0; i < n.length(); i++) {

			for (j = i + 1; j < n.length(); j++) {
				c = n.charAt(j);

				d = n.charAt(i);

				if (c == d)
					contador++;
			}

		}
		return contador;
	}

	public static int qtdAnagramas(int tamanhoDaPalavra, int qtdDePares) {
		
		if (qtdDePares == 0) {
			
			int x = tamanhoDaPalavra;
			int n  = x;
			
			while (x > 1){

				  n = n *(x-1);
				  x--;
			}
			
			return n;
			
		}else {
			
			/*Aqui complicou*/
			
			return (Integer) null;
			
		}
			
	}
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String palavra = "";

		System.out.print("Digite algo para saber a quantidade de anagramas: ");
		palavra = scan.next();

		int qtdDePares = repeticao(palavra);
		
		System.out.print("Resultado: " + qtdAnagramas(palavra.length(), qtdDePares));

		scan.close();
		
	}

}
