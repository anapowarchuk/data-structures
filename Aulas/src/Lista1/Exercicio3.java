/*3) Crie um m�todo que verifica se o array cont�m elementos distintos. Deve retornar true, caso
contenha elementos distintos, e false caso contr�rio. O m�todo deve ter a seguinte assinatura:
public boolean temElementosDistintos(int[] vetor) {
...
}
*/
package Lista1;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		Scanner teclado = new Scanner(System.in);
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Digite um n�mero para o vetor de posi��o " + cont);
			vetor[cont] = teclado.nextInt();
		}

		for (int cont = 0; cont < 5; cont++) {
			System.out.print(" " + vetor[cont]);
		}

		teclado.close();
		boolean bool = temElementosDistintos(vetor);
		System.out.println(bool);
	}

	public static boolean temElementosDistintos(int[] vetor) {
		int cont1, cont2;
		boolean retorno = true;

		for (cont1 = 0; cont1 < vetor.length; cont1++) {
			for (cont2 = cont1 + 1; cont2 < vetor.length; cont2++) {
				if (vetor[cont1] == vetor[cont2]) {
					retorno = false;
				}

			}
		}
		return retorno;

	}
}