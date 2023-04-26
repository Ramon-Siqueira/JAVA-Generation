package AtividadesPOO;

public class pessoaJuridica extends Pessoa{

	private int cnpj;
	private float cracha;
	
	
	public pessoaJuridica(String nome, String endereco, String cpf, int telefone, int idade, int cnpj, float cracha) {
		super(nome, endereco, cpf, telefone, idade);
		this.cnpj = cnpj;
		this.cracha = cracha;
	}


	public int getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public float getCracha() {
		return cracha;
	}


	public void setCracha(float cracha) {
		this.cracha = cracha;
	}
	
	public void imprimir() {
		System.out.println("\nNome da pessoa juridica: "+getNome()+"\nCPF: "+getCpf()
		+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()
		+"\nCNPJ: "+cnpj+"\nCracha: "+cracha);
	}
}
