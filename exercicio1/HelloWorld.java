package exercicio1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("Olá " + nome + ", seja bem-vindo!");
		input.close();
	}
	
}
