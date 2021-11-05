package Vetores;

import java.lang.Math;

public class gabarito {

	public static void main(String[] args) {
		int valor = 2;
		int[] vetor = { 1, 2, -3, 4 };
		int[] vetor2 = { 4, -3, 2, 1 };
		char[] operacoes = { '-', '+', '/', '*' };
		String[] vetorA = { "Estrutura de", "Programacao Orientada a" };
		String[] vetorB = { "Dados", "Objetos" };
		int[][] matriz = preencherMatriz(10);

		System.out.println("1. " + contaElementosNegativos(vetor));
		System.out.println("2. " + contaOcorrenciasValor(vetor, valor));
		System.out.println("3. " + temElementosDistintos(vetor));
		System.out.println("4. " + retornaPosicaoMaiorElemento(vetor));
		System.out.println("5. a) " + media(vetor));
		System.out.println("5. b) " + desvioPadrao(vetor));
		System.out.println("6. " + imprimeVetor(fibonacci(8)));
		System.out.print("7. ");
		combinacoes(vetorA, vetorB);
		System.out.print("8.");
		primos(vetor);
		System.out.println("\n9." + imprimeVetor(operacoes(vetor, vetor2, operacoes)));
		System.out.println("10. a)");
		imprimeMatriz(matriz);
		System.out.println("10. b) " + imprimeDiagonalPrincipal(matriz));
		System.out.println("10. c) " + imprimeDiagonalSecundaria(matriz));
		System.out.println("10. d) " + minimax(matriz));

	}

	/* Questao 1 */
	public static int contaElementosNegativos(int[] vetor) {
		int negativos = 0;

		for (int i = 0; i < vetor.length; i++)
			if (vetor[i] < 0)
				negativos++;

		return negativos;
	}

	/* Questao 2 */
	public static int contaOcorrenciasValor(int[] vetor, int valor) {
		int ocorrencias = 0;

		for (int i = 0; i < vetor.length; i++)
			if (vetor[i] == valor)
				ocorrencias++;

		return ocorrencias;
	}

	/* Questao 3 */
	public static boolean temElementosDistintos(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			for (int j = i + 1; j < vetor.length; j++)
				if (vetor[i] == vetor[j])
					return false;

		return true;
	}

	/* Questao 4 */
	public static int retornaPosicaoMaiorElemento(int[] vetor) {
		int posicao = 0;

		for (int i = 1; i < vetor.length; i++)
			if (vetor[posicao] < vetor[i])
				posicao = i;

		return posicao;
	}

	/* Questao 5a */
	public static double media(int[] vetor) {
		int somatoria = 0;

		for (int i = 0; i < vetor.length; i++) {
			somatoria += vetor[i];
		}

		return (double) somatoria / vetor.length;
	}

	/* Questao 5b */
	public static double desvioPadrao(int[] vetor) {
		double somatoria = 0;
		double media = media(vetor);

		for (int i = 0; i < vetor.length; i++) {
			somatoria += Math.pow(vetor[i] - media, 2);
		}

		return Math.sqrt(somatoria / (vetor.length - 1));
	}

	/* Questao 6 */
	public static int[] fibonacci(int n) {
		int[] fibonacci = new int[n];

		for (int i = 0; i < n; i++) {
			if (i < 2)
				fibonacci[i] = i;
			else
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		return fibonacci;
	}

	/* Questao 7 */
	public static void combinacoes(String[] vetorA, String[] vetorB) {
		for (int i = 0; i < vetorA.length; i++)
			for (int j = 0; j < vetorB.length; j++)
				System.out.println(vetorA[i] + " " + vetorB[j]);
	}

	/* Questao 8 */
	public static void primos(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			boolean primo = true;
			for (int j = 2; j < vetor[i]; j++)
				if (vetor[i] % j == 0)
					primo = false;
			if (primo && vetor[i] > 0)
				System.out.print(" " + vetor[i]);
		}
	}

	/* Questao 9 */
	public static double[] operacoes(int[] vetor1, int[] vetor2, char[] operacoes) {
		double[] resultado = new double[vetor1.length];
		for (int i = 0; i < vetor1.length; i++)
			switch (operacoes[i]) {
			case '+':
				resultado[i] = vetor1[i] + vetor2[i];
				break;
			case '-':
				resultado[i] = vetor1[i] - vetor2[i];
				break;
			case '*':
				resultado[i] = vetor1[i] * vetor2[i];
				break;
			case '/':
				if (vetor2[i] != 0)
					resultado[i] = (double) vetor1[i] / vetor2[i];
				break;
			default:
				resultado[i] = 0;
			}
		return resultado;
	}

	/* Questao 10a */
	private static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			System.out.println(imprimeVetor(matriz[i]));
	}

	/* Questao 10b */
	private static String imprimeDiagonalPrincipal(int[][] matriz) {
		String imprimir = "";

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				if (i == j) {
					imprimir = imprimir.concat(formatar(matriz[i][j])).concat(" ");
				}

		return imprimir;
	}

	/* Questao 10c */
	private static String imprimeDiagonalSecundaria(int[][] matriz) {
		String imprimir = "";

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				if (i + j == matriz.length - 1)
					imprimir = imprimir.concat(formatar(matriz[i][j])).concat(" ");

		return imprimir;
	}

	/* Questao 10d */
	private static int minimax(int[][] matriz) {
		int maior = matriz[0][0];
		int linha = 0;
		int menor;

		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
				}

		menor = matriz[linha][0];
		for (int j = 1; j < matriz.length; j++)
			if (matriz[linha][j] < menor)
				menor = matriz[linha][j];

		return menor;
	}

	/* Metodo generico para imprimir vetor */
	public static String imprimeVetor(int[] vetor) {
		String imprimir = "";

		for (int i = 0; i < vetor.length; i++)
			imprimir = imprimir.concat(formatar(vetor[i])).concat(" ");

		return imprimir;
	}

	/* Metodo generico para imprimir vetor */
	public static String imprimeVetor(double[] vetor) {
		String imprimir = "";

		for (int i = 0; i < vetor.length; i++)
			imprimir = imprimir.concat(Double.toString(vetor[i])).concat(" ");

		return imprimir;
	}

	/* Metodo para preencher matriz n x n */
	private static int[][] preencherMatriz(int n) {
		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matriz[i][j] = (int) (Math.random() * 100);

		return matriz;
	}

	/* Metodo para arrumar numeros */
	private static String formatar(int n) {
		if (n < 10)
			return "0" + n;
		else
			return Integer.toString(n);
	}

}
