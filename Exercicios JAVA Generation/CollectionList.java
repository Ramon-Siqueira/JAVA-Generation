package AtividadesJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//importamos as classes necessárias para usarmos o ArrayList, o Scanner e o método de ordenação de Collections.
public class CollectionList {

	public static void main(String[] args) {
		
		int i;

		
		ArrayList<String> cores = new ArrayList<String>();
		//criamos uma instância de ArrayList para armazenar as cores digitadas pelo usuário.
		Scanner ler = new Scanner(System.in);
		//criamos uma instância de Scanner para ler os valores digitados pelo usuário.
		 for (i = 0; i < 5; i++) {
	            System.out.print("\nDigite uma cor: ");
	            String cor = ler.nextLine();
	            cores.add(cor);
	        }
//Utilizando um laço de repetição, pedimos ao usuário que digite 5 cores e adicionamos cada uma individualmente no ArrayList.
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
//Em seguida, exibimos na tela todas as cores que foram adicionadas ao ArrayList.
	        Collections.sort(cores);
//Utilizamos a classe Collections para ordenar em ordem crescente as cores do ArrayList.
	        System.out.println("\nAs cores em ordem crescente são:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
	        //exibimos o resultado
	    }
	}

