package br.edu.qi.cadFuncionario;

public class CadastroDeFuncionario {
	private String nome;
	private double valorHora;
	private double cargaHorariaMes;
	
	private double calcularSalario() {
		return valorHora * cargaHorariaMes; }
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getvalorHora() {
		return this.valorHora;
	}
	
	
	public void setCargaHorariaMes(double cargaHorariaMes) {
		this.cargaHorariaMes = cargaHorariaMes;
	}
	public double getCargaHorariaMes() {
		return this.cargaHorariaMes;
	}
	
	
	
	
	public String toString() {
		return "\n"+"Nome: "+this.nome+"\n"
				+"Valor ganho por hora trabalhada: "+this.valorHora+"\n"
				+"Carga horária mensal: "+this.cargaHorariaMes+"\n"
				+"Salário base: "+this.calcularSalario();
	}
}
