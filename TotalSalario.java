//8.Faça um programa em Java que leia do usuário quanto ele ganha por hora e
//o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;
import java.text.DecimalFormat;

public class TotalSalario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		 System.out.print("Quanto ganha por hora? ");
		 double valor_hora = leitor.nextDouble();
		 
		 System.out.print("Quantas horas trabalha no mês? ");
		 int hora_mes = leitor.nextInt();
		 
		 System.out.println("O seu total de salário no mês é: " +deci.format(valor_hora * hora_mes));
		

	}

}
