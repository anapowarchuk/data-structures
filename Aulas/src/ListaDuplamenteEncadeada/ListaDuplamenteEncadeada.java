package ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
	private Nodo primeiro;
	private Nodo ultimo;
	
	// Construtor da lista
	public ListaDuplamenteEncadeada(){
        this.primeiro = null;
        this.ultimo = null;
	}
	
	// Adicionar novo no no comeco da lista
	public void adicionarInicio(int valor){ 
		Nodo novo = new Nodo(null, valor, this.primeiro);
	
		if (estaVazia()) 
			this.ultimo = novo;
		else 
			this.primeiro.setAnterior(novo);
		
		this.primeiro = novo;
	}
	
	// Adicionar novo no em uma posicao
	public void adicionarPosicao(int valor, int posicao) {
		if (posicao == 0)
			adicionarInicio(valor);
		else {
			Nodo anterior = this.primeiro;
			int count = 0;
			while (count < posicao-1) {
				anterior = anterior.getProximo();
				count++;
			}
			
			if (anterior.getProximo() == null)
				adicionarFinal(valor);
			else {
				Nodo novo = new Nodo(anterior, valor, anterior.getProximo());
				anterior.getProximo().setAnterior(novo);
				anterior.setProximo(novo);
			}
		}
	}
	
	// Adiciona novo no no final da lista
	public void adicionarFinal(int valor) {
		Nodo novo = new Nodo(valor);
		
		if (estaVazia()) {
			this.primeiro = novo;
		}
		else {
			Nodo aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			novo.setAnterior(aux);
			aux.setProximo(novo);
		}
		this.ultimo = novo;
	}
	
	// Busca no, do comeco para o final
	public Nodo buscar(int valor) {
		for (Nodo aux = this.primeiro; aux != null; aux = aux.getProximo())
		    if (aux.getNumero() == valor)
				return aux;
        return null;
	}
	
	// Busca no, do final para o comeco
	public Nodo buscarInverso(int valor) {
		for (Nodo aux = this.ultimo; aux != null; aux = aux.getAnterior())
		    if (aux.getNumero() == valor)
				return aux;
        return null;
	}
	
	// Altera no
	public void alterar(int valor, int novoValor) {
		Nodo aux = buscar(valor);
		if (aux != null) {
			aux.setNumero(novoValor);
		}
	}
	
	// Imprime a lista
	public void imprimir() {
		for (Nodo aux = primeiro; aux != null; aux = aux.getProximo())
		    System.out.println(aux.getNumero());
    }
	
	// Imprime a lista ao contrario
	public void imprimirInverso() {
		for (Nodo aux = ultimo; aux != null; aux = aux.getAnterior())
		    System.out.println(aux.getNumero());
    }
	
	// Remove no (primeira ocorrencia)
	public void removerInicio(int valor) {
		Nodo aux = buscar(valor);
		if (aux != null) {
			Nodo anterior = aux.getAnterior();
			Nodo proximo = aux.getProximo();
			
			if (anterior != null) 
				anterior.setProximo(proximo);
			else 
				this.primeiro = proximo;
			
			if (proximo != null)
				proximo.setAnterior(anterior);
			else
				this.ultimo = anterior;
		}
	}
	
	// Remove no (ultima ocorrencia)
	public void removerFinal(int valor) {
		Nodo aux = buscar(valor);
		if (aux != null) {
			Nodo anterior = aux.getAnterior();
			Nodo proximo = aux.getProximo();
			
			if (anterior != null) 
				anterior.setProximo(proximo);
			else 
				this.primeiro = proximo;
			
			if (proximo != null)
				proximo.setAnterior(anterior);
			else
				this.ultimo = anterior;
		}
	}
	
	// Remover posicao
	public void removerPosicao(int posicao) {
		if (posicao == 0) {
			this.primeiro = this.primeiro.getProximo();
			this.primeiro.setAnterior(null);
		}
		else {
			Nodo atual = this.primeiro;
			int count = 0;
			while (count < posicao) {
				atual = atual.getProximo();
				count++;
			}
			if (atual.getProximo() == null) {
				this.ultimo = this.ultimo.getAnterior();
				this.ultimo.setProximo(null);
			}
			else {
				atual.getAnterior().setProximo(atual.getProximo());
				atual.getProximo().setAnterior(atual.getAnterior());
			}
		}
	}
	
	// Verifica se a lista esta vazia
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}
	
	// Limpa a lista
	public void limpar() {
		this.primeiro = null;
		this.ultimo = null;
	}
    
}