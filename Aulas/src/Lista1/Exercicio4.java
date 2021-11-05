/*4) Escreva um m�todo que recebe um array de inteiros e devolve a posi��o onde se encontra o maior
valor do array. Se houver mais de um valor maior, devolver a posi��o da primeira ocorr�ncia. O
m�todo deve ter a seguinte:
public int retornaPosicaoMaiorElemento(int[] vetor) {
...
}*/
package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		Scanner teclado = new Scanner(System.in);
		for (int cont = 0; cont < vetor.length; cont++) {
			System.out.println("Digite um n�mero para o vetor de posi��o " + cont);
			vetor[cont] = teclado.nextInt();
		}
		teclado.close();
		int posicao = retornaPosicaoMaiorElemento(vetor);
		System.out.println("0 maior valor do arranjo est� na posi��o" + posicao);
	}

	public static int retornaPosicaoMaiorElemento(int[] vetor) {
		int maior = 0;
		for (int cont = 0; cont < vetor.length; cont++) {
			if (vetor[cont] > maior) {
				cont = maior;
			}
		}
		return maior;

	}
}