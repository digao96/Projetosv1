package Heranca;

import java.util.Scanner;

public class Veiculo {
	
	String fabricante, modelo, pais;
	int posicaoX, posicaoY;
	double valor;
	int passageiros;
	
	Scanner teclado = new Scanner(System.in);
	
	public Veiculo(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.pais = pais;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.valor = valor;
		this.passageiros = passageiros;
	}
	
	public void deslocamento () {
		
	}
	
	public void infoVeiculo () {
		 System.out.println("Fabricante/Modelo: " +this.fabricante+" / "+this.modelo);
		 System.out.println("Pais: "+this.pais);
		 System.out.println("Posição X: "+this.posicaoX);
		 System.out.println("Posição Y: "+this.posicaoY);
		 System.out.printf("Valor R$ %.2f\n", this.valor);
		 System.out.println("Passageiro: "+this.passageiros);
	}
	
}
