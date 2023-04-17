package ColmeiaTech;

import java.util.Scanner;

public class lacodowhine {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);		
		
		int numero, soma=0;
		
		do {
			System.out.println("\nDigite um número (Zero para sair): ");
			numero = leia.nextInt();
			if(numero > 0) {
				soma += numero;
				
				}
			
			}while (numero != 0); 
				System.out.println("\nA soma dos números positivos digitados é: " + soma);
				
				leia.close();
			}		
		
	
	}

