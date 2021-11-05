package Lista8_PilhaDupEncadeada;


public class Pilha {
	private No topo;
	private No base;
	
	//construtor
	public Pilha() {
		super();
		this.topo = null;
		this.base = null;
	}
	
	//se esta vazia
	public boolean isEmpty() {
		if (this.topo == null) {
			return true;
		}
		return false;
	}
	
	//retorna o número de elementos da pilha
	public int size() {
		int cont = 0;
		for (No a = this.topo; a != null; a.getProximo()) {
			cont++;
		}
		return cont;
	}
	
	//insere o elemento valor da base da pilha
	public void push_final(String letra) {
		No aux = new No(letra, null , this.base);
		if (isEmpty()) {
			this.topo = aux;
		} else {
			this.base.setProximo(aux);
		}
		this.base = aux;
	}
	//remove e retorna o elemento da base da pilha, mas retorna null se a pilha estiver vazia
	public No pop_final() {
		if (isEmpty()) {
			return null;
		} else {
			this.base = base.getProximo();
			return this.base;
		}
	}

	//retorna o elemento da base da pilha, mas retorna null se a pilha estiver vazia
	public No top_final() {
		if (isEmpty()) {
			return null;
		} else
			return this.base;
	}
	
	// esvazia a pilha
	public void clear() {
		this.topo = null;
	}
	
	
	// esvazia a pilha recursivamente
	public void clearRecursivo() {
		if (this.topo != null) {
			this.topo = this.topo.getProximo();
			clearRecursivo();
		}
	}
	
	//imprimir
	public void imprimir() {
		for(No c=this.topo; c!=null; c = c.getProximo()){
			System.out.println(c.getLetra());
		}
	}

}