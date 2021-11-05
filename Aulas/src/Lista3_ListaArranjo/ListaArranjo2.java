package Lista3_ListaArranjo;

public class ListaArranjo2 { 
	String[] lista; 
	int proximaPosicao; 

	public ListaArranjo2(int tamanho) { 
		lista = new String [tamanho]; 
		proximaPosicao = 0;
	}

	//verificando se a lista est� vazia
	public boolean estaVazia() { 
		if (proximaPosicao == 0) {
			return true;
		}
		return false;
	}

	//verificando se a lista est� cheia
	public boolean estaCheia() { 
		if (proximaPosicao == lista.length) {
			return true;
		}
		return false;
	}

	//adicionando um n� na lista
	public boolean adicionar(String nome) {
		if (!estaCheia()) {
			lista[proximaPosicao++] = nome;
			return true;
		}
		return false;
	}
		
	//buscando um n� na lista
	public int buscar(String nome) {
		for(int i = 0; i <proximaPosicao; i++){
			if (nome == lista[i]) {
				return i;
			}
		}
		return -1;
	}
	
	//alterando um n� na lista
	public boolean alterar (String nome, String novoNome) {
		int posicao = buscar (nome);
		if (posicao>=0){
		lista[posicao]= novoNome;
		return true;
		}
		return false;
}
	
	//removendo um n� na lista
	public void remover(String nome) {
		boolean troca = false;
		for (int i = 0; i < proximaPosicao; i++) {
			// Se for o valor que procuramos
			if (!estaVazia() && lista[i] == nome) {
				troca = true;
				if (i+1 < lista.length) {
					lista[i] = lista[i+1];
				}
				proximaPosicao--;
			}
			// Se for um valor de uma posicao subsequente
			if (troca) {
				if (i+1 < lista.length) {
					lista[i] = lista[i+1];
					if (estaVazia()) {
						break;
					} 
				}
			}
		}
	}
	
	//imprimindo lista
	public void listar(){
		for (int i=0; i<proximaPosicao; i++) {
			System.out.println(lista[i]);
		}
	}

	
}