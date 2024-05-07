import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o número da agência: ");
        agencia = dados.next();
		
		System.out.println("Por favor, digite o número da conta: ");
        numeroConta = dados.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = dados.next();

        System.out.println("Por favor digite seu saldo: ");
        saldo = dados.nextDouble();
        
        System.out.println(
                "Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
                        + "conta " + numeroConta + " e seu saldo é R$" + saldo + " reais e já está disponível para saque");
		
	}

}
