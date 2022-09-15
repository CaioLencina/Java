package br.edu.qi.cadastroCliente;

public class CadastroDeCliente {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private double rendaBruta;
	private double limite;
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg() {
		return this.rg;
	}
	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return this.endereco;
	}
	
	
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	public double getRendaBruta() {
		return this.rendaBruta;
	}
	
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return this.limite;
	}
	
	
	
	public void sacar() {}
	public void depositar() {}
	public void consultarSaldo() {}
	public void transferir() {}
}
