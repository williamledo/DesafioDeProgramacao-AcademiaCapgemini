package Questoes;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma senha que tenha os seguintes critérios: ");
		System.out.println("Possuir no mínimo 6 caracteres");
		System.out.println("Conter no mínimo 1 digito");
		System.out.println("Conter no mínimo 1 letra em minúsculo");
		System.out.println("Conter no mínimo 1 letra em maiúculo");
		System.out.println("Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n-----------------------------");
		System.out.print("Senha: ");
		
		String senha = scan.next();

		int contador = 0;
		int qtdMaiusculo = 0;
		int qtdMinusculo = 0;
		int qtdCaracteresEspeciais = 0;

		char auxChar[] = new char[senha.length()];
		
		for (int i = 0; i < senha.length(); i++) {
			
			auxChar[i] = senha.charAt(i);
			
		}

		
		if (senha.length() < 6) {

			System.out.println(6-senha.length());
			System.out.println("A senha deve ter no mínimo 6 caracteres");

		} else {

			for (int i = 0; i < senha.length(); i++) {
				
				if (Character.isLowerCase(auxChar[i])) {
					qtdMinusculo++;
				}else {
					qtdMaiusculo++;
				}
				
				if(auxChar[i] == '!' || auxChar[i] == '@' || auxChar[i] == '#' ||auxChar[i] == '$' || auxChar[i] == '%'
						|| auxChar[i] == '^' || auxChar[i] == '&' || auxChar[i] == '*' || auxChar[i] == '('
						|| auxChar[i] == ')' || auxChar[i] == '-' || auxChar[i] == '+') {
					qtdCaracteresEspeciais++;
					qtdMaiusculo--;
				}
				 
			}
			
			if (qtdMinusculo > 0 && qtdMaiusculo > 0 ) {
				
				if (qtdCaracteresEspeciais > 0) {
					System.out.println("Senha aceita !");
				}else {
					System.out.println("Adicione no mínimo um caractere especial a sua senha");
				}
				
			}else {
				System.out.println("Adicione no mínimo uma letra minúscula e uma maiúscula a sua senha");
			}

		}
		
		scan.close();
	}
}
