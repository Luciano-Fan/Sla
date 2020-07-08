package applistaencadeada;

public class No {
    
    public int dado;
    public No prox;
    
    public No(int dado) {
        this.dado = dado;
        prox = null;
    }
    
    public String imprimir() {
        return Integer.toString(dado);
    }
    
    
    
}
