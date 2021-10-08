package ae1;

public class ContaCorrente extends Conta{
	
	double valor;

	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public double sacar() {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= valor;
			saldo -= 0.10;
			System.out.println("Saque realizado com sucesso!");
		}
			return 0;
	}
	
}
