package view;

import java.util.Scanner;

import controller.ProcessosController;

public class Principal {

	public static void main(String[] args) {
	
		ProcessosController procController = new ProcessosController();
//		String os = System.getProperty("os.name");
//	              System.out.println(os);
		
//		int opcoes = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			while (op��es!= 7) {
//				System.out.println("\n Escolha uma das op��es: \n 1 - M�todo IP \n 2 - M�todo Ping  \n 7 - Finalizar");
				opcoes = scanner.nextInt();
				switch (opcoes) {
				case 1:
					processosController.ip(os);
				break;
				
				case 2:
					processosController.ping(os);
				break;
				case 7:
					System.out.println("Encerrado!");
				break;
				default:
					System.out.println("Op��o inv�lida!");
				break;
				}
				
		}

}		
		
		

	





