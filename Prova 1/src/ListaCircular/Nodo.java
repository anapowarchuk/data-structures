package ListaCircular;

public class Nodo {
	private int numero;
	private Nodo anterior;
	private Nodo proximo;
	
	public Nodo (int numero) {
	this.anterior=null;
	this.proximo=null;
	this.numero= numero;
	}
	
	public Nodo (int numero, Nodo anterior, Nodo proximo) {
		this.anterior = anterior;
		this.numero = numero;
		this.proximo = proximo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	
	
}
