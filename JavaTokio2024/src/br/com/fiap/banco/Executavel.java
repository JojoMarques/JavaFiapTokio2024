package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {

		// String nomeCliente, String cpfCliente, String numeroConta, float saldoCliente
		Conta conta1 = new Conta("Jojo", "435.543.548-21", "000-123", 1000);
		Conta conta2 = new Conta("João", "123.456.789-10", "000-456", 1000);
		Conta conta3 = new Conta("Mi", "321.123.321-12", "000-789", 1000);

		// depósito
		conta1.Depositar(100);

		System.out.println("\n\tCONSULTA: ");
		// consulta
		System.out.println(conta1.ConsultarSaldo());

		// transferência
		System.out.println("\n\tTRANSFERÊNCIA: ");
		System.out.println("Saldo da conta atual antes de efetuar a transferência: R$" + conta1.ConsultarSaldo());
		System.out.println("Saldo da conta destino antes de receber a transferência: R$" + conta3.ConsultarSaldo());
		conta1.Transferir(1000, conta3);
		System.out.println("Saldo da conta atual depois de efetuar a transferência: R$" + conta1.ConsultarSaldo());
		System.out.println("Saldo da conta destino depois de receber a transferência: R$" + conta3.ConsultarSaldo());

		// saque
		System.out.println("\n\tSAQUE: ");
		System.out.println("Saldo da conta antes de efetuar o saque: R$" + conta3.ConsultarSaldo());
		conta3.Sacar(300);
		System.out.println("Saldo da conta depois de efetuar o saque: R$" + conta3.ConsultarSaldo());

	}

}
