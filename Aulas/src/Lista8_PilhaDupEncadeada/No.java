package Lista8_PilhaDupEncadeada;

public class No {
	private String letra;
	private No proximo;
	private  No anterior;
	
	
	public No(String letra, No anterior, No proximo) {
		this.letra = letra;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
	

}