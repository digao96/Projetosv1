package SimuladorProvaProg2;

public class aviao {

	String prefixo;
	String empresa;
	String modelo;

	public aviao(String prefixo, String empresa, String modelo) {
		this.prefixo = prefixo;
		this.empresa = empresa;
		this.modelo = modelo;
	}

	public void info() {
		System.out.printf("\n=== Informações do Avião\nPrefixo: %s\nEmpresa: %s\nModelo: %s\n", this.prefixo,
				this.empresa, this.modelo);
	}

}