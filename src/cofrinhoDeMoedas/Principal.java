package cofrinhoDeMoedas;

import java.util.Scanner;

public class Principal { //EDUARDO DELLA NORA SZPAK RU 4061681
	
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		int escolha;
		
		
		Cofrinho cofrinho = new Cofrinho();
		Moeda moeda;
		
		while (true){
			System.out.println("O que deseja fazer? \n"
					 + "1 - Adicionar\n"
					 + "2 - Remover\n"
			         + "3 - Listar\n"
			         + "4 - Total convertido para R$\n"
			         + "5 - Sair!");
			escolha = entrada.nextInt();
			
			if (escolha == 1){ // Inicio do loop que adiciona moedas ao cofrinho
				while(true) {
					System.out.println("Digite qual tipo de moeda deseja ADICIONAR:\n"
							+ "1 - Real\n"
							+ "2 - Dolar\n"
							+ "3 - Euro\n"
							+ "4 - Retornar");
					int adicionar = entrada.nextInt();
					
					moeda = null;
					if(adicionar == 1) {
						System.out.println("Digite o valor da moeda que deseja adicionar ");
						double real = entrada.nextDouble();
						moeda = new Real(real);
						
					}else if(adicionar == 2) {
						System.out.println("Digite o valor da moeda que deseja adicionar ");
						double dolar = entrada.nextDouble();
						moeda = new Dolar(dolar);
						
					}else if(adicionar == 3) {
						System.out.println("Digite o valor da moeda que deseja adicionar ");
						double euro = entrada.nextDouble();
						moeda = new Euro(euro);
						
					}else if(adicionar == 4) {
						break;
					}
					
					cofrinho.adicionar(moeda); // Fim do loop adicionar
				}
			}
			
			else if(escolha == 2) { // Inicio do loop que remove moedas do cofrinho
				while(true) {
					System.out.println("Digite qual tipo de moeda deseja REMOVER:\n"
							+ "1 - Real\n"
							+ "2 - Dolar\n"
							+ "3 - Euro\n"
							+ "4 - Retornar");
					int remover = entrada.nextInt();
					
					moeda = null;;
					if(remover == 1) {
						System.out.println("Digite o valor da moeda que deseja remover");
						double real = entrada.nextDouble();
						moeda = new Real(real);
						
					}else if(remover == 2) {
						System.out.println("Digite o valor da moeda que deseja remover");
						double dolar = entrada.nextDouble();
						moeda = new Dolar(dolar);
						
					}else if(remover == 3) {
						System.out.println("Digite o valor da moeda que deseja remover");
						double euro = entrada.nextDouble();
						moeda = new Euro(euro);
						
					}else if(remover == 4) {
						break;
					}
					
					cofrinho.remover(moeda); // Fim do loop remover
				}
			}
			
			else if (escolha == 3) {
				cofrinho.listagemMoedas();
		}
			
			else if(escolha == 4) {
				cofrinho.totalConvertido();
				
		}
			
			else if(escolha == 5) {
			System.out.println("Encerrando...");
			break;
		}

		}
		entrada.close();
	}
}
