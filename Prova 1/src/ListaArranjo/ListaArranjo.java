package ListaArranjo;

public class ListaArranjo {

	public String[] lista;
	public int proximaPosicao;

	public ListaArranjo(int tamanho) {
		lista = new String[tamanho];
		proximaPosicao = 0;

	}

	// verificando se a lista está vazia
	public boolean estaVazia() {
		if (proximaPosicao == 0) {
			return true;
		}
		return false;
	}

	// verificando se a lista está cheia
	public boolean estaCheia() {
		if (proximaPosicao == lista.length) {
			return true;
		}
		return false;
	}

	// adicionando um nó na lista
	public void adicionar(String nome) {
		if (!estaCheia()) {
			lista[proximaPosicao++] = nome;
		}
	}

	// buscando um nó na lista
	public int buscar(String nome) {
		for (int i = 0; i < proximaPosicao; i++) {
			if (lista[i] == nome) {
				return i;
			}
		}
		return -1;
	}

	// alterando um nó na lista
	public void alterar(String nome, String novoNome) {
		int indice = buscar(nome);
		String novoNOme = null;
		if (indice >= 0) {
			lista[indice] = novoNOme;
		}
	}

	// removendo um nó na lista
	public void remover(String nome) {
		boolean troca = false;
		for (int i = 0; i < proximaPosicao; i++) {
			if (lista[i].equals(nome)) {
				troca = true;
				if (i + 1 < lista.length) {
					lista[i] = lista[i + 1];
				}
				proximaPosicao--;
			}
			if (troca) {
				if (i + 1 < lista.length) {
					lista[i] = lista[i + 1];
					if (lista[i] != null) {
						break;
					}
				}
			}
		}
	}

	// imprimindo lista
	public void imprimir() {
		for (int i = 0; i < proximaPosicao; i++) {
			System.out.println("[ " + lista[i] + " ]");
		}
	}

	// limpa a lista
	public void limpar() {
		this.proximaPosicao = 0;
	}

	// adicionando em determinada posição
	public void adicionarPosicao(String nome, int posicao) {
		if (!estaCheia()) {
			if (posicao > 0 && posicao < proximaPosicao) {
				if (posicao == 0) {
					lista[posicao] = nome;
				} else {
					for (int i = 0; i < posicao; i++) {
						lista[i] = lista[i - 1];
					}
					lista[posicao] = nome;
				}
			}
		}
	}
}
