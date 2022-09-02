package SistemaBancario;

import javax.swing.JOptionPane;

abstract class ContaBancaria {

	protected Pessoa Titular;
	protected Banco Banco;
	protected int NroConta;
	protected double Saldo;
	protected String Senha;

	public ContaBancaria(Pessoa titular, Banco banco, int nroConta, double saldo, String senha) {
		Titular = titular;
		Banco = banco;
		NroConta = nroConta; 
		Saldo = saldo;
		Senha = senha;
	}	
	

	public Pessoa getTitular() {
		return Titular;
	}

	public void setTitular(Pessoa Titular) {
		this.Titular = Titular;
	}

	public Banco getBanco() {
		return Banco;
	}

	public void setBanco(Banco banco) {
		this.Banco = banco;
	}

	public int getNroConta() {
		return NroConta;
	}

	public void setNroConta(int nroConta) {
		NroConta = nroConta;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public void saque() {
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Deseja Sacar quanto?"));
		if (valor > this.Saldo) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
		} else {
			this.Saldo = Saldo-valor;
			JOptionPane.showMessageDialog(null, "Saque Relizado com Sucesso");
		}
	}

	public void saque(double valor) {
			if (valor > this.Saldo) {
				JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
			} else {
				this.Saldo = Saldo-valor;
				JOptionPane.showMessageDialog(null, "Saque Relizado com Sucesso");
			}
	 
	}

	public void deposito() {
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Deseja depositar quanto?"));
		this.Saldo = Saldo+valor;
		JOptionPane.showMessageDialog(null, "Depositado com Sucesso!\n Saldo Atual: "+this.Saldo);
	}

	public void deposito(double valor) {
		this.Saldo = Saldo+valor;
		JOptionPane.showMessageDialog(null, "Depositado com Sucesso!\n Saldo Atual: "+this.Saldo);
	}

	public boolean verificaSenha() {
		this.Senha = JOptionPane.showInputDialog("Digite sua Senha");
		return true;
	}

	public boolean verificaSenha(String senha) {
		if (senha.equals(this.Senha)) {
			return true;
		} else {
			return false;
		}
		
	}

}