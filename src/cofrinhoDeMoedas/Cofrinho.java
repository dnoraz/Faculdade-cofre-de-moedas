package cofrinhoDeMoedas;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho { //EDUARDO DELLA NORA SZPAK RU 4061681
	
	private List<Moeda> listaMoedas = new ArrayList<>();
	
	public void adicionar(Moeda moeda) { // Método que adiciona moedas à lista
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) { // Método que remove moedas da lista
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() { // Método que mostra todas as moedas dentro da lista
		for(Moeda moeda: listaMoedas) {
			System.out.println(moeda);
		}
	}
	
	public void  totalConvertido() { // Método que converte todas as moedas dentro da lista para Reais R$
		double total = 0;
		for(Moeda moeda: listaMoedas) {
			total += moeda.converter();
		}
		System.out.printf("O total em REAIS é: %.2f ", total);
		
	}

}
