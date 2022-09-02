package Heranca;

import java.util.Scanner;

public class veiculoTerrestre extends Veiculo {
	
	String placa, dono;
	
	Scanner teclado = new Scanner(System.in);
	
	public veiculoTerrestre(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, String placa, String dono) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros);
		this.placa = placa;
		this.dono = dono;
	}
	
	public void emplacamento () {
		
	}
	
	public void compra () {
	}
	
	public void add () {
		System.out.print("Placa: ");
		this.placa = teclado.nextLine();
		System.out.print("Dono: ");
		this.dono = teclado.nextLine();
	}
	
	public void infoTerrestre() {
		System.out.println("Placa: "+this.placa);
		System.out.println("Dono: "+this.dono);
	}
	
	
}
