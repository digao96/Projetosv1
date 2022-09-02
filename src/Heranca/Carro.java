package Heranca;



public class Carro extends veiculoTerrestre {

	
	String combustivel, classe, potencia;
	
	public Carro(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, String placa, String dono, String combustivel, String classe, String potencia) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, placa, dono);
		this.combustivel = combustivel;
		this.classe = classe;
		this.potencia = potencia;
	}
	
	public void cadastraCarro () {
		add();
		System.out.print("Combustível: ");
		this.combustivel = teclado.nextLine();
		System.out.print("Classe: ");
		this.classe = teclado.nextLine();
		System.out.print("Potência: ");
		this.potencia = teclado.nextLine();
	}
	
	public void infoCarro() {
		infoTerrestre();
		System.out.println("Combustivel: "+this.combustivel);
		System.out.println("Classe: "+this.classe);
		System.out.println("Potência: "+this.potencia);
	}
	
	
	
}
