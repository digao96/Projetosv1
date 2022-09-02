package petshopv1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ArrayList<tutor> tutorList = new ArrayList<>();
		ArrayList<pet> petList = new ArrayList<>();
		boolean controle = true;
		int opcao = 0;

		do {
			pet novoPet = new pet(null, null, null, 0);
			tutor novoTutor = new tutor(null, 0, null, 0, null);

			menuPrincipal();
			opcao = teclado.nextInt();

			switch (opcao) {

			case 0:
				System.out.println("Saiu do Programa");
				controle = false;
				break;

			case 1:
				addTutor(teclado, novoTutor);
				tutorList.add(novoTutor);
				System.out.println("Tutor Cadastrado");
				break;

			case 2:
				addPet(teclado, novoPet);
				petList.add(novoPet);
				System.out.println("Pet Cadastrado");
				break;

			case 3:
				System.out.println("Número de Tutores : " + tutorList.size());
				for (tutor lista : tutorList) {
					lista.info_tutor();
				}
				break;

			case 4:
				System.out.println("Número de Pets : " + petList.size());
				for (pet lista : petList) {
					lista.info_pet();
				}
				break;

			default:
				System.out.println("Número não encontrado!");
				break;
			}

		} while (controle == true);

	}

	static void menuPrincipal() {
		System.out.println("\n[#] Menu Principal");
		System.out.println("[1] Cadastrar Tutor");
		System.out.println("[2] Cadastrar Pet");
		System.out.println("[3] Tutores Cadastrados");
		System.out.println("[4] Pets Cadastrados");
		System.out.println("[0] Sair do Programa");
	}

	static void addTutor(Scanner teclado, pessoa cadastraTutor) {
		System.out.print("Nome : ");
		teclado.nextLine();
		cadastraTutor.nome_completo = teclado.nextLine();
		System.out.print("CPF : ");
		cadastraTutor.cpf = teclado.nextLong();
		System.out.print("Endereço : ");
		teclado.nextLine();
		cadastraTutor.endereco = teclado.nextLine();
		System.out.print("Telefone : ");
		cadastraTutor.telefone = teclado.nextLong();
		System.out.print("Email : ");
		teclado.nextLine();
		cadastraTutor.email = teclado.nextLine();
	}

	static void addPet(Scanner teclado, pet cadastraPet) {
		System.out.print("Especie : ");
		cadastraPet.especie = teclado.next();
		System.out.print("Raça : ");
		cadastraPet.raca = teclado.next();
		System.out.print("Nome : ");
		cadastraPet.nome = teclado.next();
		System.out.print("Idade : ");
		cadastraPet.idade = teclado.nextInt();
	}
}
