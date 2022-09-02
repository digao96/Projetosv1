package Livraria;
import java.util.ArrayList;
import java.util.Scanner;

public class LivrariaMain {

	public static void main(String[] args) {
		ArrayList<Livraria> Livros = new ArrayList<>();
		try (Scanner teclado = new Scanner(System.in)) {
			int opcao = 10;
			
			do {
				menuPrincipal();
				opcao = teclado.nextInt();
				
				switch (opcao) {
				case 0:
				opcao = 0;
				break;
					
				case 1:
					Livraria l = new Livraria();
					System.out.print("Digite o Título: ");
					teclado.nextLine();
					l.setTitulo(teclado.nextLine());
					System.out.print("Digite a Editora: ");
					l.setEditora(teclado.nextLine());
					System.out.print("Digite a Categoria: ");
					l.setArea(teclado.nextLine());
					System.out.print("Digite o Ano: ");
					l.setAno(teclado.nextInt());
					System.out.print("Digite o Valor: ");
					l.setValor(teclado.nextDouble());

					Livros.add(l);
					break;

				case 2:
					for (Livraria listarLivros : Livros) {
						System.out.println(listarLivros);
					}
					break;
				case 3:
					System.out.println("Buscar livro por título");
					System.out.print("título: ");
					String buscaLivro = teclado.next();
					
					boolean controle = false;
					for (int i = 0; i < Livros.size(); i++) {
						Livraria busca = Livros.get(i);
						if (buscaLivro.equalsIgnoreCase(busca.getTitulo())) {
							System.out.print("Título Encontrado: "+busca.getTitulo());
							controle = true;
							break;
						}
					}
					if (!controle) {
						System.out.println("Título não Encontrado!");
					}
					break;
				case 4:
					System.out.println("Buscar livro por categoria");
					System.out.print("Nome: ");
					String buscaCategoria = teclado.next();
					
					controle = false;
					for (Livraria buscar : Livros) {
						if (buscaCategoria.equalsIgnoreCase(buscar.getArea())) {
							System.out.print("Livros Encontrada na categoria "+buscar.getArea());
							System.out.println("\n"+buscar.getTitulo());
							controle = true;
							break;
						} 
					}
					if (!controle) {
						System.out.println("Categoria não encontrada!");
					}
					break;
					
				case 5:
					System.out.println("Buscar livro por um valor menor");
					System.out.print("Valor: ");
					Double buscaPreco = teclado.nextDouble();
					
					controle = false;
					for (Livraria buscar : Livros) {
						if (buscaPreco > buscar.getValor()) {
							System.out.println("Encontramos livros abaixo do valor desejado");
							System.out.println("Livro: "+buscar.getTitulo()+" - Valor: R$"+buscar.getValor());
							controle = true;
						}
					}
					if (!controle) {
						System.out.println("Nenhum livro encontrado abaixo desse valor");
					}
					break;
				default:
					System.out.println("Número no Menu não encontrado! tente novamente");
				}
			} while (opcao != 0);
		}
	}
	
	static void menuPrincipal() {
		System.out.println("\n1 - Cadastrar novo livro");
		System.out.println("2 - Listar Livros");
		System.out.println("3 - Buscar livros por nome");
		System.out.println("4 - Buscar livros por categoria");
		System.out.println("5 - Buscar livros por preço");
		System.out.println("0 - Encerrar atividades");
	}
}