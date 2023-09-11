package contaBanco.com.dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor insira o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Agora o numero da agencia. Exe(067-8):  ");
		String agencia = sc.next();
		
		System.out.println("Nome completo: ");
		String nomeCliente = sc.next();
		
		System.out.println("Digite o saldo da sua conta: ");
		double valor = sc.nextDouble();
		
		System.out.print("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",");
		System.out.print(" conta " + numeroConta+" e seu saldo é de $"+ valor+" está disponível para saque");
		
	}

}
