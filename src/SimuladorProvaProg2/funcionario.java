package SimuladorProvaProg2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class funcionario {
	Scanner sc = new Scanner(System.in);

	String nome;
	String cargo;
	double salario;

	public funcionario() {
	}

	public funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario; 
	}

	public void info() {
		System.out.printf("\n=== Informações do Funcionário\nNome: %s\nCargo: %s\nSalário: %.2f\n", this.nome,
				this.cargo, this.salario);
	}

	public void novoSalario() {
		int newSalario = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo salário do funcionário?"));
		this.salario = newSalario;
		System.out.println("\n=== Op.novo salário ");
		System.out.println("Funcionário: " + this.nome);
		System.out.println("Salário Atualizado: " + this.salario);
	} 

	public void novoSalario(int novoSalario) {
		this.salario = novoSalario;
		System.out.println("\n=== Op.novo salário ");
		System.out.println("Funcionário: " + this.nome);
		System.out.println("Salário Atualizado: " + this.salario);
	}

}