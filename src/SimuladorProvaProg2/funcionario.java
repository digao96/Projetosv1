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
		System.out.printf("\n=== Informa��es do Funcion�rio\nNome: %s\nCargo: %s\nSal�rio: %.2f\n", this.nome,
				this.cargo, this.salario);
	}

	public void novoSalario() {
		int newSalario = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo sal�rio do funcion�rio?"));
		this.salario = newSalario;
		System.out.println("\n=== Op.novo sal�rio ");
		System.out.println("Funcion�rio: " + this.nome);
		System.out.println("Sal�rio Atualizado: " + this.salario);
	} 

	public void novoSalario(int novoSalario) {
		this.salario = novoSalario;
		System.out.println("\n=== Op.novo sal�rio ");
		System.out.println("Funcion�rio: " + this.nome);
		System.out.println("Sal�rio Atualizado: " + this.salario);
	}

}