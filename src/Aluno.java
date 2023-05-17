
public class Aluno {
	
	private String nome;
	private String endereco;
	private String contato;
	
	public Aluno (String nome, String endereco, String contato) {
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}

	
	
	@Override
	public String toString() {
		return " Aluno: " + nome + ". Endereço: " + endereco + ". Contato: " + contato;
	}
	
	

}
