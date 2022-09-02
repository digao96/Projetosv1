package Objetos;

public class Remedio {

	String Nome, Tarja, Laboratorio;
	double valor;
	int estoque;
	int i = 1;
	
	public Remedio() {
		
	}
	
	public Remedio(String nome, String tarja, String laboratorio, double valor, int estoque) {
		Nome = nome;
		Tarja = tarja;
		Laboratorio = laboratorio;
		this.valor = valor;
		this.estoque = estoque;
	}

	public void nomes(Remedio r1, Remedio r2, Remedio r3) {
		i = 1;
		System.out.printf("[%d] %s\n", i, r1.Nome);
		i++;
		System.out.printf("[%d] %s\n", i, r2.Nome);
		i++;
		System.out.printf("[%d] %s\n", i, r3.Nome);
		i++;
	}
	
	public void novoEstoque(int opcao, int valor, Remedio r1, Remedio r2, Remedio r3) {
		if (opcao == 1) {
			r1.estoque = valor;
		}
		if (opcao == 2) {
			r2.estoque = valor;
		}
		if (opcao == 3) {
			r3.estoque = valor;
		}
	}

	public void info() {
		System.out.printf("\nNome: %s\nTarja: %s\nLaboratório: %s\nValor: %.2f\nEstoque: %d\n", this.Nome, this.Tarja,
				this.Laboratorio, this.valor, this.estoque);
	}
	
	public void novoValor(int opcao, double newValor, Remedio r1, Remedio r2, Remedio r3) {
		if (opcao == 1) {
			r1.valor = newValor;
		}
		if (opcao == 2) {
			r2.valor = newValor;
		}
		if (opcao == 3) {
			r3.valor = newValor;
		}
	}

	public void incrementaEstoque(int opcao, int valor, Remedio r1, Remedio r2, Remedio r3) {
		if (opcao == 1) {
			r1.estoque = r1.estoque+valor;
		}
		if (opcao == 2) {
			r2.estoque = r2.estoque+valor;
		}
		if (opcao == 3) {
			r3.estoque = r3.estoque+valor;
		}
	}
	
	public void decrementaEstoque (int opcao, int valor, Remedio r1, Remedio r2, Remedio r3) {
		if (opcao == 1) {
			r1.estoque = r1.estoque-valor;
		}
		if (opcao == 2) {
			r2.estoque = r2.estoque-valor;
		}
		if (opcao == 3) {
			r3.estoque = r3.estoque-valor;
		}
	}
}
