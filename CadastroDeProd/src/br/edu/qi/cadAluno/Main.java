package br.edu.qi.cadAluno;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		CadastroAluno aluno1 = new CadastroAluno();
		CadastroAluno aluno2 = new CadastroAluno();
		
		System.out.println("Insira os dados do aluno 1: ");
		System.out.print("Nome do aluno: ");
		aluno1.setNome(ler.next());
		System.out.print("Nota 1: ");
		aluno1.setNota1(ler.nextDouble());
		System.out.print("Nota 2: ");
		aluno1.setNota2(ler.nextDouble());
		System.out.print("Confira os dados do aluno 1: "+aluno1.toString());
		
		System.out.println("\nInsira os dados do aluno 2: ");
		System.out.print("Nome do aluno: ");
		aluno2.setNome(ler.next());
		System.out.print("Nota 1: ");
		aluno2.setNota1(ler.nextDouble());
		System.out.print("Nota 2: ");
		aluno2.setNota2(ler.nextDouble());
		System.out.print("Confira os dados do aluno 1: "+aluno2.toString());

	}

}
