package Lista7_PilhaSimplesmenteEncadeada;


public class Pilha {
	private No topo;
	
	public Pilha(No topo) {
		super();
		this.topo = topo;
	}
	

	public boolean isEmpty(){
		if (this.topo==null) {
			return true;
		}
		return false;
	}
	
	public int size(){
		int cont=0;
		for(No a=this.topo;a!=null;a.getProximo()){
			cont++;
		}
		return cont;
	}
	
	public void push (int valor){
		No novo = new No(valor, this.topo);
		this.topo = novo;
	}
	
	public No pop(){
		if (isEmpty()){
			return null;
		}
		else {
			this.topo=topo.getProximo();
			return this.topo;
		}
	}
	
	public No top() {
		if (isEmpty()) {
			return null;
		}
		else
			return this.topo;
	}

	public void clear() {
		this.topo=null;
	}
	public void clearRecursivo() {
		if (this.topo != null){
			this.topo=this.topo.getProximo();
			clearRecursivo();
		}
	}
	
	public void imprimir() {
		for(No c=this.topo; c!=null; c.getProximo()){
			System.out.println(c.getNumero());
		}
	}
}
