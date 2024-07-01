
public class ContaPoupanca extends Conta {
	
	private static double SELIC = 0.005;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void conferirRendimento(int dias){
		double rendimento = 0;
		if (this.saldo > 0)
				rendimento = (SELIC * (dias/30))*saldo;	
		
		System.out.println("O rendimento da conta em " + dias + " dias, será de R$" + rendimento);

	}

}
