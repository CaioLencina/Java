package br.edu.qi.cadastroCao;

import java.util.Scanner;

import br.edu.qi.cadastroCao.*;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		CadastroDeCao cao1 = new CadastroDeCao();
		CadastroDeCao cao2 = new CadastroDeCao();
		
		System.out.print("Informe os dados do cão 1\n"
				+ "Nome: ");
		cao1.setNome(ler.next());
		
		System.out.print("Raça do cão: ");
		cao1.setRaca(ler.next());

		System.out.print("Qual a cor do cão: ");
		cao1.setCor(ler.next());
		
		System.out.print("Sexo do cão: ");
		cao1.setSexo(ler.next());
		
		System.out.print("Porte do cão: ");
		cao1.setPorte(ler.next());
		
		System.out.print("Idade o cão: ");
		cao1.setIdade(ler.nextByte());
		
		System.out.print("Nome do dono: ");
		cao1.setDono(ler.next());
		
		
		
		
		
		System.out.print("\n Informe os dados do cão 2\n"
				+ "Nome: ");
		cao2.setNome(ler.next());
		
		System.out.print("Raça do cão: ");
		cao2.setRaca(ler.next());

		System.out.print("Qual a cor do cão: ");
		cao2.setCor(ler.next());
		
		System.out.print("Sexo do cão: ");
		cao2.setSexo(ler.next());
		
		System.out.print("Porte do cão: ");
		cao2.setPorte(ler.next());
		
		System.out.print("Idade o cão: ");
		cao2.setIdade(ler.nextByte());
		
		System.out.print("Nome do dono: ");
		cao2.setDono(ler.next());
		
		System.out.println(
				"\n\nDados do cao 1"
				+cao1.toString()
				+"\n\nDados do cao 2"
				+cao2.toString());
		
		
	}

}
