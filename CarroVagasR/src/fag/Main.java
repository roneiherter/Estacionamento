package fag;

import java.util.Scanner;

import objs.TodasAsFuncoes;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Boolean menu = true;
		
		TodasAsFuncoes funcoes = new TodasAsFuncoes();
		
		while(menu) {
			System.out.println("1. cadastrar vaga \n2. mostrar vagas\n3. cadastrar veiculo \n4. mostrar veiculos \n5. valores \n6. sair \nOque deseja fazer? ");
			int escolha = scanner.nextInt();
			
			switch(escolha) {
				case 1:
					funcoes.cadastroDeVaga();
					break;
				case 2:
					funcoes.mostrarVagas();
					break;
				case 3:
					funcoes.cadastroDeCarro();
					break;
				case 4:
					funcoes.mostrarVeiculos();
					break;
				case 5:
					funcoes.valores();
					break;
				case 6:
					menu=false;
					break;
				default:
					System.out.println("opção " + escolha + " não existe.");
			}
		}

	}

}
