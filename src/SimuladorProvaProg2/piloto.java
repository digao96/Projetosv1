package SimuladorProvaProg2;

import javax.swing.JOptionPane;

public class piloto extends funcionario {

	String brevet;
	int horasVoo = 5700;

	public piloto(String nome, String brevet, double salario) {
		super(nome, "Piloto", salario);
		this.brevet = brevet;
		this.salario = 3500 + (horasVoo / 2);

	}

	public void info() {
		System.out.printf("\n=== Informações do Piloto\nNome: %s\nBrevet: %s\nHoras Voo: %d\nSalário %.2f\n", this.nome,
				this.brevet, this.horasVoo, this.salario);

	}

	public void modHoras(int attHorasVoo) {
		this.horasVoo = horasVoo + attHorasVoo;
		int attSalario = 3500 + (this.horasVoo / 2);
		this.salario = attSalario;
		System.out.println("\n=== Op.Modifica horas voo");
		System.out.println("Piloto: " + this.nome);
		System.out.println("Horas voo atual: " + this.horasVoo);
		System.out.println("Salário Atualizado: " + attSalario);
	}

}