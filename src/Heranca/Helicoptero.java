package Heranca;

public class Helicoptero extends veiculoAereo{
	
	String rotores;

	public Helicoptero(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, int posicaoZ, String empresa, String rotores) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, codigo, posicaoZ, empresa);
		this.rotores = rotores;
	}
	
	public void cadastraHelicoptero () {
		add();
		System.out.println("Rotores: ");
		this.rotores = teclado.nextLine();
	}

	public void infoHelicoptero() {
		 infoAereo();
		 System.out.println("Rotores: "+this.rotores);
	}
	
}
