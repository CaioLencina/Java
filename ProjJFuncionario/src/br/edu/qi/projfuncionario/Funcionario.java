package br.edu.qi.projfuncionario;

public class Funcionario {
	 private String nome;
	 private long cpf;
	 private float valorHora;
	 private float cargaHorariaMes;
	 
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getNome() {
		 return this.nome;
	 }
	 
	 public void setCpf(long cpf) {
		 this.cpf = cpf;
	 }
	 
	 public long getCpf() {
		 return this.cpf;
	 }
	 
	 
	 public void setValorHora(float valorHora) {
		 this.valorHora = valorHora;
	 }
	 
	 public float getValorHora() {
		 return this.valorHora;
	 }
	 
	 public void setCargaHorariaMes(float cargaHorariaMes) {
		 this.cargaHorariaMes = cargaHorariaMes;
	 }
	 
	 public float getCargaHorariaMes() {
		 return this.cargaHorariaMes;
	 }
	 
	 public float calcularSalarioBase() {
		 return this.valorHora * this.cargaHorariaMes;
	 }
	 
	 public String toString() {
		 return "\n"
		 		+ "Nome: "+this.nome+"\n"
		 		+ "Cpf: "+this.cpf+"\n"
		 		+ "Valor hora: "+this.valorHora+"\n"
		 		+ "Carga horária do mês: "+this.cargaHorariaMes+"\n"
		 		+ "Salário base: "+this.calcularSalarioBase();
	 }
	
}
