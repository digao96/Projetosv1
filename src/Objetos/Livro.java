package Objetos;

public class Livro {

	String Titulo, ISBN, Autor, Editora;
	double valor;
	int estoque;

	public Livro() {

	}

	public Livro(String titulo, String iSBN, String autor, String editora, double valor, int estoque) {
		super();
		Titulo = titulo;
		ISBN = iSBN;
		Autor = autor;
		Editora = editora;
		this.valor = valor;
		this.estoque = estoque;
	}



	public void info() {
		System.out.printf("\nTítulo: %s%nISBN: %s%nValor: %s%nAutor: %s%nEditora: %s%nEstoque: %s%n", this.Titulo,
				this.ISBN, this.valor, this.Autor, this.Editora, this.estoque);
	}

	public void nomes(Livro l1, Livro l2, Livro l3) {
		int i = 1;
		System.out.printf("[%d] %s\n", i, l1.Titulo);
		i++;
		System.out.printf("[%d] %s\n", i, l2.Titulo);
		i++;
		System.out.printf("[%d] %s\n", i, l3.Titulo);
		i++;

	}

	public void novoValor(double newValor) {
		this.valor = newValor;
	}

	public void novoEstoque(int newEstoque) {
		this.estoque = newEstoque;
	}

	public void incrementarEstoque(int newEstoque) {
		this.estoque = this.estoque+newEstoque;
	}

	public void decrementaEstoque(int newEstoque) {
		this.estoque = this.estoque-newEstoque;
	}

}
