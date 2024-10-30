package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Jojo", "435.543.548-21", "Brasil", "03/08/2006");
		Cliente cliente2 = new Cliente("Jo�o", "123.456.789-10", "Brasil", "19/07/2006");
		Cliente cliente3 = new Cliente("Mi", "987.654.321-10", "Brasil", "24/05/2007");
		Cliente cliente4 = new Cliente("Maris", "111.222.333-44", "Brasil", "26/06/2006");

		// String nomeCliente, String cpfCliente, String numeroConta, float saldoCliente
		Conta conta1 = new Conta(cliente1, "000-123", 1000);
		Conta conta2 = new Conta(cliente2, "000-456", 1000);
		Conta conta3 = new Conta(cliente3, "000-789", 1000);

		// dep�sito
		conta1.Depositar(100);

		System.out.println("\n\tCONSULTA: ");
		// consulta
		System.out.println(conta1.ConsultarSaldo());

		// transfer�ncia
		System.out.println("\n\tTRANSFER�NCIA: ");
		System.out.println("Saldo da conta atual antes de efetuar a transfer�ncia: R$" + conta1.ConsultarSaldo());
		System.out.println("Saldo da conta destino antes de receber a transfer�ncia: R$" + conta3.ConsultarSaldo());
		conta1.Transferir(1000, conta3);
		System.out.println("Saldo da conta atual depois de efetuar a transfer�ncia: R$" + conta1.ConsultarSaldo());
		System.out.println("Saldo da conta destino depois de receber a transfer�ncia: R$" + conta3.ConsultarSaldo());

		// saque
		System.out.println("\n\tSAQUE: ");
		System.out.println("Saldo da conta antes de efetuar o saque: R$" + conta2.ConsultarSaldo());
		conta2.Sacar(300);
		System.out.println("Saldo da conta depois de efetuar o saque: R$" + conta2.ConsultarSaldo());
	}

}
