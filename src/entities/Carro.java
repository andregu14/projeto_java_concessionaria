package entities;

public class Carro {
	public String modeloOpcao[] = {"","Jeep Compass", "Corolla", "Cruze" };
	public String modelo;
	public String corOpcao[] = {"","Preto", "Vermelho", "Cinza", "Amarelo"};
	public String cor;
	public String pagamentoOpcao[] = {"","A vista", "Financiamento", "Consórcio"};
	public String forma_pagamento;
	
	
	@Override
	public String toString() {
		return "[Modelo=" + modelo + ", Cor=" + cor + ", Forma de pagamento=" + forma_pagamento + "]";
	}
	
	
}
