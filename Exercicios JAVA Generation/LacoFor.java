package ColmeiaTech;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1,n2;
		int i;
		
		 System.out.println("Digite o primeiro número: ");
		    n1 = leia.nextInt();
		   
		    System.out.println("Digite o segundo número: ");
		    n2 = leia.nextInt();
		    
		    if(n1 >= n2) {
		        System.out.println("\nIntervalo inválido");
		        return;
		    }
		    
		    for(i = (int) n1; i <= n2; i++) {
		        if(i % 3 == 0 && i % 5 == 0) {
		            System.out.println(i + " é múltiplo de 3 e 5");
		        }
		    }
	}
}
