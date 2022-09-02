package SimuladorProvaProg2;

public class main {

	public static void main(String[] args) {

		funcionario f1 = new funcionario("Rodrigo Borges", "Assistente de Pista", 2500);
		piloto p1 = new piloto("SAmuel L. Jackson", "LP5528", 5700);
		aviao a1 = new aviao("TF-2014", "QATAR AIRWAYS", "Boeing 747-400");
		voo v1 = new voo("LA303", "Hawaii", "Los Angeles", p1, a1);
		f1.info();
		a1.info();
		p1.info();
		v1.info(); 

		f1.novoSalario();
		f1.novoSalario(3000);
		p1.modHoras(1000);
	}

}
