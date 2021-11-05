package MetodosDeOrdenacao;

public class ShellSort {
	public static void main(String[] args) {
		int[] vetor = { 9, 5, 7, 2, 1, 14, 3 };

		System.out.println("VETOR INICIALIZADO");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("[ " + vetor[i] + " ]");
		}

		System.out.println("\n\n");
		System.out.println("Shell Sort");
		ShellSort(vetor);

	}

	public static void ShellSort(int[] vetor) {
		for (int h = vetor.length / 2; h > 0; h /= 2) {
			for (int i = h; i < vetor.length; i++) {
				int temp = vetor[i];
				int j = i;
				while (j >= h && vetor[j - h] > temp) {
					vetor[j] = vetor[j - h];
					j -= h;
				}
				vetor[j] = temp;
			}
		}
		for (int l = 0; l < vetor.length; l++) {
			System.out.print("[ " + vetor[l] + " ]");
		}
	}
}
