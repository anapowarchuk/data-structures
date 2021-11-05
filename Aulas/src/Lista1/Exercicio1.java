/*1) Crie um m�todo que recebe por par�metro um array de inteiros e retorna a
quantidade de elementos do array que s�o n�meros negativos*/

package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		System.out.println("Informe 10 n�meros:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();
		}
		int resultado = contaNegativos(numeros);

		System.out.println("Existem " + resultado + " n�meros negativos no vetor");

	}// fim do main

	public static int contaNegativos(int numeros[]) {
		int count = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				// � negativo
				count++;
			}
		}
		return count;
	}
}// fim da classe