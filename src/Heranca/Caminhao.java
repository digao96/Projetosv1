package Heranca;

public class Caminhao extends veiculoTerrestre {

	String eixos, peso;
	
	public Caminhao(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, String placa, String dono, String eixos, String peso) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, placa, dono);
		this.eixos = eixos;
		this.peso = peso;
	}
	
	
	public void carga () {
		
	}
	
	public void descarga () {
			
	}
	
	public void cadastraCaminhao () {
		add();
		System.out.print("Eixos: ");
		this.eixos = teclado.nextLine();
		System.out.print("Peso: ");
		this.peso = teclado.nextLine();
	}
	
	public void infoCaminhao () {
		infoTerrestre();
		System.out.println("Eixos: "+this.eixos);
		System.out.println("Peso: "+this.peso);
	}
	
}
