package PilhaDupla;

public class Pilha {
	private Nodo primeiro;
	private Nodo ultimo;

	// Construtor da pilha
	public Pilha() {
		this.primeiro = null;
		this.ultimo = null;
	}

	// Verifica se a pilha esta vazia
	public boolean estaVazia() {
		return (this.primeiro == null);
	}

	// Retorna o tamanho da pilha
	public int tamanho() {
		int tamanho = 0;
		for (Nodo aux = this.primeiro; aux != null; aux = aux.getProximo()) {
			tamanho++;
		}
		return tamanho;
	}

	// Adicionar novo no no comeco da pilha
	public void empilhar(String valor) {
		Nodo novo = new Nodo(this.ultimo, valor, null);
		if (estaVazia())
			this.primeiro = novo;
		else
			this.ultimo.setProximo(novo);
		this.ultimo = novo;
	}

	// Remove no do comeco da pilha
	public Nodo desempilhar() {
		if (estaVazia())
			return null;
		else {
			Nodo topo = this.ultimo;
			this.ultimo = this.ultimo.getAnterior();
			this.ultimo.setProximo(null);
			return topo;
		}
	}

	// Retorna o elemento incluido mais recentemente na pilha
	public Nodo topo() {
		return this.ultimo;
	}

	// Limpa todos os elementos da pilha
	public void esvaziar() {
		this.primeiro = null;
		this.ultimo = null;
	}

	// Imprimir a pilha
	public void imprimir() {
		for (Nodo aux = this.ultimo; aux != null; aux = aux.getAnterior())
			System.out.println(aux.getPalavra());
	}
}
