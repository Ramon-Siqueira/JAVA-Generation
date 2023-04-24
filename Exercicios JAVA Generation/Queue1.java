package AtividadesJAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> cliente = new LinkedList<String>();
		
		Scanner ler = new Scanner(System.in);
		int opcao = -1;
		
		 while (opcao != 0) {
		     System.out.println("Escolha uma opção:");
		     System.out.println("1 - Adicionar um Cliente à fila");
		     System.out.println("2 - Mostrar a lista de Clientes na fila");
		     System.out.println("3 - Atender o próximo Cliente da fila");
		     System.out.println("0 - Sair");
		     opcao = ler.nextInt();
		    
			switch (opcao) {
		        case 0:
		           System.out.println("Saindo do programa...");
		           break;
		        case 1:
		        	System.out.println("Digite o nome do cliente:");
		        	String nome = ler.next();
		        	cliente.add(nome);
		        	System.out.println("Cliente adicionado!");
		        	break;
		       
			        case 2:
			           System.out.println("Clientes na fila: ");
			           for (String s : cliente) {
			              System.out.println(s);
			           }
			           break;
			        case 3:
				           if (!cliente.isEmpty()) {
				              System.out.println(cliente.remove() + " atendido!");
				           } else {
				              System.out.println("Fila vazia!");
				           }
				           break;
			        default:
			           System.out.println("Opção inválida!");
		     }
		  }
		  ler.close();
		 
		 
		 }
	}