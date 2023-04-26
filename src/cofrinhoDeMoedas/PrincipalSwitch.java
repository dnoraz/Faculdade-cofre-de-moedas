package cofrinhoDeMoedas;

import java.util.Scanner;

public class PrincipalSwitch {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int escolha;
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("O que deseja fazer? \n"
				 + "1 - Adicionar\n"
				 + "2 - Remover\n"
		         + "3 - Listar\n"
		         + "4 - Total convertido para R$\n"
		         + "5 - Sair!");
		escolha = entrada.nextInt();
		Moeda moeda;
		double valor;
		
		while(escolha != 0) {
			
			switch(escolha) {
			
			case 1:
				int tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Digite qual tipo de moeda deseja ADICIONAR:\n"
							+ "1 - Real\n"
							+ "2 - Dolar\n"
							+ "3 - Euro\n");
					tipoMoeda = entrada.nextInt();
				}
				
				System.out.println("VAlor");
				valor = entrada.nextDouble();
				
				
			    moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
					
				}if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
					
				}if(tipoMoeda == 3){
					moeda = new Euro(valor);
				}
				
				cofrinho.adicionar(moeda);
				
				break;
				
			case 2:
				tipoMoeda = 0;
				while(tipoMoeda > 3 || tipoMoeda <= 0) {
					System.out.println("Digite qual tipo de moeda deseja REMOVER:\n"
							+ "1 - Real\n"
							+ "2 - Dolar\n"
							+ "3 - Euro\n");
					tipoMoeda = entrada.nextInt();
				}
				
				System.out.println("Valor");
				valor = entrada.nextDouble();
				
				
				moeda = null;
				if(tipoMoeda == 1) {
					moeda = new Real(valor);
					
				}if(tipoMoeda == 2) {
					moeda = new Dolar(valor);
					
				}if(tipoMoeda == 3){
					moeda = new Euro(valor);
				}
				
				cofrinho.remover(moeda);
				
				break;
				
			case 3:
				 cofrinho.listagemMoedas();
				 break;
				 
			case 4:
				cofrinho.totalConvertido();
				break;
			
			default:
				System.out.println("Encerrando...");
			}
			
			System.out.println("O que deseja fazer? \n"
					 + "1 - Adicionar\n"
					 + "2 - Remover\n"
			         + "3 - Listar\n"
			         + "4 - Total convertido para R$\n"
			         + "5 - Sair!");
			escolha = entrada.nextInt();
		}
	}

}
