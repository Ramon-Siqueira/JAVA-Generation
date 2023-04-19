package AtividadesJAVA;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
	      Scanner ler = new Scanner(System.in);
	        Set<Integer> conjunto = new LinkedHashSet<>();

	        System.out.println("Digite 10 valores inteiros não repetidos:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Valor " + i + ": ");
	            int valor = ler.nextInt();
	            conjunto.add(valor);
	        }

	        System.out.println("\nElementos da coleção:");

	        Iterator<Integer> a = conjunto.iterator();
	        while (a.hasNext()) {
	            System.out.println(a.next());
	        }
	        TreeSet<Integer> valoresOrdenados = new TreeSet<Integer>(conjunto);
	        System.out.println("Valores ordenados: " + valoresOrdenados);
	        
	        ler.close();
	    }
        }
	

	
