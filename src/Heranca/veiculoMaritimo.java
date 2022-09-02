package Heranca;

public class veiculoMaritimo extends Veiculo {

	int codigo;
	String empresa;
	
	public veiculoMaritimo(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, String empresa) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros);
		this.codigo = codigo;
		this.empresa = empresa;
	}
	
	public void compra () {
		
	}
	
	public void add () {
		System.out.print("Codigo: ");
		this.codigo = teclado.nextInt();
		System.out.print("Empresa: ");
		teclado.nextLine();
		this.empresa = teclado.nextLine();
	}
	
	public void infoMaritimo() {
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Empresa: "+this.empresa);
	}

}
