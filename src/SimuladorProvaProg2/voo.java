package SimuladorProvaProg2;

public class voo {

	String codVoo;
	String origem;
	String destino;
	piloto comandante;
	aviao aeronave;

	public voo(String codVoo, String origem, String destino, piloto comandante, aviao aeronave) {
		this.codVoo = codVoo;
		this.origem = origem;
		this.destino = destino;
		this.comandante = comandante;
		this.aeronave = aeronave;
	}

	public void info() {
		System.out.println("\n=== Informações do Voo");
		System.out.println("Voo/Empresa: " + this.codVoo + "/" + this.aeronave.empresa);
		System.out.printf("Origem/Destino: %s/%s", this.origem, this.destino);
		System.out.println("\nModelo Aeronave: " + this.aeronave.modelo + "/" + this.aeronave.prefixo);
		System.out.println("Comandante: " + this.comandante.nome);
	}

}