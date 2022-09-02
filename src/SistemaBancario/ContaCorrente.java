package SistemaBancario;

public class ContaCorrente extends ContaBancaria {
	
	public ContaCorrente(Pessoa titular, Banco banco, int nroConta, double saldo,
			String senha) {
		super(titular, banco, nroConta, saldo, senha);
	}

	private double TaxasMensais = 25.5;
	
	public void info(StringBuffer buffer) {
		buffer.append("\nBanco: "+this.Banco.getNome());
		buffer.append("\nNúmero da Conta: "+this.NroConta);
		buffer.append("\nNome: "+this.Titular.Nome+" "+this.Titular.Sobrenome);
		buffer.append("\nSaldo: "+this.Saldo+" R$");
		buffer.append("\nTaxas: "+this.TaxasMensais+" R$ ao Mês");
		buffer.append("\n\n");
	}
	
	public void novoMes() {
		this.Saldo = Saldo-TaxasMensais;
	}

	public double getTaxasMensais() {
		return this.Saldo-TaxasMensais;
	}

	public void setTaxasMensais(double taxasMensais) {
		TaxasMensais = Saldo-taxasMensais;
	}
	

}
