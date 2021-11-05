package PilhaDup;

public class Pilha {
	private No topo;
	private No base;

	public Pilha() {
		this.topo = null;
		this.base = null;
	}

	// verifica se a pilha está vazia
	public boolean isEmpty() {
		if (this.base == null)
			return true;
		return false;
	}

	// tamanho da pilha
	public int size() {
		int cont = 0;
		for (No aux = this.topo; aux != null; aux.getProximo()) {
			cont++;
		}
		return cont;

	}

	// imprime a pilha
	public void imprimir() {
		for (No aux = this.topo; aux != null; aux = aux.getProximo()) {
			System.out.println(aux.getLetra());
		}
	}

	// adiciona novo elemento na base da pilha
	public void pushB(String letra) {
		No aux = new No(this.base, null, letra);
		if (isEmpty()) {
			this.topo = aux;
		} else {
			this.base.setProximo(aux);
		}
		this.base = aux;
	}

	// a base é removida e retorna a nova base
	public No popB() {
		if (isEmpty()) {
			return null;
		} else {
			this.base = this.base.getAnterior();
			this.base.setProximo(null);

			return this.base;

		}
	}

	// retorna a base
	public No topB() {
		if (isEmpty()) {
			return null;
		} else {
			this.base.setAnterior(null);
			this.base.setProximo(null);
			return this.base;

		}
	}

	// limpa
	public void clear() {
		this.base = null;
		this.topo = null;
	}

	// limpa recursivamente
	public void clearR() {
		if (this.topo != null) {
			this.topo = this.topo.getProximo();
			clearR();
		}
	}

}
