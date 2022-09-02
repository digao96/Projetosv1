package Objetos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declarando Variáveis;
		int valorMenu = 0, num = 0, i = 1, opcao = 0, tamVetor = 2, valor = 0, newEstoque = 0;
		double newValor = 0;
		Scanner teclado = new Scanner(System.in);

		// Método Construtor padrão da classe (sem nenhum paramêtro);
		Empresa empresa = new Empresa();
		Remedio remedio = new Remedio();
		Livro livro = new Livro();
		Funcionario funcionario = new Funcionario();

		// Populando 3 Ojbetos de cada classe (Empresa/Remédio/Livro/Funcionário);
		Empresa emp1 = new Empresa("Loja TechMania", "438423", "Rua dos Andradas 832", "Vendas de Produtos para TI");
		Empresa emp2 = new Empresa("Loja TazMania", "3847273", "Rua Riachuelo 388", "Roupas Infantis");
		Empresa emp3 = new Empresa("Tio Nelso", "2392484", "Rua Rubem Pereira Torelly 2436",
				"Lancheria, Xis e petiscos");
		Remedio r1 = new Remedio("Ipubrofeno", "Vermelha", "Laboratório Saúde", 13.75, 100);
		Remedio r2 = new Remedio("Roacutan", "Vermelha", "Laboratório Particular", 80.50, 50);
		Remedio r3 = new Remedio("Cefaliv", "Vermelha", "Laboratório dos Guri", 40.50, 75);
		
		Livro l1 = new Livro("Os Segredos da Mente Milionaria", "749583","Harv Eker", "Sextante", 19.99, 194);
		Livro l2 = new Livro("O Poder do Subconsciente", "398428", "Joseph Murphy", "Viva Livros", 25.90, 45);
		Livro l3 = new Livro("O Milagre da Manhã", "7639842", "Hal Elrod", "Editora Best Seller", 35.50, 121);
		
		Funcionario f1 = new Funcionario("Rodrigo", "Borges", "03865948239", "Estagiário", 1200);
		Funcionario f2 = new Funcionario("Renato", "Borges", "60625476938", "Auxiliar Geral", 1500);
		Funcionario f3 = new Funcionario("Aline", "Borges", "5795866973", "Gerente Pessoa Física", 3500);
		
		// Iniciando o algoritmo: com base de um (menu) com (switch) dentro de um (do while);
		menuPrincipal();
		valorMenu = teclado.nextInt();
		do {
			switch (valorMenu) {
			case 1:
				r1.info();	r2.info();	r3.info();
				menuRemedio();
				num = teclado.nextInt();
				// Alterando o valor
				if (num == 1) {
					System.out.println("Qual remédio quer alterar o valor?");
					remedio.nomes(r1, r2, r3);
					opcao = teclado.nextInt();
					System.out.println("Qual novo valor?");
					newValor = teclado.nextInt();
					remedio.novoValor(opcao, newValor, r1, r2, r3);
					System.out.println("Valor Alterado!\n");
					break;

				}
				// Alterando o valor do estoque
				if (num == 2) {
					System.out.println("Qual produto quer alterar estoque?");
					remedio.nomes(r1, r2, r3);
					opcao = teclado.nextInt();
					System.out.print("Digite o novo valor do estoque: ");
					valor = teclado.nextInt();
					remedio.novoEstoque(opcao, valor, r1, r2, r3);
					System.out.println("Estoque Att!\n");
					break;

				}
				// Incrementando
				if (num == 3) {
					System.out.println("Adcionar a quantidade de estoque de qual produto?");
					remedio.nomes(r1, r2, r3);
					opcao = teclado.nextInt();
					System.out.print("Acrescentar: ");
					valor = teclado.nextInt();
					remedio.incrementaEstoque(opcao, valor, r1, r2, r3);
					System.out.println("Estoque Att!\n");
					break;

				}
				// Decrementando
				if (num == 4) {
					System.out.println("Remover a quantidade de estoque de qual produto?");
					remedio.nomes(r1, r2, r3);
					opcao = teclado.nextInt();
					System.out.print("Remover: ");
					valor = teclado.nextInt();
					remedio.decrementaEstoque(opcao, valor, r1, r2, r3);
					System.out.println("Estoque Att!\n");
					break;

				}
				break;

			case 2:
				// Mostra as três empresas e mostra o menu
				emp1.info(); emp2.info(); emp3.info();
				menuEmpresa();
				num = teclado.nextInt();
				if (num == 1) {
					System.out.println("Atualizar endereço de qual empresa??");
					empresa.nomesEmpresa(emp1, emp2, emp3);
					opcao = teclado.nextInt();
					System.out.print("Novo Endereço: ");
					// estou tendo dificuldade aqui, eu tento colocar .nextLine porém da um bug na hora. e pula a linha do código... 
					String newEndereco = teclado.next();
					empresa.novoEndereco(newEndereco, opcao, emp1, emp2, emp3);
					System.out.println("Endereço Atualizado!\n");
				}
				if (num > 1) {
					System.out.println("Número inválido, tente novamente");
					break;
				}
				break;
			case 3:
				// Mostra os três funcionários e o menu
				f1.info(); f2.info();f3.info();
				menuFuncionario();
				num = teclado.nextInt();
				
				if (num == 1) {
					System.out.println("Atualizar o salário de qual funcionário?");
					funcionario.listaFuncionario(f1, f2, f3);
					opcao = teclado.nextInt();
					System.out.print("Novo Salario: ");
					double newSalario = teclado.nextDouble();
					if (opcao == 1) {
						f1.novoSalario(newSalario);
					}
					if (opcao == 2) {
						f2.novoSalario(newSalario);
					}
					if (opcao == 3) {
						f3.novoSalario(newSalario);
					}
					System.out.println("Salário Att\n");
					break;
				}
				if (num == 2) {
					System.out.println("Trocar de cargo qual funcionário?");
					funcionario.listaFuncionario(f1, f2, f3);
					opcao = teclado.nextInt();
					System.out.print("Novo Cargo: ");
					String newCargo = teclado.next();
					if (opcao == 1) {
						f1.novoCargo(newCargo);
					}
					if (opcao == 2) {
						f2.novoCargo(newCargo);
					}
					if (opcao == 3) {
						f3.novoCargo(newCargo);
					}
					System.out.println("Cargo Alterado!\n");
					break;
				} 
				if ((num == 0) || (num > 2)) {
					break;
				}
				// Listar Livro
			case 4:
				l1.info();	l2.info();	l3.info();
				menuLivro();
				num = teclado.nextInt();
				if (num == 1) {
					System.out.println("Deseja alterar o valor de qual livro?");
					livro.nomes(l1, l2, l3);
					opcao = teclado.nextInt();
					System.out.println("Digite o novo valor: ");
					newValor = teclado.nextDouble();
					if (opcao == 1) {
					l1.novoValor(newValor);	
					} if (opcao == 2) {		
					l2.novoValor(newValor);	
					} if (opcao == 3) {
					l3.novoValor(newValor);	
					}
					
				} if (num == 2) {
					System.out.println("Deseja alterar o estoque de qual livro?");
					livro.nomes(l1, l2, l3);
					opcao = teclado.nextInt();
					System.out.print("Digite o novo valor de estoque: ");
					newEstoque = teclado.nextInt();
					if (opcao == 1) {
					l1.novoEstoque(newEstoque);	
					} if (opcao == 2) {		
					l2.novoEstoque(newEstoque);	
					} if (opcao == 3) {
					l3.novoEstoque(newEstoque);	
						
					}
				} if (num == 3) {
					System.out.println("Deseja Incrementar estoque de qual livro?");
					livro.nomes(l1, l2, l3);
					opcao = teclado.nextInt();
					System.out.print("Icrementar quantidade de estoque: ");
					newEstoque = teclado.nextInt();
					if (opcao == 1) {
					l1.incrementarEstoque(newEstoque);	
					} if (opcao == 2) {		
					l2.incrementarEstoque(newEstoque);		
					} if (opcao == 3) {
					l3.incrementarEstoque(newEstoque);		
						
					}
				} if (num == 4) {
					System.out.println("Deseja Decrementar estoque de qual livro?");
					livro.nomes(l1, l2, l3);
					opcao = teclado.nextInt();
					System.out.print("Decrementar Estoque: ");
					newEstoque = teclado.nextInt();
					if (opcao == 1) {
					l1.decrementaEstoque(newEstoque);	
					} if (opcao == 2) {		
					l2.decrementaEstoque(newEstoque);	
					} if (opcao == 3) {
					l3.decrementaEstoque(newEstoque);							
					}
				} if (num == 0) {
					break;
				}
			default:
				break;
			}
			System.out.println("\n");
			menuPrincipal();
			valorMenu = teclado.nextInt();

		} while (valorMenu != 0);

		System.out.println("Você saiu do programa");
	}
	public static void menuPrincipal() {
		System.out.println(" [1] Lista de Remédios");
		System.out.println(" [2] Lista de Empresas");
		System.out.println(" [3] Lista de Funcionários");
		System.out.println(" [4] Lista de Livros");
		System.out.println(" [0] Sair do Programa");
		System.out.print("Digite um Valor: ");
	}
	public static void menuRemedio() {
		System.out.println("\n[1] Novo Valor R$");
		System.out.println("[2] Alterar Quantidade de Estoque");
		System.out.println("[3] Incrementar Estoque");
		System.out.println("[4] Decrementar Estoque");
		System.out.println("[0] Menu Principal");
		System.out.print("Digite um Valor: ");
	}
	public static void menuLivro() {
		System.out.println("\n[1] Novo Valor R$");
		System.out.println("[2] Alterar Quantidade de Estoque");
		System.out.println("[3] Incrementar Estoque");
		System.out.println("[4] Decrementar Estoque");
		System.out.println("[0] Menu Principal");
		System.out.print("Digite um Valor: ");
	}
	public static void menuFuncionario() {
		System.out.println("\n[1] Novo Salário R$");
		System.out.println("[2] Novo Cargo");
		System.out.println("[0] Menu Principal");
		System.out.print("Digite um Valor: ");
	}
	public static void menuEmpresa() {
		System.out.println("\n[1] Alterar Endereço");
		System.out.println("[0] Menu Principal");
		System.out.print("Digite um Valor: ");
	}

}
