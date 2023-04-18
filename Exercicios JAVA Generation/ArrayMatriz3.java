package AtividadesJAVA;

import java.util.Scanner;

public class ArrayMatriz3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeros[][] = new int [3][3];
		int linha,coluna,somaDiagonalPrincipal=0,somaDiagonalSecundaria=0;
		String valoresDiagonalPrincipal="",somaDiagonalSecundaria1="";
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ",linha, coluna); //letra d inteira, letra f flout
				numeros[linha][coluna] = leia.nextInt();
				
				if(linha == coluna) {
					somaDiagonalPrincipal += numeros[linha][coluna];
					valoresDiagonalPrincipal += numeros[linha][coluna]+" ";
					
				}
				
				if(linha+coluna == 2) {
					somaDiagonalSecundaria += numeros[linha][coluna];
					somaDiagonalSecundaria1 += numeros[linha][coluna]+" ";				}
			}
		}
		System.out.println("\nElementos da diagonal principal: "+valoresDiagonalPrincipal);
		System.out.println("\nElementos da diagonal principal: "+valoresDiagonalPrincipal);
		System.out.println("\nElementos da diagonal secundaria: "+somaDiagonalSecundaria);
		System.out.println("\nsomatorio da diagonal principal: "+somaDiagonalPrincipal);
		System.out.println("\nsomatorio da diagonal secundaria: "+somaDiagonalSecundaria1);
	}

	}

	
