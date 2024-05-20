package application;

import java.util.Scanner;

import entities.Acessorio;
import entities.Carro;
import entities.Cliente;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean liberado = false, sair = false;
		String senha = "123";
		int opcao, numeroEscolhido;
		
		
		
		while (!liberado) {
			System.out.println("Por favor digite a senha ...");
			String senhaDigitada = sc.next();
			if(senhaDigitada.equals(senha)) {
				 System.out.println("SENHA CORRETA");
				 liberado = true;
			} else {
				System.out.println("ERRO DE SENHA");
			}
		}
		
		while (!sair) { 
			System.out.println("Bem vindo a concessionária");
			System.out.println("====== MENU PRINCIPAL ======");
			System.out.println("Digite 0 para sair");
			System.out.println("Digite 1 para se cadastrar");
			System.out.println("Digite 2 para compra de carro");
			System.out.println("Digite 3 para compra de acessórios ....");
			
			opcao = sc.nextInt();
			if (opcao == 0) {
				sair = true;
			}
			switch (opcao) {
			case 1: // CADASTRO CLIENTE
				Cliente cliente = new Cliente();
				System.out.println("==== Cadastro cliente ====");
				System.out.println("Digite o seu nome ...");
				cliente.nome = sc.next();
				System.out.println("Agora digite seu telefone ...");
				cliente.telefone = sc.next();
				System.out.println("Digite o seu endereço ...");
				cliente.endereco = sc.next();
				break;
				
			case 2: // COMPRA DE CARRO
				Carro carro = new Carro();
				System.out.println("==== Compra de carro ====");
				System.out.println("Selecione o carro desejado:");
				// mostra as opcoes de modelos salvos no array modeloOpcoes na classe carro
				for (int i = 1; i < carro.modeloOpcao.length; i++) {
		            System.out.println(i  + " - " + carro.modeloOpcao[i]);
		        }
				System.out.println("Digite o número do carro selecionado ...");
				numeroEscolhido = sc.nextInt();
				while (numeroEscolhido < 1 || numeroEscolhido >= carro.modeloOpcao.length) {
					System.out.println("Digite um número válido ...");
					numeroEscolhido = sc.nextInt();
				}
				// salva o modelo escolhido
				carro.modelo = carro.modeloOpcao[numeroEscolhido];
	            System.out.println("Carro selecionado: " + carro.modelo);
	            
	            // pede a cor do carro
	            System.out.println("Selecione a cor do seu novo carro:");
	            for (int i = 1; i < carro.corOpcao.length; i++) {
		            System.out.println(i  + " - " + carro.corOpcao[i]);
		        }
	            System.out.println("Digite o número da cor selecionada ...");
	            numeroEscolhido = sc.nextInt();
	            while (numeroEscolhido < 1 || numeroEscolhido >= carro.corOpcao.length) {
					System.out.println("Digite um número válido ...");
					numeroEscolhido = sc.nextInt();
				}
	            
	            // salva a cor do carro
	            carro.cor = carro.corOpcao[numeroEscolhido];
	            System.out.println("Cor selecionada: " + carro.cor);
	            
	            // pede a forma de pagamento
	            System.out.println("Selecione a forma de pagamento:");
	            for (int i = 1; i < carro.pagamentoOpcao.length; i++) {
		            System.out.println(i  + " - " + carro.pagamentoOpcao[i]);
		        }
	            System.out.println("Digite o número da forma de pagamento selecionada ...");
	            numeroEscolhido = sc.nextInt();
	            while (numeroEscolhido < 1 || numeroEscolhido >= carro.pagamentoOpcao.length) {
					System.out.println("Digite um número válido ...");
					numeroEscolhido = sc.nextInt();
				}
	            
	            //salva a forma de pagamento
	            carro.forma_pagamento = carro.pagamentoOpcao[numeroEscolhido];
	            System.out.println("A forma de pagamento selecionada foi " + carro.forma_pagamento);
	            
				break;
				
			case 3: // COMPRA DE ACESSORIO
				Acessorio acessorio = new Acessorio();
				System.out.println("====== Compra de acessorios ======");
				System.out.println("Selecione o acessorio:");
	            for (int i = 1; i < acessorio.nome_opcao.length; i++) {
		            System.out.println(i  + " - " + acessorio.nome_opcao[i]);
		        }
	            // salva o nome do acessorio desejado
	            System.out.println("Digite o número do acessorio selecionado ...");
	            numeroEscolhido = sc.nextInt();
	            while (numeroEscolhido < 1 || numeroEscolhido >= acessorio.nome_opcao.length) {
					System.out.println("Digite um número válido ...");
					numeroEscolhido = sc.nextInt();
				}
	            
	            // salva a quantidade desejada
	            acessorio.nome = acessorio.nome_opcao[numeroEscolhido];
	            System.out.println("O acessorio selecionado foi " + acessorio.nome);
	            System.out.println("Digite a quantidade desejada ....");
	            numeroEscolhido = sc.nextInt();
	            acessorio.add_quant(numeroEscolhido);
	            System.out.println("A quantidade selecionada foi " + acessorio.quantidade);
				break;
			
			default:
				System.out.println("[ERRO] Digite um numero valido");
				break;
		}
			
			
		}
		

		sc.close();
	}
}
