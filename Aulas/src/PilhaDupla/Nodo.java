package PilhaDupla;

public class Nodo {    
    private Nodo anterior;
	private String palavra;
    private Nodo proximo;    
    
    public Nodo(String palavra) {
    	this.anterior = null;
        this.palavra = palavra;
        this.proximo = null;
    }
    
    public Nodo(Nodo anterior, String palavra, Nodo proximo) {
    	this.anterior = anterior;
        this.palavra = palavra;
        this.proximo = proximo;
    }    
    
    public Nodo getAnterior(){ 
    	return this.anterior; 
    }
    
    public String getPalavra(){ 
    	return this.palavra; 
    }
    
    public Nodo getProximo(){ 
    	return this.proximo; 
    }
    
    public void setAnterior(Nodo anterior){ 
    	this.anterior = anterior; 
    }    
    
    public void setPalavra(String palavra){ 
    	this.palavra = palavra;
    }
    
    public void setProximo(Nodo proximo){ 
    	this.proximo = proximo; 
    }    
}
