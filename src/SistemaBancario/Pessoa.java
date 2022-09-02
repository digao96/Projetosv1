package SistemaBancario;

import java.util.ArrayList;

public class Pessoa {
	
	String Nome;
    String Sobrenome;
	int Idade;
	private String cpf;
	private ArrayList<ContaBancaria> ContasBancaria = new ArrayList<>();
	
	public Pessoa () {
		
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public Pessoa(String nome, String sobrenome, int idade, String cpf) {
		this.Nome = nome;
		this.Sobrenome = sobrenome;
		this.Idade = idade;
		this.cpf = cpf;
	}

	public void info(StringBuffer Buffer) {
		Buffer.append("\nNome Completo: "+this.Nome+" "+this.Sobrenome);
		Buffer.append("\nIdade: "+this.Idade);
		Buffer.append("\nCPF: "+this.cpf);
	}
	
	public void infoContas() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<ContaBancaria> getContasBancarias() {
		return ContasBancaria;
	}

	public void setContasBancaria(ArrayList<ContaBancaria> contasBancaria) {
		ContasBancaria = contasBancaria;
	}
	
}
