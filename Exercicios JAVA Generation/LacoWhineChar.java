package ColmeiaTech;

import java.util.Scanner;

public class LacoWhineChar {

	public static void main(String[] args) {
		
		int idade, genero, cat, contNPB=0, contNMF=0, contNHM40=0, contMF30 = 0;
		String escolha = "S";
		
		Scanner leia = new Scanner(System.in);
		
		while (escolha.equalsIgnoreCase("S")) {
			System.out.println("\nDigite sua idade: ");
			
			idade = leia.nextInt();
			System.out.println("\nDigite o seu genero: ");
			System.out.println("\n1--Masculino\n2--Feminino\n3--Não se aplica");
			
			genero = leia.nextInt();
			System.out.println("\nDigite a categoria: ");
			System.out.println("\n1--BACKEND\n2--Frontend\n3--Mobile\n4--Fullstack: ");
			
			cat = leia.nextInt();
			System.out.println("\nDeseja continuar???  (S-Sim / N-Não) ");
			escolha = leia.next();
			
			if(cat==1) {
				contNPB++;
			}
			if(genero == 2 && cat == 2) {
				contNMF++;
			}
			if(idade > 40 && genero ==1 && cat == 3) {
				contNHM40++;
				
			}
			if(idade < 30 && genero == 2 && cat == 4) {
				 contMF30++;
			}
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras BACKEND: "+contNPB);
		System.out.println("\nTotal de mulheres desenvolvedoras FRONTEND: "+contNMF);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: "+contNHM40);
		System.out.println("\nTotal de mulheres desenvolvedoras Fullstack menos de 30 anos: "+contMF30);
		
	}
}
