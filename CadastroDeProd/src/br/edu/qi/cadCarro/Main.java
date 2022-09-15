package br.edu.qi.cadCarro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		CadastroDeCarro carro1 = new CadastroDeCarro();
		CadastroDeCarro carro2 = new CadastroDeCarro();
		
		
		System.out.println("Insira os dados veículo do 1: ");
		System.out.print("Marca do veículo: ");
		carro1.setMarca(ler.next());
		System.out.print("Modelo do veículo: ");
		carro1.setModelo(ler.next());
		System.out.print("Ano do modelo: ");
		carro1.setAnoModelo(ler.nextInt());
		System.out.print("Chassi do veículo: ");
		carro1.setChassi(ler.next());
		System.out.print("Ano de fabricação do veículo: ");
		carro1.setAnoFabricao(ler.nextInt());
		System.out.print("Valor unitário do veículo: ");
		carro1.setValorUnitario(ler.nextDouble());
		System.out.print("Nível do tanque: ");
		carro1.setNivelTanque(ler.nextDouble());
		System.out.print("Quilômetros por litro: ");
		carro1.setMediaKmLitro(ler.nextDouble());
		System.out.println("Confira os dados do veículo 1: "+carro1.toString());
		
		System.out.println("\nInsira os dados do veículo 2: ");
		System.out.print("Marca do veículo: ");
		carro2.setMarca(ler.next());
		System.out.print("Modelo do veículo: ");
		carro2.setModelo(ler.next());
		System.out.print("Ano do modelo: ");
		carro2.setAnoModelo(ler.nextInt());
		System.out.print("Chassi do veículo: ");
		carro2.setChassi(ler.next());
		System.out.print("Ano de fabricação do veículo: ");
		carro2.setAnoFabricao(ler.nextInt());
		System.out.print("Valor unitário do veículo: ");
		carro2.setValorUnitario(ler.nextDouble());
		System.out.print("Nível do tanque: ");
		carro2.setNivelTanque(ler.nextDouble());
		System.out.print("Quilômetros por litro: ");
		carro2.setMediaKmLitro(ler.nextDouble());
		System.out.println("Confira os dados do veículo 1: "+carro2.toString());

	}

}
