package cofrinhoDeMoedas;

public class Dolar extends Moeda { //EDUARDO DELLA NORA SZPAK RU 4061681
 
	public Dolar(double valor) {
		super(valor);
	}
	
	@Override
	public double converter() { //Método usado para converter de real para dolar
		double total = valor * 5.30;
		return total;
	}
	
	@Override
	public String info() {
		return "USD";
	}

	@Override
	public String toString() {
		return "Dolar - " + valor + " " + info();
	}

	
}
