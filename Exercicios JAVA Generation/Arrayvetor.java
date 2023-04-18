package AtividadesJAVA;

import java.util.Scanner;

public class Arrayvetor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int[10];
	        int soma = 0;
	        double media;

	        System.out.println("Digite 10 números inteiros:");

	        // Leitura dos 10 números inteiros e armazenamento no vetor
	        for (int i = 0; i < 10; i++) {
	            vetor[i] = scanner.nextInt();
	            soma += vetor[i];
	        }

	        media = (double) soma / 10;

	        System.out.println("Elementos dos índices ímpares:");
	        // Impressão dos ímpares
	        for (int i = 1; i < 10; i += 2) {
	            System.out.print(vetor[i] + " ");
	        }
	        System.out.println();

	        System.out.println("Elementos pares:");
	        // Impressão pares
	        for (int i = 0; i < 10; i++) {
	            if (vetor[i] % 2 == 0) {
	                System.out.print(vetor[i] + " ");
	            }
	        }
	        System.out.println();

	        System.out.println("Soma dos elementos do vetor: " + soma);
	        System.out.println("Média dos elementos do vetor: " + media);

	        scanner.close();
	    
	}

}
