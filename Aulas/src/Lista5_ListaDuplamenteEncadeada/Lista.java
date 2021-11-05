package Lista5_ListaDuplamenteEncadeada;

public class Lista {

	private No primeiro;
	private No ultimo;

	public Lista() {
		super();
		this.primeiro = primeiro;
		this.ultimo = null;
	}

	// Adiciona um novo nó no começo da lista
	public void adicionarInicio(int valor) {
		No aux = new No(null, valor, this.primeiro);
		this.primeiro.setAnterior(aux);
		if (estaVazia() == true) {
			this.ultimo = aux;
		}
		this.primeiro = aux;
	}

	// Adiciona novo nó em posição determinada da lista
	public void adicionarPosicao(int valor1, int valor2) {
		No aux = buscarPrimeira(valor1);
		if (aux != null) {
			No auxiliar = new No(aux, valor2, aux.getProximo());
			if (aux.getProximo() != null) {
				aux.getProximo().setAnterior(auxiliar);
			}
			aux.setProximo(auxiliar);
		} else
			System.out.println("Posição inexistente");
	}

	// Adiciona novo nó no final da lista
	public void adicionarFim(int valor) {
		No aux = new No(this.ultimo, valor, null); // instanciando
		if (estaVazia() == true) {
			this.primeiro = aux;
		} else {
			this.ultimo.setProximo(aux);
		}
		this.ultimo = aux;
	}

	// Busca um nó na lista, retornando primeira ocorrência
	public No buscarPrimeira(int valor) {
		No aux;
		aux = this.primeiro;
		for (aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getNumero() == valor)
				return aux;
		}
		return null;
	}

	// Busca um nó na lista, retornando última ocorrência
	public No buscarUltima(int valor) {
		No aux;
		aux = this.ultimo;
		for (aux = primeiro; aux != null; aux = aux.getAnterior()) {
			if (aux.getNumero() == valor)
				return aux;
		}
		return null;
	}

	// Altera um nó da lista
	public void alterar(int valor, int novoValor) {
		No aux = buscarPrimeira(valor);
		if (aux != null) {
			aux.setNumero(novoValor);
		}
	}

	// Imprime todos os nós, em ordem normal
	public void imprimir() {
		No auxiliar;
		for (auxiliar = primeiro; auxiliar != null; auxiliar = auxiliar.getProximo()) {
			System.out.println(auxiliar.getNumero());
		}
	}

	// Imprimir todos os nós, em ordem inversa
	public void imprimirInverso() {
		No auxiliar;
		auxiliar = this.ultimo;
		for (auxiliar = primeiro; auxiliar != null; auxiliar = auxiliar.getAnterior()) {
			System.out.println(auxiliar.getNumero());
		}
	}

	// Remove no na primeira ocorrência
	public void removerPrimeira(int valor) {
		No prim = this.primeiro;
		if (prim.getNumero() != valor) {
			for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
				if (aux.getNumero() == valor) {
					aux.getAnterior().setProximo(aux.getProximo());
					aux.getProximo().setAnterior(aux.getAnterior());
				}
			}
		} else {
			this.primeiro = prim.getProximo();
		}
	}

	// Remove na ultima ocorrência
	public void removeeUltimo(int valor) {
		No ult = this.ultimo;
		if (ultimo.getNumero() != valor) {
			for (No aux = ultimo; aux != null; aux = aux.getAnterior()) {
				if (aux.getNumero() == valor) {
					aux.getAnterior().setProximo(aux.getProximo());
					aux.getProximo().setAnterior(aux.getAnterior());
				}
			}
		} else {
			this.ultimo = ult.getAnterior();
			ult.getAnterior().setProximo(null);
		}
	}

	// Remove em uma determinada posição
	public void removerPosicao(int posicao) {
		int cont = 0;

		if (cont != posicao) {
			for (No aux = primeiro; aux != null; aux = aux.getProximo()) {
				if (cont + 1 == posicao) {
					No remover = aux.getProximo();
					aux.setProximo(remover.getProximo());
					remover.getProximo().setAnterior(aux);
				}
				cont++;
			}
		}

		else {
			No primeiro = this.primeiro;
			this.primeiro = primeiro.getProximo();
			primeiro.getProximo().setAnterior(null);
		}
	}

	// Limpar lista
	public void limparLista() {
		this.primeiro = null;
		this.ultimo = null;
	}

	// Verifica se a lista esta vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

}