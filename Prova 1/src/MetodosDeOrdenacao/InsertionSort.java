package MetodosDeOrdenacao;

public class InsertionSort {

	public static void main(String[] args) {
		int[] vetor = { 9, 5, 7, 2, 1, 14, 3 };

		System.out.println("VETOR INICIALIZADO");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("[ " + vetor[i] + " ]");
		}

		System.out.println("\n\n");
		System.out.println("Insertion Sort");
		InsertionSort(vetor);

	}

	public static void InsertionSort(int[] vetor) {
		for (int i = 1; i < vetor.length; i++) {
			int ultimo = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > ultimo) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = ultimo;
		}
		for (int l = 0; l < vetor.length; l++) {
			System.out.print("[ " + vetor[l] + " ]");
		}
	}
}
