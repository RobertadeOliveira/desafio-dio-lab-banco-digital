
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	public void conferirRendimento(int dias){
		System.out.println("A Conta Corrente não possui rendimento, apenas a conta poupança");
	}
	
}
