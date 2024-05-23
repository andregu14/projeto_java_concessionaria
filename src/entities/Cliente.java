package entities;

public class Cliente {
	public String nome;
	public String telefone;
	public String endereco;
	@Override
	public String toString() {
		return "[Nome=" + nome + ", Telefone=" + telefone + ", Endereco=" + endereco + "]";
	}
	
	
}
