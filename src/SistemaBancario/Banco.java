package SistemaBancario;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {

	private String Nome;
	private String CNPJ;
	private int NroBanco;
	private ArrayList<ContaBancaria> ContasBancaria = new ArrayList<>();
	
	public ArrayList<ContaBancaria> getContasBancaria() {
		return ContasBancaria;
	}

	public void setContasBancarias(ArrayList<ContaBancaria> contasBancaria) {
		ContasBancaria = contasBancaria;
	}

	public Banco() {
		
	}
	
	public Banco(String nome, String cNPJ, int nroBanco) {
		Nome = nome;
		CNPJ = cNPJ;
		NroBanco = nroBanco;
	}

	public void infoBanco(StringBuffer Buffer) {
		Buffer.append("Banco/Número "+this.Nome+" / "+this.NroBanco);
	}
	
	public void cadastrarBanco(Banco cadastraBanco) {
		cadastraBanco.setNome(JOptionPane.showInputDialog("Nome do Banco: "));
		cadastraBanco.setCNPJ(JOptionPane.showInputDialog("CNPJ do Banco " + cadastraBanco.getNome()));
		cadastraBanco.setNroBanco(
		Integer.parseInt(JOptionPane.showInputDialog("Número do Banco " + cadastraBanco.getNome())));
	}

	public void infoContas() {

	}

	public void criarConta() {

	}	
		
	public void fecharConta() {

	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public int getNroBanco() {
		return NroBanco;
	}

	public void setNroBanco(int nroBanco) {
		NroBanco = nroBanco;
	}
}
