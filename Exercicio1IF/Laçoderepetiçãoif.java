package Exercicio1IF;

import java.util.Scanner;

public class Laçoderepetiçãoif {
	
	public static void main(String[] args) {
		
		float a,b,c,soma;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		a = ler.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		b = ler.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		c = ler.nextFloat();
		
		soma = (a+b);
		
		if(soma>c) {
			System.out.println("\nA Soma de A + B é Maior do que C!!");
		}
		else if(soma<c) {
			System.out.println("\nA Soma de A + B é Menor do que C!!");
		}
		else if(soma==c) {
			System.out.println("\nA Soma de A + B é igual a C!!");
		}
		
		
	}

}
