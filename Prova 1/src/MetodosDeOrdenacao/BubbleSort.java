package MetodosDeOrdenacao;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = {9,5,7,2,1,14,3};
		
		System.out.println("VETOR INICIALIZADO");
		for (int i = 0; i< vetor.length; i++) {
			System.out.print("[ " + vetor[i] + " ]");
		}
		
		System.out.println("\n\n");
		System.out.println("ORDENAÇÃO POR TROCA");
		System.out.println("Bubble Sort");
		bubbleSort(vetor);

				
	}
	
	public static void bubbleSort (int[]vetor) {
		for (int i=0; i<vetor.length; i++) {
			for (int j=1; j <vetor.length-i; j ++ ) {
				if (vetor[j-1]>vetor[j]) {
					int aux = vetor [j-1];
					vetor[j-1] = vetor [j];
					vetor[j] = aux;
				}
			}
		}
		for (int l=0; l< vetor.length; l++) {
			System.out.print("[ " + vetor[l] + " ]");
		}
			
	}
}
	
	