package PilhaDupla;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pilha iniciaVogal = new Pilha();
		Pilha iniciaConsoante = new Pilha();
		Pilha maisVogais = new Pilha();
		Pilha maisConsoantes = new Pilha();
		Pilha palindroma = new Pilha();
		
		// Recebe um numero n do usuario
		System.out.print("Informe uma quantidade de palavras: ");
		int n = leitor.nextInt();
		
		// Recebe n palavras do usuario
		System.out.println("Informe as "+n+" palavras: ");
		String[] palavra = new String[n];
		for (int i = 0; i < n; i++){
			palavra[i] = leitor.next();
			
			// Categoriza as palavras em cinco pilhas
			if (iniciaVogal(palavra[i]))
				iniciaVogal.empilhar(palavra[i]);
			else
				iniciaConsoante.empilhar(palavra[i]);
			if (maisVogais(palavra[i]))
				maisVogais.empilhar(palavra[i]);
			else
				maisConsoantes.empilhar(palavra[i]);
			if (ePalindroma(palavra[i]))
				palindroma.empilhar(palavra[i]);
		}
		leitor.close();
		
		// Apresenta o conteudo de cada uma das pilhas
		System.out.println("Pilha das palavras que comecam com vogais: ");
		iniciaVogal.imprimir();
		System.out.println("Pilha das palavras que comecam com consoantes: ");
		iniciaConsoante.imprimir();
		System.out.println("Pilha das palavras com mais vogais: ");
		maisVogais.imprimir();
		System.out.println("Pilha das palavras com mais consoantes: ");
		maisConsoantes.imprimir(); //https://open.spotify.com/artist/2O7dDVdUrHpSTg6qdrSWFy
		System.out.println("Pilha das palavras palindromas: ");
		palindroma.imprimir();
	}
	
	public static boolean iniciaVogal(String palavra){
		return eVogal(palavra, 0);
	}
	
	public static boolean eVogal(String palavra, int posicao){
		char letra = Character.toLowerCase(palavra.charAt(posicao));
		if ((letra=='a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u'))
			return true;
		return false;
	}
	
	public static boolean maisVogais(String palavra){
		int consoantes = 0;
		int vogais = 0;
		
		for (int i = 0; i < palavra.length(); i++){
			if (eVogal(palavra, i))
				vogais++;
			else
				consoantes++;
		}
		return (vogais > consoantes);
	}

	public static boolean ePalindroma(String palavra){
		String palavraContrario = "";
		for (int i = (palavra.length()-1); i >= 0; i--)
			palavraContrario = palavraContrario + palavra.charAt(i);
		return palavraContrario.equalsIgnoreCase(palavra);
	}
}