package applistaencadeada;

public class ListaEncadeada {

    private No inicio;
    private No fim;
    private int qtd;

    public ListaEncadeada() {
        inicio = fim = null;
        qtd = 0;
    }

    public int size() {
        return qtd;
    }

    public boolean isEmpty() {
        return qtd == 0;
    }

    public boolean exist(int elemento) {
        No atual = inicio;
        while (atual != null) {
            if (atual.dado == elemento) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public void add(int novoElemento, int posicao) throws Exception {
        if (posicao > qtd) {
            throw new Exception("Posição inválida");
        } else if (posicao == 0 && size() == 0) {
            No novoNo = new No(novoElemento);
            inicio = fim = novoNo;
            qtd++;
        } else if (posicao == 0 && size() > 0) {
            No novoNo = new No(novoElemento);
            novoNo.prox = inicio;
            inicio = novoNo;
            qtd++;
        } else if (posicao == qtd) {
            No novoNo = new No(novoElemento);
            fim.prox = novoNo;
            fim = novoNo;
            qtd++;
        } else {
            No anterior = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                anterior = anterior.prox;
            }
            No novoNo = new No(novoElemento);
            novoNo.prox = anterior.prox;
            anterior.prox = novoNo;
            qtd++;
        }
    }

    public void add(int novoElemento) {
        try {
            add(novoElemento, qtd);
        } catch (Exception e) {
        }
    }

    public int remove(int posicao) throws Exception {
        if (posicao >= qtd) {
            throw new Exception("Posição inválida");
        } else if (isEmpty()) {
            throw new Exception("Lista vazia");
        } else if (posicao == 0 && size() == 1) {
            No removido = inicio;
            inicio = fim = null;
            qtd--;
            return removido.dado;
        } else if (posicao == 0 && size() > 1) {
            No removido = inicio;
            inicio = inicio.prox;
            qtd--;
            return removido.dado;
        } else {
            No anterior = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                anterior = anterior.prox;
            }
            No removido = anterior.prox;
            anterior.prox = removido.prox;
            if (removido == fim) {
                fim = anterior;
            }
            qtd--;
            return removido.dado;
        }
    }

    public void set(int novoValor, int posicao) throws Exception {
        if (posicao > qtd) {
            throw new Exception("Posição inválida");
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.prox;
            }
            atual.dado = novoValor;
        }
    }

    public int get(int posicao) throws Exception {
        if (posicao > qtd) {
            throw new Exception("Posição inválida");
        } else {
            No atual = inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.prox;
            }
            return atual.dado;
        }
    }

    public String ruptura(int indice) throws Exception {
        int pos = 0;
        ListaEncadeada listaAux = new ListaEncadeada();
        No atual = inicio;

        if (indice > qtd || indice < 0) {
            return null;
        }
        while (atual != null) {// Percorre o no até o terminar
            pos++;
            if (pos > indice) { // Verifica se a posição do nó é maior que o do índice informado
                // se for armazena os dados na lista Auxiliar
                listaAux.add(atual.dado);
            }
            atual = atual.prox;
        }
        return listaAux.toString();
    }

    public boolean removaNo(int posicao) throws Exception {
        int i = 0;
        if (isEmpty()) { //verifica se a lista está vazia
            throw new Exception("Lista Vazia");

        }else if(posicao < 0 ){ // Verifica se a posição informada é valida
            throw new Exception("Posição Inválida");
            
        } 
        else if (posicao > qtd) {
            return false;
        } else {
            while (i < posicao) {
                // Percorre o nó, alterando a variável início para o próximo dele até chegar na posição informada 
                inicio = inicio.prox;
                qtd--;
                i++;

            } return true;
        }
        
    }

    public void troca(int m, int n) throws Exception {
        No noM = inicio;
        No noN = inicio;
        if (m <= qtd && n <= qtd && m >= 0 && n >=0 ) {
            for (int i = 0; i < m; i++) {
                noM = noM.prox; // percorre os nós até achar a/ posição em que deve ser trocada
            }

            for (int i = 0; i < n; i++) {
                noN = noN.prox;// percorre os nós até achar a/ posição em que deve ser trocada
            }

            int temp = noN.dado; // guarda o dado do nó em uma variável temporária
            noN.dado = noM.dado; // substitui o dado de um dos nós pelo o do outro
            noM.dado = temp; // pega o dado da variável temporária, e armazena no outro nó.
        }
        else{
            throw new Exception("Posição inválida");
        }
    }

    @Override
    public String toString() {
        String saida = "";
        No atual = inicio;
        while (atual != null) {
            saida += atual.dado + ", ";
            atual = atual.prox;
        }
        return saida;
    }

}
