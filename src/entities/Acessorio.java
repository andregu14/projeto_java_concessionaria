package entities;

public class Acessorio {
	public String nome;
	public int quantidade;
	
	public void add_quant(int quant) {
		this.quantidade += quant;
	}
	
	public void rem_quant(int quant) {
		this.quantidade -= quant;
	}
}
