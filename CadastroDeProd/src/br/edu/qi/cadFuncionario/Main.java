package br.edu.qi.cadFuncionario;

import java.util.Scanner;
import br.edu.qi.cadFuncionario.*;
import br.edu.qi.cadastroCliente.CadastroDeCliente;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		CadastroDeFuncionario funcionario1 = new CadastroDeFuncionario();
		CadastroDeFuncionario funcionario2 = new CadastroDeFuncionario();
		
		
		System.out.print("Informe os dados do Funcionario 1\n"
				+ "Nome: ");
		funcionario1.setNome(ler.next());
		
		System.out.print("Valor Hora: ");
		funcionario1.setValorHora(ler.nextDouble());

		System.out.print("Carga horária do mês: ");
		funcionario1.setCargaHorariaMes(ler.nextDouble());
		
		
		
		
		System.out.print("\nInforme os dados do Funcionario 2\n"
				+ "Nome: ");
		funcionario2.setNome(ler.next());
		
		System.out.print("Valor Hora: ");
		funcionario2.setValorHora(ler.nextDouble());

		System.out.print("Carga horária do mês: ");
		funcionario2.setCargaHorariaMes(ler.nextDouble());
		
		
		System.out.println(
				"\n\nDados do funcionário 1"
				+funcionario1.toString()
				+"\n\nDados do funcionário 2"
				+funcionario2.toString());
	}

}
