package JavaTech;

import java.util.Scanner;

public class Alunos {

		public static void main(String[] args) {			

			String nome = "Ramon";
			int idade = 28,x=10;
			double altura = 1.74;
			float nota1,nota2,nota3,nota4,media;
			
			Scanner leia = new Scanner(System.in);

			System.out.println("Nome participante: "+nome);
			System.out.println("Idade participante: "+idade+" anos");
			System.out.println("Altura participante: "+altura);
			
			
			System.out.println("Entre com a primeira nota: ");
			nota1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota: ");
			nota2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota: ");
			nota3 = leia.nextFloat();
			System.out.println("Entre com a quarta nota: ");
			nota4 = leia.nextFloat();
			
			media = (nota1+nota2+nota3+nota4)/4;
			
			//System.out.println("\nMédia Aritmètrica: "+media);
			System.out.printf("\nMédia Aritmètrica: %.2f",media);
			
		
		}

	}


