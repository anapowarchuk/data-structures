package Lista6_ListaCircular;

public class ListaSimples {
	private NoS primeiro;

	//Construtor da Lista
	public ListaSimples(NoS primeiro) {
		super();
		this.primeiro = primeiro;
	}

	// Adicionar novo no no comeco da lista
	public void adicionarInicio(int valor) {
		NoS novo = new NoS(valor, this.primeiro);
		if (estaVazia()) {
			novo.setProximo(novo);
		} else {
			NoS ultimo = buscaUltimo();
			ultimo.setProximo(novo);
		}
	}

	//Adiciona novo elemento em posição determinada
	public void adicionarPosicao(int valor, int posicao) {
		NoS novoNo = new NoS(valor);
		NoS aux= this.primeiro;
		
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
		NoS ultimo = buscaUltimo();
		NoS aux = new NoS(valor);
		if (estaVazia()) {
			aux.setProximo(aux);
		} else {
			ultimo.setProximo(aux);
			aux.setProximo(ultimo);
		}
	}

	// Busca no
	public NoS buscar(int valor) {
		for (NoS aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getNumero() == valor)
				return aux;
		}
		return null;
	}

	// Busca o ultimo nó
	public NoS buscaUltimo() {
		NoS aux;
		for (aux = this.primeiro; aux.getProximo() != this.primeiro; aux = aux.getProximo()) {

		}
		return aux; // retorna o ultimo
	}

	// Altera no
	public void alterar(int valor, int novoValor) {
		NoS aux = buscar(valor);
		if (aux != null) {
			aux.setNumero(novoValor);
		}
	}

	// Imprime a lista
	public void imprimir() {
		NoS aux;
		for (aux = primeiro; aux != null; aux = aux.getProximo()) {
			System.out.println(aux.getNumero());
		}
	}

	// Remover um determinado elemento da lista (primeira ocorrência)
	public void remover(int valor) {
		if (this.primeiro.getNumero() == valor) {
			this.primeiro = this.primeiro.getProximo();
		} 
		else {
			for (NoS aux = primeiro; aux != null; aux = aux.getProximo()) {
				NoS proximo = aux.getProximo();
				if (proximo.getNumero() == valor) {
					aux.setProximo(proximo.getProximo());
				}

			}
		}
	}

	// Remover um determinado elemento da lista (última ocorrência)
	public void removerUltimo(int valor) {
		if (this.primeiro.getNumero() == valor) {
			this.primeiro = this.primeiro.getProximo();
		} 
		else {
			NoS ultimo = buscaUltimo();
			for (NoS aux = primeiro; aux != ultimo; aux = aux.getProximo()) {
				NoS proximo = aux.getProximo();
				if (proximo.getNumero() == valor) {
					aux.setProximo(proximo.getProximo());
				}

			}
		}
	}
	
	//Limpar a lista
	public void limpar() {
		this.primeiro=null;
	}
	
	// Verifica se a lista esta vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}
	
	
}