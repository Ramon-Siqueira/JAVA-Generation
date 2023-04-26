package AtividadesPOO;

public class testaCliente {

	public static void main(String[] args) {
		
		Atv1_Cliente Cli = new Atv1_Cliente (" Ramon ","ramon123@gmail.com, ","14/03/1995" , 1234567890 , 1191234567 );
		Atv1_Cliente Cli2 = new Atv1_Cliente (" Siqueira ","siqueira123@gmail.com, ","03/03/2002" , 1234567890 , 1191234567 );
		Cli.visualizar();
		Cli2.visualizar();
	}
	

}
