/* 9)Elabore um programa que, dados dois vetores de inteiros de 20 posi��es,
efetue as respectivas opera��es indicadas por um terceiro vetor de 20
posi��es contendo caracteres tamb�m fornecidos pelo usu�rio, contendo as
quatro opera��es aritm�ticas, e armazene os resultados em um quarto vetor, de
inteiros.*/

package Lista1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		int vetor1[] = new int[3];
		int vetor3[] = new int[3];
		String vetor2[] = new String[3];
		int vetor4[] = new int[3];
		Scanner teclado = new Scanner(System.in);

		for (int cont = 0; cont < vetor1.length; cont++) {
			System.out.print("Informe o primeiro numero para a conta do vetor de posi��o " + cont + "\n");
			vetor1[cont] = teclado.nextInt();
			System.out.print("Informe a opera��o da conta do vetor de posi��o " + cont + "\n");
			vetor2[cont] = teclado.next();
			System.out.print("Informe o segundo numero para a conta do vetor de posi��o " + cont + "\n");
			vetor3[cont] = teclado.nextInt();
		}

		teclado.close();
		for (int cont = 0; cont < vetor2.length; cont++) {
			switch (vetor2[cont]) {
			case "+":
				vetor4[cont] = vetor1[cont] + vetor3[cont];
				break;
			case "*":
				vetor4[cont] = vetor1[cont] * vetor3[cont];
				break;
			case "/":
				vetor4[cont] = vetor1[cont] / vetor3[cont];
				break;
			case "-":
				vetor4[cont] = vetor1[cont] - vetor3[cont];
				break;

			}
			System.out.println("A opera��o de" + vetor1[cont] + " " + vetor2[cont] + " " + vetor3[cont] + "na posi��o" + cont + "vale" + vetor4[cont]);
		}

	}
}
