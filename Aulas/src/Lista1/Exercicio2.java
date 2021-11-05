/*2) Crie um método que recebe um array de inteiros e um valor inteiro e retorna a quantidade de vezes
que este valor aparece no array. O método deve ter a seguinte assinatura: */
package Lista1;

public class Exercicio2 {

	public static void main(final String[] args) {
		int vetor[] = { 1, 2, 1, 4, 5 };
		int valor = 1;
		int qtdnum;
		qtdnum = contaOcorrenciasValor(vetor, valor);
		System.out.println(qtdnum);

	}

	public static int contaOcorrenciasValor(int[] vetor, int valor) {
		int num = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				num += 1;
			}
		}
		return num;
	}
}