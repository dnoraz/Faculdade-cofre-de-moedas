package cofrinhoDeMoedas;

public class Euro extends Moeda { //EDUARDO DELLA NORA SZPAK RU 4061681

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // Método usado para converter de euro para real
		double total = valor * 5.49;
		return total;
	}

	@Override
	public String info() {
		return "EUR";
	}

	@Override
	public String toString() {
		return "Euro - " + valor + " " + info();
	}

	
}