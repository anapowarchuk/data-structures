package PilhaDup;

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		int n;
		String palavra = null;

		Pilha inicioVogal = new Pilha();
		Pilha inicioConsoante = new Pilha();
		Pilha maisVogais = new Pilha();
		Pilha maisConsoantes = new Pilha();
		Pilha palindroma = new Pilha();

		System.out.println("Quantas palavras você deseja digitar?");
		Scanner leitura = new Scanner(System.in);
		n = leitura.nextInt();

		System.out.println("Digite " + n + " palavras \n");
		for (int cont = 0; cont < n; cont++) {
			palavra = leitura.next();

			// verifica se a primeira letra é vogal ou consoante
			char letra = palavra.charAt(0);
			if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'
					|| letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U') {
				inicioVogal.pushB(palavra);
			} else {
				inicioConsoante.pushB(palavra);
			}

			// verifica se a palavra tem mais letras vogais ou consoante
			int contV = 0;
			int contC = 0;
			for (int cont1 = 0; cont1 < palavra.length(); cont1++) {
				char vogal = palavra.charAt(cont1);
				if (vogal == 'a' || vogal == 'A' || vogal == 'e' || vogal == 'E' || vogal == 'i' || vogal == 'I'
						|| vogal == 'o' || vogal == 'O' || vogal == 'u' || vogal == 'U') {
					contV++;
				} else
					contC++;
			}
			if (contV > contC) {
				maisVogais.pushB(palavra);
			} else
				maisConsoantes.pushB(palavra);

			// verifica se a palavra é um palindrono
			String contrario = "";
			for (int cont2 = (palavra.length() - 1); cont2 >= 0; cont2--) {
				contrario = contrario + palavra.charAt(cont2);
			}
			if (contrario.equals(palavra)) {
				palindroma.pushB(palavra);
			}
		}
		leitura.close();
		System.out.println("\nPalavras iniciadas com vogais:");
		inicioVogal.imprimir();
		System.out.println("\nPalavras iniciadas com consoantes:");
		inicioConsoante.imprimir();
		System.out.println("\nPalavras que possuem mais vogais do que consoantes: ");
		maisVogais.imprimir();
		System.out.println("\nPalavras que possuem mais consoantes do que vogais: ");
		maisConsoantes.imprimir();
		System.out.print("\nPalavras palíndromas: \n");
		palindroma.imprimir();
	}
}
