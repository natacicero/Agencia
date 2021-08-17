package br.com.estudojar;

import br.com.turmasi.modelo.Carro;
import br.com.turmasi.modelo.Gerente;
import br.com.turmasi.modelo.Venda;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(3010,"Marcelo Vieira",7500);
		
		Carro carro = new Carro("VW","Gol","Azul",7300);
		
		Venda venda = new Venda();
		venda.registravenda(gerente, carro);
		
		
	
		
		

	}

}
