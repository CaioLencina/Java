package br.edu.qi.cadProduto;

import java.util.Scanner;
import br.edu.qi.cadProduto.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		CadastroDeProduto produto1 = new CadastroDeProduto();
		
		
		
		
		System.out.print("Digite um nome: ");
		produto1.setNome(ler.nextLine());
		
		System.out.print("Descrição do produto: ");
		produto1.setDescricao(ler.nextLine());
		
		System.out.print("Digite o valor do produto: ");
		produto1.setValor(ler.nextDouble());
		
	}

}
