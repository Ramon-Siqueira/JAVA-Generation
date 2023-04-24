package AtividadesJAVA;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
	
	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		 Stack<String> pilha = new Stack<String>();
		    int opcao = -1;

		    while (opcao != 0) {
		        System.out.println("========== MENU ==========");
		        System.out.println("1. Adicionar livro");    
		        System.out.println("2. Listar todos os livres");
		        System.out.println("3. Retirar livro");
		        System.out.println("0. Sair");
		        System.out.print("Entre com a opção desejada: ");

		        opcao = entrada.nextInt();
		        entrada.nextLine();
		        
		        switch (opcao) {
	            case 1:
	                System.out.println("Digite o nome do livro:");
	                String livro = entrada.nextLine();
	                pilha.push(livro);
	                System.out.println(livro + " adicionado na pilha.");
	                break;
	            case 2:
	                System.out.println("Pilha de livros atual:");
	                for (int i = pilha.size()-1 ; i >= 0 ; i--) {
	                    System.out.println(pilha.get(i));
	                }
	                break;
	            case 3:
	                if (pilha.isEmpty()) {
	                    System.out.println("A pilha está vazia.");
	                } else {
	                    String livroRetirado = pilha.pop();
	                    System.out.println(livroRetirado + " retirado da pilha.");
	                }
	                break;
	          
	            case 0:
	                System.out.println("Programa encerrado.");
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                break;
	        }

	        System.out.println(); // Pula uma linha
	    } while (opcao != 0);

	    entrada.close();
	}

	}


