package cofrinhoDeMoedas;

public abstract class Moeda { //EDUARDO DELLA NORA SZPAK RU 4061681
	double valor;

	public Moeda(double valor) { // Construtor da classe mãe 
		this.valor = valor;
	}
	
	public abstract double converter(); // Dois métodos abstratos que se~rao utilizados pelas classes mais específicas
	public abstract String info();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
