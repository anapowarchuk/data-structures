package ListaDuplamenteEncadeada;

public class Nodo {    
    
	private Nodo anterior;
	private int numero;
    private Nodo proximo; 
    
    public Nodo(int numero) {
        this.anterior = null;
    	this.numero = numero;
        this.proximo = null;
    }
    
    public Nodo(Nodo anterior, int numero, Nodo proximo) {
        this.anterior = anterior;
    	this.numero = numero;
        this.proximo = proximo;
    }    
    
    public Nodo getAnterior() {
    	return this.anterior;
    }
    
    public int getNumero(){ 
    	return this.numero; 
    }
    
    public Nodo getProximo(){ 
    	return this.proximo; 
    }
    
    public void setAnterior(Nodo anterior) {
    	this.anterior = anterior;
    }
    
    public void setNumero(int numero){ 
    	this.numero = numero;
    }
    
    public void setProximo(Nodo proximo){ 
    	this.proximo = proximo; 
    }    
}