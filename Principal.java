package ae1;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Madson", "01845639332");
		Conta conta1 = new ContaCorrente(41398,1637, cliente);
		Conta conta2 = new ContaPoupanca(277943, 1989, cliente);
		
		mostraDados(conta1, conta2);
		

	}
	
	private static void mostraDados(Conta conta1, Conta conta2) {
		System.out.println("--------CONTA CORRENTE--------\n");
		
		System.out.println("Conta: "+ conta1.getNumero() +"\n"+
		"Agencia: "+ conta1.getAgencia()+"\n"+
				"Cliente: "+ conta1.getinfo().getNome()+"\n"+
		"Saldo: "+ conta1.getSaldo()+"\n");
		
		System.out.println("--------CONTA POUPANCA--------\n");
		
		System.out.println("Conta:"+ conta2.getNumero()+"\n"+
		"Agencia: "+ conta2.getAgencia()+"\n"+
				"Cliente: "+ conta2.getinfo().getNome()+"\n"+
		"Saldo: "+ conta2.getSaldo()+"\n");
	}

}
