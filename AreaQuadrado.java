/*7.Fa�a um programa em Java calcule a �rea de um
quadrado, em seguida escreva o dobro desta �rea.*/

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		System.out.println("DESCUBRA O DOBRO A �REA DO QUADRADO");
		Scanner leitor = new Scanner (System.in);
		System.out.print("Digite o lado do quadrado: ");
		double lado = leitor.nextDouble();
		
		double dobro = (lado*lado)*2;
		
		System.out.println("O dobro da �rea do quadrado �: "+dobro);
		

	}

}
