package apparvorebinariadebusca;



public class ArvoreBinariaDeBusca {

    private NoArvore raiz;

    public ArvoreBinariaDeBusca() {
        raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    public void inserir(int novoElemento) throws Exception {
        if (isEmpty()) {
            raiz = new NoArvore(novoElemento);
        } // Realiza busca antes de realizar os métodos de inserção
        else if (!find(novoElemento)) {

            boolean inserido = false;
            NoArvore atual = raiz;
            while (!inserido) {
                if (novoElemento <= atual.dado) {
                    if (atual.esq == null) {
                        atual.esq = new NoArvore(novoElemento);
                        inserido = true;
                    } else {
                        atual = atual.esq;
                    }
                } else {
                    if (atual.dir == null) {
                        atual.dir = new NoArvore(novoElemento);
                        inserido = true;
                    } else {
                        atual = atual.dir;
                    }
                }
            }
        } else {
            throw new Exception("Elemento inválido, já foi inserido");
        }
    }

    public boolean remover(int elemento) throws Exception {
        if (buscar(elemento) == null) {
            return false;
        } else {
            NoArvore anterior = null;
            NoArvore atual = raiz;
            boolean removido = false;
            while (!removido) {
                if (elemento < atual.dado) {
                    anterior = atual;
                    atual = atual.esq;
                } else if (elemento > atual.dado) {
                    anterior = atual;
                    atual = atual.dir;
                } else {
                    if (atual == raiz) {
                        if (atual.esq == null && atual.dir == null) {
                            raiz = null;
                        } else if (atual.esq != null && atual.dir == null) {
                            raiz = raiz.esq;
                        } else if (atual.esq == null && atual.dir != null) {
                            raiz = raiz.dir;
                        } else {
                            int maior = maiorDosMenores(raiz);
                            raiz.dado = maior;
                        }
                        return true;
                    } else { //nó removido não é raiz
                        if (atual.esq == null && atual.dir == null) {
                            if (anterior.esq == atual) {
                                anterior.esq = null;
                            } else {
                                anterior.dir = null;
                            }
                        } else if (atual.esq != null && atual.dir == null) {
                            if (anterior.esq == atual) {
                                anterior.esq = atual.esq;
                            } else {
                                anterior.dir = atual.esq;
                            }
                        } else if (atual.esq == null && atual.dir != null) {
                            if (anterior.esq == atual) {
                                anterior.esq = atual.dir;
                            } else {
                                anterior.dir = atual.dir;
                            }
                        } else {
                            int maior = maiorDosMenores(atual);
                            atual.dado = maior;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public NoArvore buscar(int elemento) {
        NoArvore atual = raiz;
        while (atual != null) {
            if (atual.dado == elemento) {
                return atual;
            } else if (elemento < atual.dado) {
                atual = atual.esq;
            } else {
                atual = atual.dir;
            }
        }
        return null;
    }

    //Método de busca que retorna TRUE ou FALSE
    public boolean find(int elemento) throws Exception {
        if (isEmpty()) {
            throw new Exception("A árvore esta vazia");
        } else {
            NoArvore atual = raiz;
            while (atual != null) {
                if (atual.dado == elemento) {
                    return true;
                } else if (elemento < atual.dado) {
                    atual = atual.esq;
                } else {
                    atual = atual.dir;
                }
            }
        }
        return false;
    }

    private int menorDosMaiores(NoArvore no) {
        NoArvore anterior = no;
        NoArvore atual = no.dir;

        if (atual.esq == null) {
            anterior.dir = atual.dir;
            return atual.dado;
        }

        while (atual.esq != null) {
            anterior = atual;
            atual = atual.esq;
        }

        anterior.esq = atual.dir;
        return atual.dado;
    }

    //Busca o maior dos Menores para remover
    private int maiorDosMenores(NoArvore no)  {
        NoArvore anterior = no;
        NoArvore atual = no.esq;

        if (atual.dir == null) {
            anterior.esq = atual.esq;
            return atual.dado;
        }

        while (atual.dir != null) {
            anterior = atual;
            atual = atual.dir;
        }

        anterior.dir = atual.esq;
        return atual.dado;
    }

    public String preOrdem() {
        String saida = "";
        PilhaDinamica p = new PilhaDinamica();
        p.push(raiz);
        while (!p.isEmpty()) {
            try {
                NoArvore atual = p.pop();
                saida += atual.dado + ", ";
                if (atual.dir != null) {
                    p.push(atual.dir);
                }
                if (atual.esq != null) {
                    p.push(atual.esq);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return saida;
    }

    public String emOrdem() {
        String saida = "";
        PilhaDinamica p = new PilhaDinamica();
        NoArvore atual = raiz;
        while (!p.isEmpty() || atual != null) {
            if (atual != null) {
                p.push(atual);
                atual = atual.esq;
            } else {
                try {
                    atual = p.pop();
                    saida += atual.dado + ", ";
                    atual = atual.dir;
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return saida;
    }

    public String posOrdem() {
        String saida = "";
        PilhaDinamica p = new PilhaDinamica();
        NoArvore atual = raiz;
        NoArvore ultimoVisitado = null;
        while (!p.isEmpty() || atual != null) {
            if (atual != null) {
                p.push(atual);
                atual = atual.esq;
            } else {
                try {
                    NoArvore noTopo = p.top();
                    if (noTopo.dir != null && ultimoVisitado != noTopo.dir) {
                        atual = noTopo.dir;
                    } else {
                        saida += noTopo.dado + ", ";
                        ultimoVisitado = p.pop();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return saida;
    }

}
