package Questoes;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número para fazer uma escada a partir dele: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i ++) {

			String data = new String(new char[i]).replace("\0", "*");
            System.out.println("*" + data);
			
		}
		
		scan.close();
		
	}

}
