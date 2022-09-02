package petshopv1;

import java.util.ArrayList;

public class tutor extends pessoa {

	ArrayList<pet> pets = new ArrayList();
	
	public tutor(String nome_completo, long cpf, String endereco, long telefone, String email) {
		super(nome_completo, cpf, endereco, telefone, email);
	}
	
	public void info_tutor() {
		System.out.println("\nNome - " + this.nome_completo + "\nCPF - " + this.cpf + "\nEndereço - " + this.endereco
				+ "\nTelefone - " + this.telefone + "\nEmail - " + this.email);
	}

	public void info_pet() {
		for (int i = 0; i < pets.size(); i++) {
			System.out.println(pets.get(i));
		}
	}

}
