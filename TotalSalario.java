//8.Fa�a um programa em Java que leia do usu�rio quanto ele ganha por hora e
//o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.

import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalSalario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		 System.out.print("Quanto ganha por hora? ");
		 double valor_hora = leitor.nextDouble();
		 
		 System.out.print("Quantas horas trabalha no m�s? ");
		 int hora_mes = leitor.nextInt();
		 
		 System.out.println("O seu total de sal�rio no m�s �: " +deci.format(valor_hora * hora_mes));
		

	}

}
