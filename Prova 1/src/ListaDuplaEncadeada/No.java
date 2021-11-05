package ListaDuplaEncadeada;

public class No {
	private int numero;
	private No anterior;
	private No proximo;
	
	public No (int numero) {
	this.anterior=null;
	this.proximo=null;
	this.numero= numero;
	}
	
	public No (int numero, No anterior, No proximo) {
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

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
