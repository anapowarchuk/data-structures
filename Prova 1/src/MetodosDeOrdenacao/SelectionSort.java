package MetodosDeOrdenacao;

public class SelectionSort {

	public static void main(String[] args) {
		int[] vetor = {9,5,7,2,1,14,3};
		
		System.out.println("VETOR INICIALIZADO");
		for (int i = 0; i< vetor.length; i++) {
			System.out.print("[ " + vetor[i] + " ]");
		}
		
		System.out.println("\n\n");
		System.out.println("Selection Sort");
		SelectionSort(vetor);

				
	}
	
	public static void SelectionSort (int[]vetor) {
		for (int i=0; i<vetor.length; i++) {
			int min=i;
			for (int j=i+1; j <vetor.length; j ++ ) {
				if (vetor[min]>vetor[j]) {
					min=j;
				}
			}
			int trocaMin = vetor[min];
			vetor[min]=vetor[i];
			vetor[i]=trocaMin;
		}
		for (int l=0; l< vetor.length; l++) {
			System.out.print("[ " + vetor[l] + " ]");
		}
			
	}
}
	

