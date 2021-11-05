/*8) Escreva um método que receba um arranjo de inteiros e verifique 
 e imprima todos os valores primos contidos no arranjo*/
package Lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("Quantos números você deseja alocar no seu vetor?");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		int vetor[] = new int[n];
		
		for (int cont = 0 ; cont < n; cont++) {
			int numDivisor = 0;
			System.out.println("Qual número alocar no seu vetor na posição " + cont + "?");
			Scanner teclado1 = new Scanner(System.in);
			vetor[cont] = teclado1.nextInt();
			for (int cont2 = 1; cont2 <= vetor[cont]; cont2++) {
				if (vetor[cont] % cont2 ==0 ) {
				numDivisor ++;	
				}
			}
			if (numDivisor ==2)	{
				System.out.println(vetor[cont] + " é primo!");
			teclado1.close();
			}

		}
		teclado.close();

	}

}
