package Ving;

public class ContaTeste {
	public static void main(String[] args) {
		RainBank c1 = new RainBank();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		

	
		cc.abrirConta();
		cc.depositar(1000);
		System.out.println("Saldo: R$ " + cc.getSaldo());
		cc.transferir(800);
		System.out.println("Saldo: R$ " + cc.getSaldo());
		cp.abrirConta();
		cp.depositar(1000);
		System.out.println("Saldo: R$ " + cp.getSaldo());
		cp.transferir(2000);
		System.out.println("Saldo: R$ " + cp.getSaldo());
		
		
		
	
		
	}

	
}
