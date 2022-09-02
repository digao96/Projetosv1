package Heranca;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean contador = true;
		ArrayList<Veiculo> Veiculos = new ArrayList<>();
		int opcao = 0;
		Veiculo V = new Veiculo(null, null, null, 0, 0, 0, 0);
		
		// Falta Adcionar os métodos emplacamento ( veiculos terrestre ) deslocamento, compra etc..... add ao menu 

		String menu = "---------------------------\n|   Menu Principal   |\n---------------------------\n"
				+ "[1]  Cadastrar Carro\n" + "[2]  Cadastrar Caminhão\n" + "[3]  Cadastrar Moto\n"
				+ "[4]  Cadastrar Avião\n" + "[5]  Cadastrar Helicoptero\n" + "[6]  Cadastrar Navio\n"
				+ "[7]  Cadastrar Submarino\n" + "[8]  Veiculos Cadastrados\n" + "[0]  Sair do Programa\n";

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {

			case 1:
				cadastraVeiculo(V, teclado);
				Carro carro = new Carro(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY, V.valor, V.passageiros,
						null, null, null, null, null);
				carro.cadastraCarro();
				Veiculos.add(carro);
				JOptionPane.showMessageDialog(null, "Carro Adcionado!");
				break;

			case 2:
				cadastraVeiculo(V, teclado);
				Caminhao caminhao = new Caminhao(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY, V.valor,
						V.passageiros, null, null, null, null);
				caminhao.cadastraCaminhao();
				Veiculos.add(caminhao);
				JOptionPane.showMessageDialog(null, "Caminhão Adcionado!");
				break;

			case 3:
				cadastraVeiculo(V, teclado);
				Moto moto = new Moto(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY, V.valor, V.passageiros,
						null, null, null);
				moto.cadastraMoto();
				Veiculos.add(moto);
				JOptionPane.showMessageDialog(null, "Moto Adcionado!");
				break;

			case 4:
				cadastraVeiculo(V, teclado);
				Aviao aviao = new Aviao(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY, V.valor, V.passageiros,
						0, 0, null, 0);
				aviao.cadastraAviao();
				Veiculos.add(aviao);
				JOptionPane.showMessageDialog(null, "Avião Adcionado!");
				break;

			case 5:
				cadastraVeiculo(V, teclado);
				Helicoptero helicoptero = new Helicoptero(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY,
						V.valor, V.passageiros, 0, 0, null, null);
				helicoptero.cadastraHelicoptero();
				Veiculos.add(helicoptero);
				JOptionPane.showMessageDialog(null, "Helicoptero Adcionado!");
				break;

			case 6:
				cadastraVeiculo(V, teclado);
				Navio navio = new Navio(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY,
						V.valor, V.passageiros, 0, null, null);
				navio.cadastraNavio();
				Veiculos.add(navio);
				JOptionPane.showMessageDialog(null, "Navio Adcionado!");
				break;

			case 7:
				cadastraVeiculo(V, teclado);
				Submarino submarino = new Submarino(V.fabricante, V.modelo, V.pais, V.posicaoX, V.posicaoY,
						V.valor, V.passageiros, 0, null, 0, 0);
				submarino.cadastraSubmarino();
				Veiculos.add(submarino);
				JOptionPane.showMessageDialog(null, "Submarino Adcionado!");
				break;

			case 8:
				if (Veiculos.isEmpty() == true) {
					System.out.println("Nenhum Veículo Cadastrado");
				} else {
					System.out.println("Veiculos Cadastrados: " +Veiculos.size());
					System.out.println("");
				}
				int i = 0;
				for (Veiculo lista : Veiculos) {
					lista.infoVeiculo();
					verificaObjeto(Veiculos, i);
					i++;
				}
				break;

			case 0:
				System.out.println("Saiu do Programa!");
				contador = false;
				break;

			default:
				System.out.println("Número não encontrado!\n");
				break;
			}

		} while (contador == true);

	}
	
	static void verificaObjeto(ArrayList<Veiculo> Veiculos, int i) {
		if (Veiculos.get(i) instanceof Carro) {
			Carro carro1 = (Carro) Veiculos.get(i);
			System.out.println("Veículo "+i+" é um carro");
			carro1.infoCarro();
		}

		if (Veiculos.get(i) instanceof Caminhao) {
			Caminhao caminhao1 = (Caminhao) Veiculos.get(i);
			System.out.println("Veículo "+i+" é um caminhão");
			caminhao1.infoCaminhao();
		}

		if (Veiculos.get(i) instanceof Moto) {
			Moto moto1 = (Moto) Veiculos.get(i);
			moto1.infoMoto();
		}

		if (Veiculos.get(i) instanceof Aviao) {
			Aviao aviao1 = (Aviao) Veiculos.get(i);
			aviao1.infoAviao();
		}

		if (Veiculos.get(i) instanceof Helicoptero) {
			Helicoptero helicoptero1 = (Helicoptero) Veiculos.get(i);
			helicoptero1.infoHelicoptero();
		}

		if (Veiculos.get(i) instanceof Navio) {
			Navio navio1 = (Navio) Veiculos.get(i);
			navio1.infoNavio();
		}

		if (Veiculos.get(i) instanceof Submarino) {
			Submarino submarino1 = (Submarino) Veiculos.get(i);
			submarino1.infoSubmarino();
		}
	}

	static void cadastraVeiculo(Veiculo V, Scanner teclado) {
		System.out.print("Fabricante: ");
		V.fabricante = teclado.next();
		System.out.print("Modelo: ");
		V.modelo = teclado.next();
		System.out.print("Pais: ");
		V.pais = teclado.next();
		System.out.print("Posição X: ");
		V.posicaoX = teclado.nextInt();
		System.out.print("Posição Y: ");
		V.posicaoY = teclado.nextInt();
		System.out.print("Valor: ");
		V.valor = teclado.nextInt();
		System.out.print("Passageiros: ");
		V.passageiros = teclado.nextInt();
		System.out.println("");
	}

}