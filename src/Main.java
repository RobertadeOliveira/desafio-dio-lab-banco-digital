
public class Main {

	public static void main(String[] args) {
		Cliente roberta = new Cliente();
		roberta.setNome("Roberta");
		
		Conta cc = new ContaCorrente(roberta);
		Conta poupanca = new ContaPoupanca(roberta);

		cc.depositar(1000);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		poupanca.conferirRendimento(30);
	}

}
