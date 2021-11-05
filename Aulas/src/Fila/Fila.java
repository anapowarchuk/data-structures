package Fila;

class Fila {
	private No primeiro;

	public Fila() {
		this.primeiro = null;
	}

	// retorna true se a fila estiver vazia, e false caso contrário
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	// retorna o número de elementos da fila
	public int tamanho() {
		int tamanho = 0;
		for (No aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			tamanho++;
		}

		return tamanho;
	}

	// insere o elemento valor no final da fila
	public void enfileirar(int valor) {
		if (estaVazia()) {
			this.primeiro = new No(valor);
		} else {
			No novoNo = new No(valor);
			No aux = this.primeiro;
			// Encontra o ultimo no da lista
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			// Coloca o novo no como o proximo do ultimo encontrado
			aux.setProximo(novoNo);

		}
	}

	// remove e retorna o elemento do início da fila, mas null se vazia
	public No desenfileirar() {
		if (estaVazia())
			return null;
		else {
			No topo = this.primeiro;
			this.primeiro = this.primeiro.getProximo();
			return topo;
		}
	}

	// retorna, mas não remove, o elemento do topo da fila, e null se vazia
	public No topo() {
		if (estaVazia()) {
			return null;
		} else {
			No topo = this.primeiro;
			this.primeiro = this.primeiro.getProximo();
			return topo;
		}
	}

	// esvazia a fila
	public void esvaziar() {
		this.primeiro = null;
	}
}
