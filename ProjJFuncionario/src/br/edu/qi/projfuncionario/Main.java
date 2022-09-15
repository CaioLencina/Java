package br.edu.qi.projfuncionario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Funcionario objFuncionario1 = new Funcionario();
		Funcionario objFuncionario2 = new Funcionario();
		
		System.out.print("Informe os dados do funcionário 1\n"
				+ "Nome: ");
		objFuncionario1.setNome(leia.next());
		
		System.out.print("CPF: ");
		objFuncionario1.setCpf(leia.nextLong());
		
		System.out.print("Valor hora: ");
		objFuncionario1.setValorHora(leia.nextFloat());
		
		System.out.print("Carga horária do mês: ");
		objFuncionario1.setCargaHorariaMes(leia.nextFloat());
		
		System.out.print("Informe os dados do funcionário 2\n"
				+ "Nome: ");
		objFuncionario2.setNome(leia.next());
		
		System.out.print("CPF: ");
		objFuncionario2.setCpf(leia.nextLong());
		
		System.out.print("Valor hora: ");
		objFuncionario2.setValorHora(leia.nextFloat());
		
		System.out.print("Carga horária do mês: ");
		objFuncionario2.setCargaHorariaMes(leia.nextFloat());
		
		
		System.out.println(
				"\n\nDados do funcionário 1"
				+objFuncionario1.toString()
				+"\n\nDados do funcionário 2"
				+objFuncionario2.toString());
	
		
	}

}
