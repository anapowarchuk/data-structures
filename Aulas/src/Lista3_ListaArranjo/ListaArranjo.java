package Lista3_ListaArranjo;

//criando uma lista vazia
public class ListaArranjo { 
	int[] lista; 
	int proximaPosicao; 

	public ListaArranjo(int tamanho) { 
		lista = new int[tamanho]; 
		proximaPosicao = 0;
	}

	//verificando se a lista está vazia
	public boolean estaVazia() { 
		if (proximaPosicao == 0) {
			return true;
		}
		return false;
	}

	//verificando se a lista está cheia
	public boolean estaCheia() { 
		if (proximaPosicao == lista.length) {
			return true;
		}
		return false;
	}

	//adicionando um nó na lista
	public boolean adicionar(int valor) {
		if (!estaCheia()) {
			lista[proximaPosicao++] = valor;
			return true;
		}
		return false;
	}
		
	//buscando um nó na lista
	public int buscar(int valor) {
		for(int i = 0; i <proximaPosicao; i++){
			if (valor == lista[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//alterando um nó na lista
	public boolean alterar (int valor, int novoValor) {
		int posicao = buscar (valor);
		if (posicao>=0){
		lista[posicao]= novoValor;
		return true;
		}
		return false;
}
	
	//removendo um nó na lista
	public boolean remover (int valor) {
		/*int posicao = buscar(valor);
		if (posicao >= 0){*/
		boolean troca = false;
		for (int i = 0; i < proximaPosicao; i++){
			if (valor == lista [i]){
				lista[i] = lista [i +1];
				troca = true;
				proximaPosicao--;
			}
			if (troca){
				lista [i] = lista [i+1];
			}
		}
		return troca;	
		}
	
	//imprimindo lista
	public void listar(){
		for (int i=0; i<proximaPosicao; i++) {
			System.out.println(lista[i]);
		}
	}

	
}