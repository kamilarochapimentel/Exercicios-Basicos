/*7.Faça um programa em Java calcule a área de um
quadrado, em seguida escreva o dobro desta área.*/

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		System.out.println("DESCUBRA O DOBRO A ÁREA DO QUADRADO");
		Scanner leitor = new Scanner (System.in);
		System.out.print("Digite o lado do quadrado: ");
		double lado = leitor.nextDouble();
		
		double dobro = (lado*lado)*2;
		
		System.out.println("O dobro da área do quadrado é: "+dobro);
		

	}

}
