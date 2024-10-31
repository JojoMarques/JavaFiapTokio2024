package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, String numeroConta, float saldoCliente) {
		super(cliente, numeroConta, saldoCliente);
	}

	public void investir() {

	}

	@Override
	public void exibirSaldo() {
		System.out.println("Numero de conta: " + this.numeroConta);
		System.out.println("Cliente: " + this.cliente.getNomeCliente());
		System.out.println("Saldo: " + this.saldoCliente);
		System.out.println("Saldo Investimento: " + this.saldoInvestimento);
		System.out.println("Data de abertura da conta: " + this.dataAbertura);
		System.out.println("Data de nascimento: " + this.cliente.getDataNasc());
	}

	// passa o produto aqui pra saber o produto que vem pra cá
	// esse Produto produto não é uma instância da interface produto, e sim das classes que implementam essa interface (?) 
	public void investimento(Produto produto, double valor) {
		/* aqui na condição, o prfessor coloca if(...sacar()), isso pq o sacar dele retorna booelan (aí ja faz a verificação)
		if (this.saldoCliente >= valor) //minha versão antiga {*/
		if(this.Sacar(valor)) {
		this.saldoInvestimento += produto.investir(valor);
		 }
	}

	/* MINHA VERSÃO ANTIGA (COM MINHA LÓGICA PURA)
	 * public void investir(String tipoProduto, float valor) {
	 * 
	 * double valorAplicado; 
	 * float saldoTrocado;
	 * 
	 * // no meu, eu consigo pegar diretamente pleo this pq meus atributos lá estão
	 * // como protected. 
	 * if (this.saldoCliente >= valor) { 
	 * switch
	 * (tipoProduto.toUpperCase()) { 
	 * case "CDB":
	 * valor += valor * 1 / 100; 
	 * this.saldoInvestimento = valor;
	 * this.saldoCliente = this.saldoCliente - valor; 
	 * break; 
	 * case "LCI": 
	 * valor += valor * 0.9 / 100; 
	 * this.saldoInvestimento = valor;
	 * this.saldoCliente = this.saldoCliente - valor; 
	 * break; 
	 * case "LCA": 
	 * valor += valor * 0.8 / 100; 
	 * this.saldoInvestimento = valor;
	 * this.saldoCliente = this.saldoCliente - valor; 
	 * break; 
	 * default:
	 * System.out.println("tipo de produto inválido."); 
	 * } 
	 * } else
	 * System.out.println("Saldo insuficiente para efetuar investimento."); 
	 * }
	 */
}
