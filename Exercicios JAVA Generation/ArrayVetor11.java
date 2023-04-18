package AtividadesJAVA;

import java.util.Scanner;

public class ArrayVetor11 {

	public static void main(String[] args) {
		
		        Scanner ler = new Scanner(System.in);

		        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; // vetor com os 10 números inteiros
		        int numero, i;

		        System.out.print("Digite um número para pesquisar: ");
		        numero = ler.nextInt();

		        boolean encontrado = false;
		        int posicao = -1;

		        // Percorre o vetor em busca do número informado
		        for (i = 0; i < 10; i++) {
		            if (vetor[i] == numero) {
		                encontrado = true;
		                posicao = i;
		                break;
		            }
		        }

		        // Exibe a posição do número encontrado ou a mensagem de "Não foi encontrado!"
		        if (encontrado) {
		            System.out.println("O número " + numero + " foi encontrado na posição " + posicao);
		        } else {
		            System.out.println("Não foi encontrado!");
		        }

		        ler.close();

		
	}

}
