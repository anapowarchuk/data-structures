package Lista4_ListaEncadeada;

public class ListaE {
	private Nodo primeiro;
	
	// Construtor da lista
	public ListaE() {
		this.primeiro = null;
	}
	// Verifica se a lista esta vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}
	
	// Adicionar novo no no comeco da lista
	public void adicionarInicio(int valor){ 
		Nodo novo = new Nodo(valor, this.primeiro);
		this.primeiro = novo;
	}
	
	// Adicionar novo no em uma posicao
	public void adicionarPosicao(int valor, int posicao) {
		Nodo novoNo = new Nodo(valor);
		Nodo aux= this.primeiro;
		
		if (estaVazia() || posicao==0) {
			novoNo.setProximo(primeiro);
			this.primeiro=novoNo;
		}
		else {
			int aux2=0;
			while (aux.getProximo() != null) {
				if (aux2==posicao) {
					novoNo.setProximo(aux.getProximo());
					aux.setProximo(novoNo);
					break;
				}
				aux= aux.getProximo();
				aux2++;
			}
			if (aux.getProximo()==null) {
				adicionarFinal(valor);
			}
		}
	}
	
	// Adiciona novo no no final da lista
	public void adicionarFinal(int valor) {
		if (estaVazia()) {
			this.primeiro = new Nodo(valor);
		}
		else {
			Nodo novoNo = new Nodo(valor);
			Nodo aux = this.primeiro;
			// Encontra o ultimo no da lista
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			// Coloca o novo no como o proximo do ultimo encontrado
			aux.setProximo(novoNo);
		}
	}
	
	// Busca no
	public Nodo buscar(int valor) {
		for(Nodo aux = primeiro; aux != null; aux = aux.getProximo()){
		    if (aux.getNumero() == valor)
				return aux;
		}
        return null;
	}
	
	// Altera no
	public void alterar(int valor, int novoValor) {
		Nodo aux = buscar(valor);
		if (aux != null) {
			aux.setNumero(novoValor);
		}
	}
	
	// Remove no
	public void remover(int valor) {
		if (this.primeiro.getNumero() == valor){
			this.primeiro = this.primeiro.getProximo();
		}
		else {
			for(Nodo aux = primeiro; aux != null; aux = aux.getProximo()){
				Nodo proximo= aux.getProximo();
				if (proximo.getNumero() == valor) {
					aux.setProximo(proximo.getProximo());
				}
					
				}
			}
	}
	
	// Imprime a lista
	public void imprimir() {
		Nodo aux;
		for (aux = primeiro; aux != null; aux = aux.getProximo()){
		    System.out.println(aux.getNumero());
		}
    }
}