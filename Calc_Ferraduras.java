//5.Fa�a um programa em Java que leia do usu�rio o n�mero de
//cavalos de um haras e calcule quantas ferraduras devem ser compradas

import java.util.Scanner;

public class Calc_Ferraduras {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	System.out.print("N�mero de cavalos: ");
	
	int cavalos = leitor.nextInt();
	
	int totalFerraduras = cavalos*4;
	
	System.out.println("Total de ferraduras a serem compradas: " +totalFerraduras );
	

	}

}
