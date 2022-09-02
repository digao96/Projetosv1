package Objetos;

public class Funcionario {

	String Nome, Sobrenome, CPF, Cargo;
	double Salario;

	public Funcionario() {

	}

	public Funcionario(String nome, String sobrenome, String cPF, String cargo, double salario) {
		Nome = nome;
		Sobrenome = sobrenome;
		CPF = cPF;
		Cargo = cargo;
		Salario = salario;
	}

	public void info() {
		System.out.printf("\nNome: %s\nSobrenome: %s\nCPF: %s\nCargo: %s\nSalario: %.2f\n", this.Nome, this.Sobrenome,
				this.CPF, this.Cargo, this.Salario);
	}

	public void novoSalario(double novoSalario) {
		this.Salario = novoSalario;
	}

	public void novoCargo(String newCargo) {
		this.Cargo = newCargo;
	}

	public void listaFuncionario(Funcionario f1, Funcionario f2, Funcionario f3) {
		int i = 1;
		System.out.printf("[%d] %s\n", i, f1.Nome);
		i++;
	
		System.out.printf("[%d] %s\n", i, f2.Nome);
		i++;
		System.out.printf("[%d] %s\n", i, f3.Nome);
		i++;
	}

}
