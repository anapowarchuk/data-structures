package Lista5_ListaDuplamenteEncadeada;

public class No {
	private No anterior;
	private int numero;
	private No proximo;

	public No(No anterior, int numero, No proximo) {
		super();
		this.anterior = anterior;
		this.numero = numero;
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
