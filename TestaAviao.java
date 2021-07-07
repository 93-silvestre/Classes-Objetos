package br.com.generation.classes.objetos;

import java.util.Scanner;

public class TestaAviao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Aviao a1 = new Aviao();
     
		System.out.println("O seu vôo sairá ...");
		
		System.out.print("Sr(a) passageiro(a) digite seu nome: ");
		a1.nome = ler.next();
		
		System.out.print("Digite número do seu passaporte: ");
		a1.numpassaporte = ler.nextInt();
		
		System.out.print("Digite seu destino: \n(Rio de Janeiro = 1 | São Paulo = 2): ");
		a1.destino = ler.nextInt();
		
		a1.viagem();
		
	}

}
