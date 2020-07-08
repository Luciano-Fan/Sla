package sort;

public class sort {

    private int contador = 0;
    private int contador2 = 0;

    public int BubbleSort(int[] vet) {
        int tam = vet.length;
        boolean invertido = false;
        int cont = 0;
        do {

            invertido = false;

            for (int i = 1; i < tam; i++) {
                cont++;
                if (vet[i - 1] > vet[i]) {
                    int aux = vet[i];
                    vet[i] = vet[i - 1];
                    vet[i - 1] = aux;
                    invertido = true;

                }
            }

        } while (invertido == true);
        return cont;
    }

    public int InsetionSort(int[] vet) {
        int tam = vet.length;
        int cont = 0;
        for (int i = 1; i < tam; i++) {
            int j = i;

            while (j > 0 && vet[j - 1] > vet[j]) {
                int aux = vet[j];
                vet[j] = vet[j - 1];
                vet[j - 1] = aux;
                j--;
                cont++;
            }
        }
        return cont;
    }

    public int SelectionSort(int[] vet) {
        int minimo = 0, temp = 0;
        int cont = 0;
        for (int i = 0; i < vet.length - 1; i++) {
            minimo = i;
            for (int j = i + 1; j < vet.length; j++) {
                cont++;
                if (vet[j] < vet[minimo]) {
                    minimo = j;

                }

            }
            temp = vet[i];
            vet[i] = vet[minimo];
            vet[minimo] = temp;

        }
        return cont;
    }

    public int CocktailSort(int vet[]) {
        boolean invertido;
        int aux;
        int cont = 0;
        do {
            invertido = false;
            for (int i = 1; i < vet.length; i++) {
                cont++;
                if (vet[i - 1] > vet[i]) {
                    aux = vet[i];
                    vet[i] = vet[i - 1];
                    vet[i - 1] = aux;
                    invertido = true;

                }
            }
            if (invertido == false) {
                break;
            }

        } while (invertido == true);
        return cont;
    }

    public int MergeSort(int vet[], int p, int r) {
        contador = 0;
        int q = 0;
        if (p < r) {
            q = (p + r) / 2;
            MergeSort(vet, p, q);
            MergeSort(vet, q + 1, r);
            Intercala(vet, p, q, r);
        }

        return contador;
    }

    private void Intercala(int vet[], int p, int q, int r) {

        int B[] = new int[vet.length];

        for (int i = p; i <= q; i++) {
            B[i] = vet[i];
        }
        for (int j = q + 1; j <= r; j++) {
            B[r + q + 1 - j] = vet[j];

        }
        int i = p;
        int j = r;
        for (int k = p; k <= r; k++) {
            contador++;
            if (B[i] <= B[j]) {
                vet[k] = B[i];
                i++;

            } else {
                vet[k] = B[j];
                j--;
            }
        }

    }

    public int ShellSort(int vetor[]) {
        int cont = 0;
        int valor;
        int gap = 1;
        while (gap < vetor.length) {
            gap = 3 * gap + 1;
        }
        while (gap > 1) {
            gap /= 3;
            cont++;
            for (int i = gap; i < vetor.length; i++) {
                valor = vetor[i];
                int j = i;
                while (j >= gap && valor < vetor[j - gap]) {
                    vetor[j] = vetor[j - gap];
                    j = j - gap;
                    cont++;
                }
                vetor[j] = valor;
            }
        }

        return cont;
    }

    public int quickSort(int[] vetor, int inicio, int fim) {
        
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        return contador2;
    }

    private int separar(int[] vetor, int inicio, int fim) {

        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            contador2++;
            if (vetor[i] <= pivo) {
                i++;

            } else if (pivo < vetor[f]) {
                f--;
                contador2++;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
                contador2++;
            }
        }

        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
