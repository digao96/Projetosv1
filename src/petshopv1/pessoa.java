package petshopv1;
import java.util.ArrayList;

public class pessoa {
	
	String nome_completo;
	long cpf;
	String endereco;
	long telefone;
	String email;
	
	public pessoa(String nome_completo, long cpf, String endereco, long telefone, String email) {
		this.nome_completo = nome_completo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	
	public void info_pessoa() {
		System.out.println("\nNome - " + this.nome_completo + "\nCPF - " + this.cpf + "\nEndereço - " + this.endereco
				+ "\nTelefone - " + this.telefone + "\nEmail - " + this.email);
	}
	
	public void contato() {
		
	}
	
}
