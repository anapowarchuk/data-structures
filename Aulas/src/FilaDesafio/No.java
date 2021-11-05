package FilaDesafio;

public class No {
	private Cliente cliente;
	private No proximo;
	
	 public No(Cliente cliente) {
	        this.cliente = cliente;
	        this.proximo = null;
	    }
	 
	public No(Cliente cliente, No proximo) {
		super();
		this.cliente = cliente;
		this.proximo = proximo;
	}

	public Cliente getcliente() {
		return cliente;
	}

	public void setValor(Cliente cliente) {
		this.cliente = cliente;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	

	
}
