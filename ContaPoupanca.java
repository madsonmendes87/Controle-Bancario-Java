package ae1;

public class ContaPoupanca extends Conta {
	
	double valor;
	
	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public double sacar() {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
			return 0;
	}

}
