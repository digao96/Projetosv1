package Livraria;

public class Livraria {

	private String titulo, editora, area;
	private int ano;
	private double valor;

	public Livraria() {
	}

	public Livraria(String titulo, String editora, String area, int ano, double valor) {
		this.titulo = titulo;
		this.editora = editora;
		this.area = area;
		this.ano = ano;
		this.valor = valor;
	}

	public String buscaLivro(String buscaLivro) {
		return titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "\nTítulo/Editora: "+titulo+"/"+editora+"\nCategoria: "+area+"\nAno: "+ano+"\nValor: R$ "+valor;
	}

}