package ArvoreBinaria;


public class No {
	private int dado;
	private No esquerda;
	private No direita;
	private No pai;
	
	
	public No(int dado) {
		super();
		this.dado = dado;
		this.esquerda = null;
		this.direita = null;
		this.pai = null;
	}
	
	public No(int dado, No esquerda, No direita, No pai) {
		super();
		this.dado = dado;
		this.esquerda = esquerda;
		this.direita = direita;
		this.pai = pai;
	}

	

	public int getDado() {
		return dado;
	}


	public void setDado(int dado) {
		this.dado = dado;
	}


	public No getEsquerda() {
		return esquerda;
	}


	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}


	public No getDireita() {
		return direita;
	}


	public void setDireita(No direita) {
		this.direita = direita;
	}


	public No getPai() {
		return pai;
	}


	public void setPai(No pai) {
		this.pai = pai;
	}
	
	
}