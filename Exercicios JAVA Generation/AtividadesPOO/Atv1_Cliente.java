package AtividadesPOO;

public class Atv1_Cliente {

	private String nomeCliente;
	private String Email;
	private String datanasc;
	private int CPF;
	private int celular;
	
	
	public Atv1_Cliente(String nomeCliente, String email, String datanasc, int cPF, int celular) {
		super();
		this.nomeCliente = nomeCliente;
		Email = email;
		this.datanasc = datanasc;
		CPF = cPF;
		this.celular = celular;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getDatanasc() {
		return datanasc;
	}


	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}


	public int getCPF() {
		return CPF;
	}


	public void setCPF(int cPF) {
		CPF = cPF;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public void visualizar() {
		System.out.println("\nO cliente "+nomeCliente+" possui o E-mail "+Email+" Seu CPF é "
	+CPF+", Sua Data de Nascimento é "+datanasc+" e por fim seu número de telefone "+celular);
		
	}
	
}
	
