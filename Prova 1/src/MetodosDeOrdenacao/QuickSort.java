package MetodosDeOrdenacao;

public class QuickSort {

	public static void main(String[] args) {
		int[] vetor = {7, 2, 1, 8, 6, 3, 5, 4};
		int i; 
		
		vetor = quickSort(vetor, 0, vetor.length-1);
		
		for (i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		
	}

	// Quick sort
	public static int[] quickSort(int vetor[], int indexInicial, int indexFinal) {
		// Verifica se (j = pivot) ou (k = pivot) - condicao de parada dos passos 3 e 4
		if (indexInicial < indexFinal) {
			// Escolhe uma posicao pivot
	        int indexPivot = encontraPivot(vetor, indexInicial, indexFinal);
	        
	        // Divide o vetor em duas partes com base no pivot e chama recursivamente
	        quickSort(vetor, indexInicial, indexPivot-1); // Passo 3
	        quickSort(vetor, indexPivot+1, indexFinal); // Passo 4
	    }
		return vetor;
	}
	
	// Escolhe o pivot e coloca todos os elementos menores a direita
	public static int encontraPivot(int vetor[], int indexInicial, int indexFinal) {
	    // Passo 1 - Colocamos o pivot como o ultimo elemento do vetor, 
		// para trocar apenas os elementos maiores que o elemento pivot
		int pivot = vetor[indexFinal];
		// Posicao onde o nosso pivot deve ficar depois das trocas
	    int i = (indexInicial-1); 
	 
	    // Passo 2 - Para cada elemento do vetor (ou sub-vetor)
	    for (int j = indexInicial; j < indexFinal; j++) {
	    	// Se o elemento menor que o elemento pivot
	        if (vetor[j] <= pivot) {
	        	// incrementa a posicao i
	        	i++;
	        	
	        	// troca o elemento menor 
	        	int troca = vetor[i];
	            vetor[i] = vetor[j];
	            vetor[j] = troca;
	        }
	    }
	    
	    // Coloca o elemento pivot na posicao posterior ao ultimo elemento menor que o elemento pivot
	    int swapTemp = vetor[i+1];
	    vetor[i+1] = vetor[indexFinal];
	    vetor[indexFinal] = swapTemp;
	 
	    return i+1;
	}
}
