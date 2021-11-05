package ListaArranjo;


public class Turma {
	private String[] lista;
	private int proximoIndice;
	
	// Construtor da lista
	public Turma(int tamanho) {
		lista = new String[tamanho];
		proximoIndice = 0;
	}
	
	// Verifica se a lista esta vazia
	public boolean estaVazia() {
		if (proximoIndice == 0) {
			return true;
		}
		return false;
	}
	
	// Verifica se a lista esta cheia
	public boolean estaCheia() {
		if (proximoIndice == lista.length) {
			return true;
		}
		return false;
	}
	
	// Adiciona novo no na proxima posicao disponivel
	public boolean adicionar(String valor) {
		if (!estaCheia()) {
			lista[proximoIndice++] = valor;
			return true;
		}
		return false;
	}
	
	// Altera no
	public boolean alterar(String valor, String novoValor) {
		int indice = buscar(valor); 
		if (indice >= 0) {
			lista[indice] = novoValor;
			return true;
		}
		return false;
	}
	
	// Remove no
	public void remover(String valor) {
		boolean troca = false;
		for (int i = 0; i < proximoIndice; i++) {
			// Se for o valor que procuramos
			if (lista[i].equals(valor)) {
				troca = true;
				if (i+1 < lista.length) {
					lista[i] = lista[i+1];
				}
				proximoIndice--;
			}
			// Se for um valor de uma posicao subsequente
			if (troca) {
				if (i+1 < lista.length) {
					lista[i] = lista[i+1];
					if (lista[i] != null) {
						break;
					} 
				}
			}
		}
	}
	
	// Busca no
	public int buscar(String valor) {
		for (int i = 0; i < proximoIndice; i++) {
			if (lista[i].equals(valor)) {
				return i;
			}
		}
		return -1;
	}
	
	// Imprime a lista
	public void listar() {
        for (int i = 0; i < proximoIndice; i++){           
           System.out.println( lista[i] );            
        }
    }
	
	// Limpa a lista
	public void limpar() {
		this.proximoIndice = 0;
	}
}