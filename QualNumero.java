//2.Fa�a um programa em Java que leia do usu�rio um n�mero e
//escreva a mensagem: O n�mero informado foi <n�mero>
import java.util.Scanner;

public class QualNumero {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		int n = leitor.nextInt();
		
		System.out.println("O n�mero informado foi: " +n);

	}

}
