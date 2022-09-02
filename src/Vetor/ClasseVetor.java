package Vetor;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ClasseVetor {

	Scanner teclado = new Scanner(System.in);
	int valor = 0, tamanhovetor, meio = 0, vazio = 0, add = 0, contador = 0, addMais = 1;
	int[] vetor;

	public ClasseVetor(int valor, int tamanhovetor, int add) {
		this.valor = valor;
		this.tamanhovetor = tamanhovetor;
		this.add = add;
	}

	public ClasseVetor(int meio, int vazio) {
		this.meio = meio;
		this.vazio = vazio;

	}
	
	public ClasseVetor () {
		
		
	}

	public void povoaVetor() {
		Random aleatorio = new Random();
		for (int i = 0; i < tamanhovetor; i++) {
			vetor[i] = aleatorio.nextInt(1000);
		}
	}
	
	public void criarVetor() {
		tamanhovetor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o Tamanho do Vetor?"));
		vetor = new int [tamanhovetor];
		for (int i = 0; i < tamanhovetor; i++) {
			vetor[i] = 0;
		}
	}

	public void povoaVetorSquencial() {
		Random aleatorio = new Random();
		for (int i = 0; i < tamanhovetor; i++) {
			vetor[i] = aleatorio.nextInt(1000);
		}
		Arrays.sort(vetor);
	}

	public void atibuiValor(int add) {
		do {
			for (int i = 0; i < tamanhovetor; i++) {
				if (vetor[i] == 0) {
					vetor[i] = add;
					break;
				} else {
					contador++;
				}
			}
			if (contador == vetor.length) {
				JOptionPane.showMessageDialog(null, "Vetor está Cheio!", "Erro!", JOptionPane.ERROR_MESSAGE);
				break;
			}
			addMais = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Valor Armazenado, Deseja adcionar mais um valor?\n(1 = Sim) ( 2 = Não )\n", "Estrutura de Dados",
					JOptionPane.DEFAULT_OPTION));
			if (addMais == 1) {
				contador = 0;
				add = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja adcionar?"));
			} else if ((addMais > 2) || (addMais < 1)) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", "Erro!", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (!(addMais == 2));
	}

	public void retornaValor() {
		// informa o valor existente em determinado elemento do vetor
	}

	public void informaTamanho() {
		JOptionPane.showMessageDialog(null, "O tamanho do Vetor que você escolheu é : "+tamanhovetor);
	}

	public void informaQuantosOcupados(int contador) {
		for (int i = 0; i < tamanhovetor; i++) {
			if (!(vetor[i] == 0)) {
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, "\n | " + contador + " | índices ocupadas no vetor!\n");
	}

	public void adicionaValor(int posicao, int add) {
		do {
		  if (!(vetor[posicao] == 0)) {
				 JOptionPane.showMessageDialog(null, "A Posição que você escolheu já está ocupada!");
				 addMais = 2;
				 break;
			} else  {
				vetor[posicao] = add;
			}
			addMais = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Valor Armazenado, Deseja adcionar mais um valor?\n(1 = Sim) ( 2 = Não )\n", "Estrutura de Dados",
					JOptionPane.DEFAULT_OPTION));
			if (addMais == 1) {
				contador = 0;
				add = Integer.parseInt(JOptionPane.showInputDialog("Qual valor deseja adcionar?"));
			} else if ((addMais > 2) || (addMais < 1)) {
				JOptionPane.showMessageDialog(null, "Valor Inválido", "Erro!", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (!(addMais == 2));
	}

	public void removeValorPosicao() {
		int delMais = 0;
		int i = 0;
		do {
			i = Integer.parseInt(JOptionPane.showInputDialog("Deseja deletar o valor de qual posição?"));
			if (!(vetor[i] == 0)) {
				vetor[i] = 0;
			} else {

			}
			delMais = Integer.parseInt(
					JOptionPane.showInputDialog("Valor Deletado\nDeseja deletar outro valor?\n(1 Sim) (2 Não)"));
		} while (!(delMais == 2));
	}

	public void removeValor() {
		int delMais = 0;
		int valor = 0;
		contador = 0;
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Deseja deletar qual valor?"));
			for (int i = 0; i < tamanhovetor; i++) {
				if (vetor[i] == valor) {
					vetor[i] = 0;
					break;
				} else {
					contador++;
					continue;
				}
			}	
			if (contador == tamanhovetor) {
				JOptionPane.showMessageDialog(null, "Número não encontrado!");
				delMais = 2;
				break;
			}
			delMais = Integer.parseInt(
					JOptionPane.showInputDialog("Valor Deletado\nDeseja deletar outro valor?\n(1 Sim) (2 Não)"));
		} while (!(delMais == 2));
	}

	public void buscaSequencial(int valor) {
		int contador = 0;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja consultar: "));
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				JOptionPane.showMessageDialog(null, "O Numero " + valor + " está no índice " + i);
				contador = 0;
				break;
			} else {
				contador++;
			}
			if (contador == vetor.length - 1) {
				JOptionPane.showMessageDialog(null, "Número não encontrado", "Tente Novamente!",
						JOptionPane.YES_OPTION);
				i = 0;
			}
		}
	}

	public int buscaBinariaX(int valor) {
		Arrays.sort(vetor);
		return buscaBinaria(valor, 0, tamanhovetor - 1);
	}

	public int buscaBinaria(int valor, int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		if (inicio > fim) {
			return this.vazio = 5;
		}
		if (vetor[meio] == valor) {
			return this.meio = meio;
		}
		if (vetor[meio] < valor) {
			return buscaBinaria(valor, meio + 1, fim);
		} else {
			return buscaBinaria(valor, inicio, meio - 1);
		}
	}

	public void maiorValor(int umAmais, int maior, int indice) {
		maior = 0;
		indice = 0;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (!(vetor[i] == maior)) {
				indice = indice + 1;
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "O Maior vetor é " + maior + " está no índice " + indice);
	}

	public void menorValor(int umAmais, int menor, int indice) {
		menor = 100000;
		indice = 0;
		for (int i = 0; i < vetor.length; i++) {
			if ((vetor[i] < menor) && (!(vetor[i] == 0))) {
				menor = vetor[i];
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (!(vetor[i] == menor)) {
				indice = indice + 1;
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "O Menor vetor é " + menor + " está no índice " + indice);
	}

	public void listarVetor() {
		int x = 0;
		StringBuffer listarVetores = new StringBuffer(vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			listarVetores.append("[" + x + "] -> " + vetor[i]).append("\n");
			x++;
		}
		JOptionPane.showMessageDialog(null, listarVetores, "Lista de Vetores", JOptionPane.INFORMATION_MESSAGE);
	}

	public void ordenaBubble() {
		int auxiliar;
		boolean verdadeFalso;
		
		for (int i = 0; i < tamanhovetor; i++) {
			verdadeFalso = true;
			
			for (int j = 0; j < (tamanhovetor - 1); j++) {
				if (vetor[j] > vetor[j+1]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = auxiliar;
					verdadeFalso = false;
				}
			}
			if (verdadeFalso) {
				break;
			}
		}		
		listarVetor();
		}

	public void ordenaInsert() {
		int auxiliar, j;
		for (int i = 1; i < tamanhovetor; i++) {
			auxiliar = vetor[i];
			j = i-1;
			while ((j >= 0) && (vetor[j] > auxiliar)) {
				vetor[j+1] = vetor[j];
				j = j -1;
			}
			vetor[j + 1] = auxiliar;
		}
		listarVetor();
	}

	public void ordenaSelect() {
		int menor, auxiliar;
		for (int i = 0; i < tamanhovetor; i++) { 
			menor = i;
			
			for (int j = i+1; j < tamanhovetor; j++) {
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}
			}
			auxiliar = vetor[menor];
			vetor[menor] = vetor[i];
			vetor[i] = auxiliar;
		}
		
		listarVetor();
	}
}