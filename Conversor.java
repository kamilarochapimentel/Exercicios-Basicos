//6.Faça um programa em Java que leia do usuário
//um valor em metros e converta para centímetros

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o valor em metros: ");
		double metros = leitor.nextDouble();
		
		double centimetros = metros*100;
		
		System.out.println("Em centimetros: "+centimetros);
		
	}

}
