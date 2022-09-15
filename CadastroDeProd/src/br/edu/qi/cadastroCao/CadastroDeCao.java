package br.edu.qi.cadastroCao;

public class CadastroDeCao {

	private String nome;
	private String raca;
	private String cor;
	private String sexo;
	private String porte;
	private byte idade;
	private String dono;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getRaca() {
		return this.raca;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return this.sexo;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getPorte() {
		return this.porte;
	}
	
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public byte getIdade() {
		return this.idade;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return this.dono;
	}
	
	public void latir() {}
	
	public void comer() {}
	
	public void correr() {}
	
	public void pular() {}
	
	public void morder() {}
	
	
}
