//4.Fa�a um programa em Java que leia do usu�rio as 4 notas de um aluno e calcule a m�dia

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Qual a sua nota em Empreendedorismo: ");
		double empreend = leitor.nextDouble();
		
		System.out.print("Qual a sua nota em Matem�tica: ");
		double mat = leitor.nextDouble();
		
		System.out.print("Qual a sua nota em Ingl�s: ");
		double ing = leitor.nextDouble();
		
		System.out.print("Qual a sua nota em Etica: ");
		double etica = leitor.nextDouble();
		
		double media = (empreend + mat + ing + etica)/4;
		//double media = soma/4;
		
		System.out.println("");
		System.out.println("O coeficiente do aluno: " +media);
		
		
		// TODO Auto-generated method stub

	}

}
