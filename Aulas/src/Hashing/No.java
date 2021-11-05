package Hashing;

public class No {

	private Stop letra;
	No proximo;

	public No(Stop letra) {
		super();
		this.letra = letra;
		this.proximo = null;
	}

	public No(Stop letra, No proximo) {
		super();
		this.letra = letra;
		this.proximo = proximo;
	}

	public Stop getLetra() {
		return letra;
	}

	public void setLetra(Stop letra) {
		this.letra = letra;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

}