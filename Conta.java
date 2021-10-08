package ae1;

public abstract class Conta {
	protected int numero;
	protected int agencia;
	protected Cliente cliente;
	protected double saldo;
	
	public Conta(int numero, int agencia, Cliente cliente) {
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setCliente(cliente);
		this.saldo = 0;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito realizado com sucesso!");
		System.out.println("Saldo: "+saldo);
	}
	public abstract double sacar();
	
	public Cliente getinfo() {
		return this.cliente;
	}
	
	public void verificAgenciaConta(int numero, int agencia) {
		if((numero == 0)||(agencia == 0)) {
			System.out.println("Numero da conta e agencia devem ser diferentes de zero!");
		}
	}

}
