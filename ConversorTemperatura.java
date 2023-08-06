//10. Fa�a um programa em Java que leia do usu�rio a temperatura em graus Fahrenheit e
//converta a temperatura para graus Celsius. Utilize a seguinte f�rmula: C = (5 * (F-32) / 9).

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		System.out.println("CONVERSOR GRAUS FAHRENHEIT PARA GRAUS CELSIUS");
		
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
				
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double F = leitor.nextDouble();
		
		double conversor = (5 * (F-32) / 9);
		
		System.out.println ("Temperatura em Graus Celsius:" +deci.format(conversor));
		

		
		
		
	}

}
