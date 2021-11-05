package ListaDuplaEncadeada;

public class Lista {
	private No primeiro;
	private No ultimo;

	public Lista() {
		this.primeiro = null;
		this.ultimo = null;
	}

	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}

	public void imprimir () {
		No aux=this.primeiro;
		for (aux=this.primeiro; aux != null; aux.getProximo()) {
			System.out.println(aux.getNumero() + " ");
		}
	}
	
	public void imprimirContrario () {
		No aux = this.ultimo;
		for (aux=this.ultimo; aux != null; aux.getAnterior()) {
			System.out.println(aux.getNumero() + " ");
		}
	}
	
	public void adicionarInicio(int valor) {
		No aux = new No(valor, null, this.primeiro);
		if (estaVazia()) {
			this.ultimo = aux;
		} else
			this.primeiro.setAnterior(aux);
		this.primeiro = aux;
	}
	
	public void adicionarPosicao (int posicao, int valor) {
		if (posicao == 0) {
			adicionarInicio (valor);
		}
		else {
			No anterior = this.primeiro;
			int cont = 0;
			while (cont <posicao-1) {
				anterior=anterior.getProximo();
				cont++;
			}
			if ( anterior.getProximo() == null) 
				adicionarFinal (valor);
			else {
				No novo = new No (valor, anterior, anterior.getProximo())
				anterior.getProximo().setAnterior(novo);
				anterior.setProximo(novo);
			}
		}
	}
	
	public void adicionarFinal (int valor) {
		No novo =  new No (valor ) {
	}
}


