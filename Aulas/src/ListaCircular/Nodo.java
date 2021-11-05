package ListaCircular;


public class Nodo {    
    
	private int numero;
    private Nodo proximo;    
    
    public Nodo(int numero) {
        this.numero = numero;
        this.proximo = null;
    }
    
    public Nodo(int numero, Nodo proximo) {
        this.numero = numero;
        this.proximo = proximo;
    }    
    
    public int getNumero(){ 
    	return this.numero; 
    }
    
    public Nodo getProximo(){ 
    	return this.proximo; 
    }
    
    public void setNumero(int numero){ 
    	this.numero = numero;
    }
    
    public void setProximo(Nodo proximo){ 
    	this.proximo = proximo; 
    }    
}
