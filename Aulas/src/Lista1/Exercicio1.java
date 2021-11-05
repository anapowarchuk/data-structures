/*1) Crie um método que recebe por parâmetro um array de inteiros e retorna a
quantidade de elementos do array que são números negativos*/

package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		System.out.println("Informe 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();
		}
		int resultado = contaNegativos(numeros);

		System.out.println("Existem " + resultado + " números negativos no vetor");

	}// fim do main

	public static int contaNegativos(int numeros[]) {
		int count = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				// é negativo
				count++;
			}
		}
		return count;
	}
}// fim da classe