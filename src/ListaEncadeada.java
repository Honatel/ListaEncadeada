
public class ListaEncadeada {
	private No primeira;
	
	private No ultima;
	
	private int totalElementos;

    /* Insere o objeto no fim da lista. */
    public void append(Object elemento) {
        if (this.totalElementos == 0) {
            this.addFirst(elemento);
          } else {
        	  No nova = new No(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalElementos++;
          }
	}
	
    /* Insere o objeto no inicio da lista. */
    public void addFirst(Object elemento) {
        No nova = new No(this.primeira, elemento);
        this.primeira = nova;
        
        if(this.totalElementos == 0){
          this.ultima = this.primeira;
        }
        this.totalElementos++;
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
