//5.Faça um programa em Java que leia do usuário o número de
//cavalos de um haras e calcule quantas ferraduras devem ser compradas

import java.util.Scanner;

public class Calc_Ferraduras {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.print("Número de cavalos: ");
	
	int cavalos = leitor.nextInt();
	
	int totalFerraduras = cavalos*4;
	
	System.out.println("Total de ferraduras a serem compradas: " +totalFerraduras );
	

	}

}
