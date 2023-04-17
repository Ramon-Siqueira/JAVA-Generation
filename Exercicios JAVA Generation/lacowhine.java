package ColmeiaTech;

import java.util.Scanner;

public class lacowhine {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
				int idade = 0,idMenor=0,idMaior=0;
				
				while(idade >= 0) {
					System.out.print("Digite uma idade: ");
					idade = leia.nextInt();
					
					if(idade > 21 && idade >=0) {
						idMenor++;
						
					}if (idade > 50) {
						idMaior++;
					}
					
				}
				System.out.println("\nQuantidade de pessoas menores de 21 anos: "+idMenor);
				System.out.println("\nQuantidade de pessoas maiores de 50 anos: "+idMaior);
		}

}
		
		
			
			  
	

