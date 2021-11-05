package Hashing;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Hashing hash[]= new Hashing[26];
		String nome, cor, fruta, objeto, pais, profissao, animal;
		
		String letras= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random aleatorio = new Random();
		System.out.println("Letra: " + letras.charAt(aleatorio.nextInt(letras.length())));
		
		System.out.print("\n Nome: ");
		Scanner leitura = new Scanner (System.in);
		nome= leitura.nextLine();
		
		System.out.print("\n Cor: ");
		cor=leitura.nextLine();
		
		System.out.print("\n Fruta: ");
		fruta=leitura.nextLine();
		
		System.out.print("\n Objeto: ");
		objeto=leitura.nextLine();
		
		System.out.print("\n País: ");
		pais=leitura.nextLine();
		
		System.out.print("\n Profissão: ");
		profissao=leitura.nextLine();
	
		System.out.print("\n Animal: ");
		animal=leitura.nextLine();
		
		leitura.close();
	}
}