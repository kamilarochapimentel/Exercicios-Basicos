//9. Tendo como dados de entrada a altura de uma pessoa, construa um programa em
//Java que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.

import java.util.Scanner;

import java.text.DecimalFormat;

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat ("0.00");
		
		System.out.print("Digite sua altura: ");
		double altura = leitor.nextDouble();
		
		double peso_ideal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal é: "+deci.format(peso_ideal));
		
		
	}

}
