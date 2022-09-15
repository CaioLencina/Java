package br.edu.qi.cadAluno;

public class CadastroAluno {
	private double nota1;
	private double nota2;
	private double somaDasNotas = nota1 + nota2;
	
	public double calcularMedia() {
		return nota1+nota2/2;
	}
	public String verificarSituacao() {
		if (this.somaDasNotas / 2>=6) {
			return "O aluno esta aprovado!";
		} else {
			return "O aluno esta reprovado!";
		}
	}
	
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public String toString() {
		return "\nNome do aluno: "+this.nome+"\n"
				+"Nota 1: "+this.nota1+"\n"
				+"Nota 2: "+this.nota2+"\n"
				+"Média : "+this.calcularMedia()+"\n"
				+"Situação do aluno : "+this.verificarSituacao()+"\n";
	}

	
	
}
