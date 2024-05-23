package entities;

public class Acessorio {
	public String[] nome_opcao = {"", "GPS", "Ar Condicionado", "Airbag", "Câmera de Ré", "Sensor de Estacionamento", "Controle de Estabilidade", "Freios ABS", "Teto Solar", "Bancos de Couro", "Central Multimídia"};
	public String nome;
	public int quantidade;
	
	public void add_quant(int quant) {
		this.quantidade += quant;
	}
	
	public void rem_quant(int quant) {
		this.quantidade -= quant;
	}

	@Override
	public String toString() {
		return "[Nome=" + nome + ", Quantidade=" + quantidade + "]";
	}


	
	
}
