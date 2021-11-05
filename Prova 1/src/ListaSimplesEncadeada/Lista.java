package ListaSimplesEncadeada;

public class Lista {
	private No primeiro;

	public Lista() {
		this.primeiro = null;
	}

	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	public void adicionarInicio(int numero) {
		No aux = new No(numero, this.primeiro);
		this.primeiro = aux;
	}

	public void adicionarPosicao(int numero, int posicao) {
		if (posicao == 0) {
			adicionarInicio(numero);
		} else {
			int cont = 0;
			No aux = this.primeiro;
			do {
				aux = aux.getProximo();
				cont++;
			} while (cont < posicao - 1);
			if (aux.getProximo() == null) {
				adicionarFinal(numero);
			} else {
				if (estaVazia()) {
					this.primeiro = new No(numero);
				}
				No novo = new No(numero, aux.getProximo());
				aux.setProximo(novo);
			}
		}
	}

	public void adicionarFinal(int numero) {
		if (estaVazia()) {
			adicionarInicio(numero);
		} else {
			No novoNo = new No(numero);
			No aux = this.primeiro;
			encontraUltimo(aux);
			aux.setProximo(novoNo);
		}
	}

	public No encontraUltimo(No aux) {
		while (aux.getProximo() != null) {
			aux = aux.getProximo();
		}
		return aux;
	}

	public No buscar(int numero) {
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getValor() == numero)
				return aux;
		}
		return null;
	}

	public void alterar(int numero, int novoNumero) {
		No aux = buscar(numero);
		if (aux != null) {
			aux.setValor(novoNumero);
		}
	}

	public void imprimir() {
		for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
			System.out.println(aux.getValor() + " ");
		}
	}

	public void remover(int numero) {
		No aux = primeiro;
		if (this.primeiro.getValor() == numero) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			do {
				if (aux.getProximo().getValor() == numero)
					aux.setProximo(aux.getProximo().getProximo());
				else
					aux = aux.getProximo();
			} while (aux.getProximo() != null);
		}
	}

	public void removerPosicao(int numero, int posicao) {
		if (posicao == 0) {
			this.primeiro = this.primeiro.getProximo();
		} else {
			No aux = this.primeiro;
			int cont = 0;
			while (cont < posicao - 1) {
				aux = aux.getProximo();
				cont++;
			}
			aux.setProximo(aux.getProximo().getProximo());
		}
	}
}
