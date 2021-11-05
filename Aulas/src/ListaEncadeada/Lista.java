package ListaEncadeada;

public class Lista {
	private Nodo primeiro;
	
	// Construtor da lista
	public Lista() {
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
		if (posicao == 0) {
			adicionarInicio(valor);
		}
		else {
			int count = 0;
			Nodo aux = this.primeiro;
			do {
				aux = aux.getProximo();
				count++;
			} 
			while (count < posicao-1);
			if (aux.getProximo() == null)
				adicionarFinal(valor);
			else {
				if (estaVazia()) {
					this.primeiro = new Nodo(valor);
				}
				Nodo novo = new Nodo(valor, aux.getProximo());
				aux.setProximo(novo);
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
	public void removerValor(int valor) {
		Nodo aux = primeiro;        
        if (this.primeiro.getNumero() == valor) {
            this.primeiro = this.primeiro.getProximo();
        } 
        else {
            do {
                if (aux.getProximo().getNumero() == valor)
                    aux.setProximo(aux.getProximo().getProximo());
                else
                    aux = aux.getProximo();
            } 
            while(aux.getProximo() != null);                
        }
	}
	
	// Remover posicao
	public void removerPosicao(int posicao) {
		if (posicao == 0)
			this.primeiro = this.primeiro.getProximo();
		else {
			Nodo aux = this.primeiro;
			int count = 0;
			while (count < posicao-1) {
				aux = aux.getProximo();
				count++;
			}
			aux.setProximo(aux.getProximo().getProximo());
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