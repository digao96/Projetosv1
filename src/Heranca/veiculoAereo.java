package Heranca;

public class veiculoAereo extends Veiculo {

	int codigo, posicaoZ;
	String empresa;
	
	public veiculoAereo(String fabricante, String modelo, String pais, int posicaoX, int posicaoY, double valor,
			int passageiros, int codigo, int posicaoZ, String empresa) {
		super(fabricante, modelo, pais, posicaoX, posicaoY, valor, passageiros);
		this.codigo = codigo;
		this.posicaoZ = posicaoZ;
		this.empresa = empresa;
	}
	
	public void deslocamento () {
		
	}
	
	public void compra () { 
		
	}
	
	public void add () {
		System.out.print("Código: ");
		this.codigo = teclado.nextInt();
		System.out.print("Posição Z: ");
		this.posicaoZ = teclado.nextInt();
		System.out.print("Empresa: ");
		teclado.nextLine();
		this.empresa = teclado.nextLine();
	}
	
	public void infoAereo () {
		System.out.println("Código: "+this.codigo);
		System.out.println("Posição Z: "+this.posicaoZ);
		System.out.println("Empresa: "+this.empresa);
	
	}

}
