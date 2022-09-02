package Heranca;

public class Submarino extends veiculoMaritimo {

	int posicaoZ, profundidadeMax;
	
	public Submarino(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, String empresa, int posicaoZ, int profudidadeMax) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, codigo, empresa);
		this.posicaoZ = posicaoZ;
		this.profundidadeMax = profundidadeMax;
	}

	public void deslocamento () {
		
	}
	
	public void cadastraSubmarino () {
		add();
		System.out.print("Posição Z: ");
		this.posicaoZ = teclado.nextInt();
		System.out.print("Profundidade Max: ");
		this.profundidadeMax = teclado.nextInt();
	}
	
	public void infoSubmarino () {
		infoMaritimo();
		System.out.println("Posição Z: "+this.posicaoZ);
		System.out.println("Profundidade Max: "+this.profundidadeMax);
	}

	
}
