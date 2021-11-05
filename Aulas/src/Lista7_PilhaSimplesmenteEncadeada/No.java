package Lista7_PilhaSimplesmenteEncadeada;

public class No {
	private int numero;
    private No proximo;    
    
    public No(int numero) {
        this.numero = numero;
        this.proximo = null;
    }
    
    public No(int numero, No proximo) {
        this.numero = numero;
        this.proximo = proximo;
    }    
    
    public int getNumero(){ 
    	return this.numero; 
    }
    
    public No getProximo(){ 
    	return this.proximo; 
    }
    
    public void setNumero(int numero){ 
    	this.numero = numero;
    }
    
    public void setProximo(No proximo){ 
    	this.proximo = proximo; 
    }    
}
