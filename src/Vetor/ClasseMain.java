package Vetor;

import javax.swing.JOptionPane;

public class ClasseMain {

	public static void main(String[] args) { 
		// ClasseVetor vetorX = new ClasseVetor(0, 20, 0);
		ClasseVetor vetorX = new ClasseVetor();
		int add = 0, contador = 0, menor = 0, maior = 0, umAmais = 1, indice = 0, valor = 0, posicao = 0;

		String menu = "[1] Povoar Vetor\n" + "[2] Povoar Vetor (ordem crescente)\n"
				+ "[3] Total de Posições Ocupadas\n" + "[4] Maior e Menor Valor do Vetor\n"
				+ "[5] Listar todo o Vetor\n" + "[6] Inserir um Valor (selecionar valor)\n"
				+ "[7] Inserir um Valor (em uma posição)\n" + "[8] Apagar um Valor (em uma posição)\n"
				+ "[9] Apagar um Valor (selecionar valor)\n" + "[10] Consultar Valor (sequencial)\n"
				+ "[11] Consultar Valor (recursiva)\n" + "[12] Ordenar vetor (BubbleSort)\n"
				+ "[13] Ordenar vetor (InsertSort)\n" + "[14] Ordenar vetor (SelectionSort)\n" + "[0] Sair do Programa";

		vetorX.criarVetor();
		
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (valor) {
			
			case 1 :
			vetorX.povoaVetor();	
			JOptionPane.showMessageDialog(null, "Vetor Povoado com Sucesso!", "Estrutura de Dados",
					JOptionPane.INFORMATION_MESSAGE);
			break;
			case 2 :
			vetorX.povoaVetorSquencial();
			JOptionPane.showMessageDialog(null, "Vetor Povoado & Ordenado com Sucesso!", "Estrutura de Dados",
					JOptionPane.INFORMATION_MESSAGE);
			
			break;
			case 3 :	
			vetorX.informaQuantosOcupados(contador);
				
			break;
			case 4 :
			vetorX.menorValor(umAmais, menor, indice);
			vetorX.maiorValor(umAmais, maior, indice);
			
			break;
			case 5 : 
			vetorX.listarVetor();
			
			break;
			case 6 :
			add = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Valor deseja adcionar?"));
			vetorX.atibuiValor(add);
			
			break;
			case 7 : 
			posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual posição deseja adcionar o valor?"));
			add = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual Valor deseja adcionar?"));
			vetorX.adicionaValor(posicao, add);
			
			break;
			case 8 :
			vetorX.removeValorPosicao();
			
			break;
			case 9 :
			vetorX.removeValor();
			
			break;
			case 10 :
			vetorX.buscaSequencial(valor);
			
			break;
			case 11 : 
			int consultar = 0;
			consultar = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja consultar: "));
			vetorX.buscaBinariaX(consultar);
			if (vetorX.vazio == 5) {
				naoEncontrei();
			} else {
				JOptionPane.showMessageDialog(null, "O Valor " + consultar + " está no índice " + vetorX.meio);
			}
			
			break;
			case 12 :
			JOptionPane.showMessageDialog(null, "Ordenando vetor com a lógica Bubble Sort...");	
			vetorX.ordenaBubble();
			
			break;
			case 13 :
			JOptionPane.showMessageDialog(null, "Ordenando vetor com a lógica Insertion Sort");	
			vetorX.ordenaInsert();
			
			break;
			case 14 : 
			JOptionPane.showMessageDialog(null, "Ordenando vetor com a lógica Select Sort");		
			vetorX.ordenaSelect();
			
			case 0 :
			break;
			
			default :
			naoEncontrei();
			break;
			}
			
		} while (!(valor == 0));
		JOptionPane.showMessageDialog(null, "Programa Finalizado!\nIFRS Campus Restinga\n  2019011764",
				"by Rodrigo Borges Rodrigues", JOptionPane.CANCEL_OPTION);
	}

	static void naoEncontrei() {
		JOptionPane.showMessageDialog(null, "Número não encontrado", "Tente Novamente!", JOptionPane.YES_OPTION);
	}

}