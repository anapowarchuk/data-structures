package Lista4_ListaEncadeada;

public class Nodo {

	private int numero;
	private Nodo proximo;

	public Nodo(int num) {
		this.numero = num;
		this.proximo = null;
	}

	public Nodo(int num, Nodo prox) {
		this.numero = num;
		this.proximo = prox;
	}

	public int getNumero() { // metodo que recupera o atributo numero
		return numero;
	}

	public void setNumero(int numero) { //Métodos para informar sobre o atributo numero
		this.numero = numero;
	}

	public Nodo getProximo() { // metodo que recupera o atributo proximo
		return proximo;
	}

	public void setProximo(Nodo proximo) { //Métodos para informar sobre o atributo proximo
		this.proximo = proximo;
	}
}