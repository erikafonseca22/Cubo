package Ving;

import java.util.Scanner;

public class ContaCorrente extends RainBank {

	private double pix;
	
	
	@Override
	public void abrirConta() {
		this.setSaldo(40);
		System.out.println("Parabéns! Agora você é nosso cliente!");
		System.out.println("Conte conosco!");
		System.out.println("O código da sua agência é 8880.");
		System.out.println("O número da sua conta é:");
		System.out.println(Math.random());
		System.out.println("Você ganhou de bônus o valor R$ " + saldo); 
		
	
	}
	
	public void depositar(double valor) {
		this.setSaldo(valor + this.getSaldo());
		System.out.println("Valor do depósito: R$ " + valor); 
	}
	
	@Override
	public void transferir(double pix) {
		if (this.getSaldo() >= -1000 && this.getSaldo() >= pix) {
			this.setSaldo(this.getSaldo() - pix);
			System.out.print("Pix de R$ " + pix); 
			System.out.println(" realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente. Pix não realizado."); 
		}
		
	}
}
