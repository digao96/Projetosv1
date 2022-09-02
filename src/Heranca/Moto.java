package Heranca;

public class Moto extends veiculoTerrestre {
	
	String cilindradas;

	public Moto(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, String placa, String dono, String cilindradas) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, placa, dono);
		this.cilindradas = cilindradas;
	}
	
	public void cadastraMoto () {
		add();
		System.out.print("Cilindradas: ");
		this.cilindradas = teclado.nextLine();
	}
	
	public void infoMoto () {
		infoTerrestre();
		System.out.println("Cilindradas: "+this.cilindradas);
	}
	

	
}
