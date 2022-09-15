package br.edu.qi.cadCarro;

public class CadastroDeCarro {
	private String marca;
	private String modelo;
	private String chassi;
	private int anoFabricao;
	private int anoModelo;
	private double valorUnitario;
	private int quantidade;
	private double nivelTanque;
	private double mediaKmLitro;
	
	public double calcularValorTotalDoVeiculo() {
		return valorUnitario * quantidade;
	}
	public double calcularDistanciaAPercorrer() {
		return nivelTanque * mediaKmLitro;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getAnoFabricao() {
		return anoFabricao;
	}
	public void setAnoFabricao(int anoFabricao) {
		this.anoFabricao = anoFabricao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getNivelTanque() {
		return nivelTanque;
	}
	public void setNivelTanque(double nivelTanque) {
		this.nivelTanque = nivelTanque;
	}
	public double getMediaKmLitro() {
		return mediaKmLitro;
	}
	public void setMediaKmLitro(double mediaKmLitro) {
		this.mediaKmLitro = mediaKmLitro;
	}	
		
	public String toString() {
		return "Marca do veículo: "+this.marca+"\n"
				+"Modelo do veículo: "+this.modelo+"\n"
				+"Ano do modelo: "+this.anoModelo+"\n"
				+"Chassi do veículo: "+this.chassi+"\n"
				+"Ano de fabricação do veículo: "+this.anoFabricao+"\n"
				+"Valor unitário do veículo: R$"+this.valorUnitario+"\n"
				+"Quantidade de veículos comprados: "+this.quantidade+"\n"
				+"Nível do tanque: "+this.nivelTanque+" litros\n"
				+"Quilômetros por litro: "+this.mediaKmLitro+" KM/h\n"
				+"Valor total do veículo: R$"+this.calcularValorTotalDoVeiculo()+"\n"
				+"Distância a percorrer: "+this.calcularDistanciaAPercorrer()+" KM/h";
	}

}
