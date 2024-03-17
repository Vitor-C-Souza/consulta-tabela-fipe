package br.com.desafio.consultatabelafipe.consultatabelafipe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import br.com.desafio.consultatabelafipe.Menu.Menu;

@SpringBootApplication
public class ConsultaTabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaTabelaFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var leitura = new Scanner(System.in);
		Menu menu = new Menu();

		String TipoVeiculo;
		String Marca;
		String Modelo;
		String Ano;

		System.out.print("Digite o tipo do veículo para busca (carros, motos, caminhoes): ");
		TipoVeiculo = leitura.nextLine().toLowerCase();

		menu.getVeiculo(TipoVeiculo);

		System.out.print("Digite o código válido da marca do veículo: ");
		Marca = leitura.nextLine();

		menu.getModelo(Marca);

		System.out.print("Digite o código válido da modelo do veículo: ");
		Modelo = leitura.nextLine();

		menu.getAno(Modelo);

		System.out.print("Digite o ano do carro: ");
		Ano = leitura.nextLine();

		menu.getResultado(Ano);

		leitura.close();
		
	}
}
