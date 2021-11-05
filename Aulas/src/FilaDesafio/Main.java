package FilaDesafio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String nome;
		
		Fila Normais = new Fila ();
		Fila Prioritarios = new Fila();
		Fila Retiradas = new Fila();
	
		
	
	}
	
	public void registro (String nome, boolean prioritario) {
		System.out.println("Qual o seu nome?");
		Scanner leitura =  new  Scanner (System.in);
		nome = leitura.next();
		System.out.println("Prioritário? responda true se verdadeiro e false se falso");
		prioritario=leitura.nextBoolean();
		
	}
}
	

