//2.Faça um programa em Java que leia do usuário um número e
//escreva a mensagem: O número informado foi <número>
import java.util.Scanner;

public class QualNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.print("Digite um número: ");
		int n = leitor.nextInt();
		
		System.out.println("O número informado foi: " +n);

	}

}
