package Lista6_ListaCircular;

public class NoS {

	private int numero;
	private NoS proximo;

	public NoS(int numero) {
		this.numero = numero;
		this.proximo = null;
	}

	public NoS(int numero, NoS proximo) {
		this.numero = numero;
		this.proximo = proximo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public NoS getProximo() {
		return proximo;
	}

	public void setProximo(NoS proximo) {
		this.proximo = proximo;
	}

}
