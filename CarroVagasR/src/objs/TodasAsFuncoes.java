package objs;

import java.util.ArrayList;
import java.util.Scanner;

public class TodasAsFuncoes {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Veiculo> veiculosLista = new ArrayList<>();
	public static ArrayList<Vaga> vagasLista = new ArrayList<>();
	
	public void cadastroDeVaga() {
		
		System.out.println("Qual o numero da vaga? ");
		int numero = scanner.nextInt();
	
		System.out.println("Qual o tamanho da vaga [P, M, G]? "); 
		String tamanho = scanner.next();
			
		Boolean menu = true;
		Boolean disponivel = true;
		while(menu) {
			System.out.println("1. SIM \n2. NÃO \nA vaga esta disponivel? ");
			int escolha = scanner.nextInt();
			
			if(escolha==1) {
				disponivel = true;
				menu = false;
			} else if(escolha==2) {
				disponivel = false;
				menu = false;
			} else {
				System.out.println("opção " + escolha + " não existe.");
			}
		}
		
		Vaga vaga = new Vaga(disponivel, numero, tamanho);
		vagasLista.add(vaga);
	}
	
	public void mostrarVagas() {
		for (Vaga vaga : vagasLista) {
			System.out.println(vaga);
		}
	}
	
	public void cadastroDeCarro() {
		
		System.out.println("Qual o tamanho do carro [P, M, G]? ");
		String tamanho = scanner.next();
		
		Boolean vagaDisp = false;
		
		if(tamanho.equalsIgnoreCase("p")) {
			for (Vaga vaga : vagasLista) {
				if(vaga.getDisponivel()) {
					vagaDisp=true;
				}
			}
		} else if (tamanho.equalsIgnoreCase("m")) {
			for (Vaga vaga : vagasLista) {
				if(vaga.getDisponivel() && (vaga.getTamanho().equalsIgnoreCase("m") || vaga.getTamanho().equalsIgnoreCase("g"))) {
					vagaDisp=true;
				}
			}
		} else {
			for (Vaga vaga : vagasLista) {
				if(vaga.getDisponivel() && vaga.getTamanho().equalsIgnoreCase("g")) {
					vagaDisp=true;
				}
			}
		}
		
		if(vagaDisp) {
			System.out.println("Qual o modelo do carro? ");
			String modelo = scanner.next();
			
			System.out.println("Qual a placa do carro? ");
			String placa = scanner.next();
			
			mostrarVagas();
			System.out.println("Qual o numero da vaga em que o carro vai ser estacionado? ");
			int numeroVaga = scanner.nextInt();
			
			Vaga vagaCadastro = new Vaga();
			for (Vaga vaga : vagasLista) {
				if(vaga.getNumero()==numeroVaga) {
					vagaCadastro=vaga;
					vaga.setDisponivel(false);
				}
			}
			
			System.out.println("Qual a hora do checkin [24h][HH MM]? ");
		    int horaEnt = scanner.nextInt();
		    int minutoEnt = scanner.nextInt();
		    
		    System.out.println("Qual a hora do checkout [24h][HH MM]? ");
		    int horaSaida = scanner.nextInt();
		    int minutoSaida = scanner.nextInt();
		    
		    int horasTot = 0;
		    int minutosTot = 0;
		    
		    if (horaEnt <= horaSaida) {
		        horasTot = horaSaida - horaEnt;
		        minutosTot = minutoSaida - minutoEnt;
		        
		        if (minutosTot < 0) {
		        	minutosTot= minutosTot + 60;
		            horasTot = horasTot - 1;
		        }
		    } else {
		        horaSaida += 24; 
		        
		        horasTot = horaSaida - horaEnt;
		        minutosTot = minutoSaida - minutoEnt;
		        
		        if (minutosTot < 0) {
		        	minutosTot= minutosTot + 60;
		        	horasTot = horasTot - 1;
		        }
		    }
			
			double preco= 0;
			if(horasTot < 1 || (horasTot == 1 && minutosTot == 0)) {
				preco = 5;
			} else if(horasTot>3) {
				preco = 15;
			} else {
				preco = 10;
			}
			
			Veiculo veiculo = new Veiculo(modelo, tamanho, vagaCadastro, placa, preco, horaEnt, minutoEnt, horaSaida, minutoSaida, horasTot, minutosTot);
			veiculosLista.add(veiculo);
		} else {
			System.out.println("Nenhuma vaga para este tamanho de carro");
		}
	}
	
	public void mostrarVeiculos() {
		for (Veiculo veiculo : veiculosLista) {
			System.out.println(veiculo);
		}
	}
	
	public void valores() {
		double valor = 0;
		for (Veiculo veiculo : veiculosLista)
		{
			System.out.println("Veiculo: " + veiculo.getModelo() + ", placa: " + veiculo.getPlaca() + ", tempo: " + veiculo.getHorasTot() + ":" + veiculo.getMinutosTot() + ", valor: R$" + veiculo.getPreco());
			valor+=veiculo.getPreco();
		}
		System.out.println("Valor: R$" + valor );
	}

}
