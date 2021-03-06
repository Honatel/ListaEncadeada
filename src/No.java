
public class No {
	private No proxima;

	private Object elemento;
  
	private No anterior;

    public No(No proxima, Object elemento) {
    	this.proxima = proxima;
		this.elemento = elemento;
    }

    public No(Object elemento) {
    	this.elemento = elemento;
    }
	
    /* Testa se existe um No apos esse no. */
    public boolean hasNext() {
		return false;
	}
	
    /* Testa se existe um No antes desse no. */
    public boolean hasPrevious() {
		return false;
	}
	
    public No getProxima() {
		return proxima;
	}

	public void setProxima(No proxima) {
		this.proxima = proxima;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	/* Retorna o pr�ximo No. */
    public No next() {
		return this.proxima;
	}	
		
    /* Retorna o No anterior. */
    public No previous() {
		return this.anterior;
	}
	
    /* Insere um No ap�s esse no. */// inserre setProxima(Celula proxima) 
    public boolean insertAfter(No nova) {
    	
    	
    	nova.setAnterior(nova.proxima);
    	nova.proxima = nova.proxima.proxima;
    	nova.proxima.anterior = nova;
    	nova.anterior.proxima = nova;
    	 
    	
    	//lista.setUltima(nova);
		return true;
	}
	
	
    /* Insere um No antes desse no. */ //setAnterior(Celula anterior)
    public boolean insertBefore(No nova) {
    	
    	nova.setAnterior(nova.proxima.anterior);
    	nova.proxima.anterior.proxima= nova; 
	    nova.proxima.anterior = nova;
      
		return true;
	}
	
    /* Remove o no */
    public void remove() {
	}
	
	
    /* Recupera o dado armazenado. */
    public Object getData() {
		return elemento;
	}

}
