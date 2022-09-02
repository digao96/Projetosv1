package petshopv1;

import java.util.ArrayList;

public class pet {

	String especie;
	String raca;
	String nome;
	int idade;
	ArrayList<tutor> tutores = new ArrayList();
	
	
	public pet(String especie, String raca, String nome, int idade) {
		this.especie = especie;
		this.raca = raca;
		this.nome = nome;
		this.idade = idade;
	}

	public void info_pet() {
		System.out.println("\nEspecie - "+this.especie+"\nRaça - "+this.raca+"\nNome - "+this.nome+"\nIdade - "+this.idade);
		
	}
	
	public void info_tutores() {
		
	}

}
