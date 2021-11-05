package Pilha;

public class Pilha {
	private Nodo primeiro;
	
	// Construtor da pilha
	public Pilha() {
		this.primeiro = null;
	}
	
	// Verifica se a pilha esta vazia
	public boolean estaVazia() {
		return (this.primeiro == null);
	}
	
	// Retorna o tamanho da pilha
	public int tamanho(){
		int tamanho = 0;
		for (Nodo aux = this.primeiro; aux != null; aux = aux.getProximo()){
			tamanho++;
		}
		return tamanho;
	}
	
	
	// Adicionar novo no no comeco da pilha
	public void empilhar(int valor){ 
		Nodo novo = new Nodo(valor, this.primeiro);
		this.primeiro = novo;
	}
	
	// Remove no do comeco da pilha
	public Nodo desempilhar() {
		if (estaVazia())
			return null;
		else {
			Nodo topo = this.primeiro;
			this.primeiro = this.primeiro.getProximo();
			return topo;
		}
	}
	
	// Retorna o elemento incluido mais recentemente na pilha
	public Nodo topo(){
		return this.primeiro;
	}

	// Limpa todos os elementos da pilha
	public void esvaziar(){
		this.primeiro = null;
	}
	
	// Limpa todos os elementos da lista - recursivo
	public void esvaziarRecursivo(){
		if (!estaVazia()){
			desempilhar();
			esvaziarRecursivo();
		}
	}
	
}