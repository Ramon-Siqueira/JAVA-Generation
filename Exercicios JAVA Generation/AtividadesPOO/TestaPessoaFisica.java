package AtividadesPOO;

public class TestaPessoaFisica {

	public static void main(String[] args) {
		
		pessoaFisica fisica = new pessoaFisica ( "Ramon", "Rua joão", "05740865743", 930865347, 28, 111, 12300, 9);
		
		pessoaFisica fisica2 = new pessoaFisica (" Siqueira ","Rua Fiochi","73546721894", 123456789, 22, 222, 1191,7);
		
		fisica.visualizar();
		fisica2.visualizar();
		
		System.out.println("===================================================================");
		
		pessoaJuridica juridica = new pessoaJuridica ( "Ramon", "Rua joão", "05740865743", 930865347, 28, 1111111111, 1234);
		
		pessoaJuridica juridica2 = new pessoaJuridica (" Siqueira ","Rua Fiochi","73546721894", 123456789, 22, 222222222, 4321);
		
		juridica.imprimir();
		juridica2.imprimir();
	}

}
	


