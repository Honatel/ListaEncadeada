
public class ListaEncadeada {
	private No primeira;
	
	private No ultima;
	
	private int totalElementos;

    public int getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(int totalElementos) {
		this.totalElementos = totalElementos;
	}

	/* Insere o objeto no fim da lista. */
    public void append(Object elemento) {
        if (this.totalElementos == 0) {
            this.addFirst(elemento);
          } else {
        	  No nova = new No(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            
            
            this.totalElementos++;
          }
	}
	
    /* Insere o objeto no inicio da lista. */
    public void addFirst(Object elemento) {
        No nova = new No(this.primeira, elemento);
        
        if(this.totalElementos == 0){
          this.primeira = nova;
          this.ultima = this.primeira;
        }else{
        	this.primeira.setAnterior(nova);
        	nova.setProxima(this.primeira);
        	this.primeira = nova;
        	
        }
        this.totalElementos++;
	}
	
    public No getPrimeira() {
		return primeira;
	}

	public void setPrimeira(No primeira) {
		this.primeira = primeira;
	}

	public No getUltima() {
		return ultima;
	}

	public void setUltima(No ultima) {
		this.ultima = ultima;
	}

	/* Remove o objeto da lista. */
    public void remove(Object o) {
	}
	
    /* Recupera o primeiro No da lista. */
    public No getFirst(){
		return this.primeira;
	}
	
    /* Recupera o ultimo No da lista. */
    public No getLast(){
		return this.ultima;
	}
	
    /* Testa se o objeto existe na lista. */
    public boolean hasObject(Object o) {
		return false;
	}

}
