package Heranca;

public class Navio extends veiculoMaritimo {
	
	String nome;
	
	public Navio(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, String empresa, String nome) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, codigo, empresa);
		this.nome = nome;
	}
	
	public void cadastraNavio() {
		add();
		System.out.print("Nome: ");
		this.nome = teclado.nextLine();
	}
	
	public void infoNavio () {
		infoMaritimo();
		System.out.println("Nome: "+this.nome);
		
	}

}
