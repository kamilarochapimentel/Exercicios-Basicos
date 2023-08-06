//3.Faça um programa em Java que leia do usuário dois números e calcule a soma.
import java.util.Scanner;

public class Calculando {

	public static void main(String[] args) {
		Scanner leitor= new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int numero2=leitor.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma dos dois números é: " +soma);
		

	}

}
