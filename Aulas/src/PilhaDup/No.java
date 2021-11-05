package PilhaDup;

public class No {
	public No anterior;
	public No proximo;
	public String letra;

	public No (String letra) {
		this.anterior= null;
		this.proximo= null;
		this.letra= letra;
	}

	public No(No anterior, No proximo, String letra) {
		super();
		this.anterior = anterior;
		this.proximo = proximo;
		this.letra = letra;
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

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

}
