package ListaCircular;

public class ListaCircular {
	private Nodo primeiro;
	
	// Construtor da lista
	public ListaCircular() {
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
		if (estaVazia())
			novo.setProximo(novo);
		else {
			Nodo ultimo = ultimo();
			ultimo.setProximo(novo);
		}
		this.primeiro = novo;
	}
	
	// Adiciona novo no no final da lista
	public void adicionarFinal(int valor) {
		Nodo novo = new Nodo(valor, this.primeiro);
		if (estaVazia()) {
			novo.setProximo(novo);
			this.primeiro = novo;
		}
		else {
			Nodo ultimo = ultimo();
			ultimo.setProximo(novo);
		}
		
	}
	
	// Adicionar novo no em uma posicao
	public void adicionarPosicao(int valor, int posicao) {
		if (estaVazia() || (posicao == 0)) {
			adicionarInicio(valor);
		}
		else {
			int count = 1;
			Nodo aux = this.primeiro;
			while (count < posicao) {
				aux = aux.getProximo();
				count++;
			} 
			if (aux.getProximo() == this.primeiro)
				adicionarFinal(valor);
			else {
				Nodo novo = new Nodo(valor, aux.getProximo());
				aux.setProximo(novo);
			}
		}	
	}
	
	// Imprime a lista
	public void imprimir() {
		Nodo aux = this.primeiro;
		do {
		    System.out.println(aux.getNumero());
		    aux = aux.getProximo();
		} while (aux != this.primeiro);
    }
	
	// Busca no
	public Nodo buscar(int valor) {
		Nodo aux = this.primeiro;
		do {
		    if (aux.getNumero() == valor)
		    	return aux;
		    aux = aux.getProximo();
		} while (aux != this.primeiro);
        return null;
	}
	
	// Altera no
	public void alterar(int valor, int novoValor) {
		Nodo aux = buscar(valor);
		if (aux != null) {
			aux.setNumero(novoValor);
		}
	}
	
	// Remove no (inicio)
	public void removerInicio(int valor) {
		Nodo aux = this.primeiro;        
        if (this.primeiro.getNumero() == valor) {
        	Nodo ultimo = ultimo();
        	this.primeiro = this.primeiro.getProximo();
            ultimo.setProximo(this.primeiro);
        } 
        else {
            do {
                if (aux.getProximo().getNumero() == valor) {
                    aux.setProximo(aux.getProximo().getProximo());
                	break;
                }
                else
                    aux = aux.getProximo();
            } 
            while(aux.getProximo() != this.primeiro);                
        }
	}
	
	// Remover no (final)
	public void removerFinal(int valor) {
		Nodo aux = this.primeiro;      
		Nodo penultimo = null;
		
		if (aux.getNumero() == valor)
			penultimo = ultimo();
        do {
        	if (aux.getProximo().getNumero() == valor)
        		penultimo = aux;
        	aux = aux.getProximo();
        } while (aux.getProximo() != this.primeiro);
        	
        if (penultimo != null) {
        	if (penultimo.getProximo() == this.primeiro)
        		this.primeiro = penultimo.getProximo().getProximo();
        	penultimo.setProximo(penultimo.getProximo().getProximo());
        }
	}
	
	
	// Busca ultima posicao
	public Nodo ultimo() {
		Nodo ultimo = this.primeiro;
		while (ultimo.getProximo() != this.primeiro) {
			ultimo = ultimo.getProximo();
		}
		return ultimo;
	}

}	