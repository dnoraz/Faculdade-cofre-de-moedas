package cofrinhoDeMoedas;

public class Real extends Moeda { //EDUARDO DELLA NORA SZPAK RU 4061681

	public Real(double valor) {
		super(valor);
	}

	@Override
	public double converter() { 
		double total = valor;
		return total;
	}

	@Override
	public String info() {
		return "BRL";
	}

	@Override
	public String toString() {
		return "Real - " + valor + " " + info();
	}


	
}