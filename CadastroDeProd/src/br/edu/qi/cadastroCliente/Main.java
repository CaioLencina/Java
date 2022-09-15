package br.edu.qi.cadastroCliente;

import java.util.Scanner;

import br.edu.qi.cadastroCliente.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		CadastroDeCliente cliente1 = new CadastroDeCliente();
		CadastroDeCliente cliente2 = new CadastroDeCliente();
		
		
		System.out.print("Informe os dados do cliente 1\n"
				+ "Nome: ");
		cliente1.setNome(ler.next());
		
		System.out.print("CPF do Cliente: ");
		cliente1.setCpf(ler.next());

		System.out.print("RG: ");
		cliente1.setRg(ler.next());
		
		System.out.print("Endereço: ");
		cliente1.setEndereco(ler.next());
		
		System.out.print("Renda Bruta: ");
		cliente1.setRendaBruta(ler.nextDouble());
		
		System.out.print("Limite: ");
		cliente1.setLimite(ler.nextDouble());
		
		
		System.out.print("\nInforme os dados do cliente 2\n"
				+ "Nome: ");
		cliente2.setNome(ler.next());
		
		System.out.print("CPF do Cliente: ");
		cliente2.setCpf(ler.next());

		System.out.print("RG: ");
		cliente2.setRg(ler.next());
		
		System.out.print("Endereço: ");
		cliente2.setEndereco(ler.next());
		
		System.out.print("Renda Bruta: ");
		cliente2.setRendaBruta(ler.nextDouble());
		
		System.out.print("Limite: ");
		cliente2.setLimite(ler.nextDouble());

	}

}
