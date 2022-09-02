package Heranca;

public class Aviao extends veiculoAereo {

	int numeroTripulantes;
	
	public Aviao(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, int posicaoZ, String empresa, int numeroTripulantes) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros, codigo, posicaoZ, empresa);
		this.numeroTripulantes = numeroTripulantes;
	}
	
	public void cadastraAviao() {
		add();
		System.out.print("Qntd Tripulantes: ");
		this.numeroTripulantes = teclado.nextInt();
	}
	
	public void infoAviao () {
		 infoAereo();
		 System.out.println("Qntd Tripulantes: "+this.numeroTripulantes);
	}
 

}

