package Objetos;


public class Empresa {

	String Nome, CNPJ, Endereco, Servico;
	int i = 1;

	public Empresa() {

	}

	public Empresa(String nome, String cnpj, String endereco, String servico) {
		Nome = nome;
		this.CNPJ = cnpj;
		Endereco = endereco;
		Servico = servico;
	}

	public void info() {
		System.out.printf("\nNome: %s\nCNPJ: %s\nEndereço: %s\nServiço: %s\n", this.Nome, this.CNPJ, this.Endereco,
				this.Servico);
	}

	public void nomesEmpresa(Empresa emp1, Empresa emp2, Empresa emp3) {
		i = 1;
		System.out.printf("[%d] %s\n", i, emp1.Nome);
		i++;
		System.out.printf("[%d] %s\n", i, emp2.Nome);
		i++;
		System.out.printf("[%d] %s\n", i, emp3.Nome);
		i++;
	}

	public void novoEndereco(String novoEndereco, int opcao, Empresa emp1, Empresa emp2, Empresa emp3) {
		if (opcao == 1) {
			emp1.Endereco = novoEndereco;
		}
		if (opcao == 2) {
			emp2.Endereco = novoEndereco;
		}
		if (opcao == 3) {
			emp3.Endereco = novoEndereco;
		}

	}
}
