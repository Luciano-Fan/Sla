package applistaencadeada;

import java.util.Scanner;

public class AppListaEncadeada {

    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        ListaEncadeada lista = new ListaEncadeada();

        int opcao, novoElemento, posicao, buscado;

        do {

            System.out.println("Digite:"
                    + "\n1 - Inserir elemento em posição escolhida"
                    + "\n2 - Inserir elemento na última posição"
                    + "\n3 - Remover um elemento em posição escolhida"
                    + "\n4 - Alterar o valor em posição escolhida"
                    + "\n5 - Obter o valor de um elemento em posição escolhida"
                    + "\n6 - Ver o número de elementos da lista"
                    + "\n7 - Ver se a lista está vazia"
                    + "\n8 - Ver se um elemento existe"
                    + "\n9 - Imprimir"
                    + "\n10 - Sair"
                    + "\n11 - Exercício 5"
                    + "\n12 - Exercício 6" 
                    + "\n13 - Exercício 4");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor:");
                    novoElemento = entrada.nextInt();
                    System.out.println("Digite posição:");
                    posicao = entrada.nextInt();
                    try {
                        lista.add(novoElemento, posicao);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor:");
                    novoElemento = entrada.nextInt();
                    try {
                        lista.add(novoElemento);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Digite posição de remoção:");
                    posicao = entrada.nextInt();
                    try {
                        System.out.println("Elemento removido: " + lista.remove(posicao));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("Digite o novo valor:");
                    novoElemento = entrada.nextInt();
                    System.out.println("Digite a posição a ser alterada:");
                    posicao = entrada.nextInt();
                    try {
                        lista.set(novoElemento, posicao);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.out.println("Digite a posição que deseja ler:");
                    posicao = entrada.nextInt();
                    try {
                        System.out.println("Elemento obtido: " + lista.get(posicao));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 6:
                    System.out.println("Tamanho da lista: " + lista.size());
                    break;
                case 7:
                    System.out.println("Lista vazia? " + lista.isEmpty());
                    break;
                case 8:
                    System.out.println("Digite o elemento a ser buscado");
                    buscado = entrada.nextInt();
                    System.out.println("Elemento " + buscado + " existe? " 
                            + lista.exist(buscado));
                    break;
                case 9:
                    System.out.println(lista);
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                case 11:
                    System.out.println("Digite um número para remover os primeiros nós da lista");
                    int elem = entrada.nextInt();
                    lista.removaNo(elem);
                    break;
                case 12:
                    System.out.println("Digite dois números para trocar");
                    int elem1 = entrada.nextInt();
                    int elem2 = entrada.nextInt();
                    lista.troca(elem1, elem2);
                    break;
                case 13:
                    System.out.println("Digite onde ocorrerá a ruptura");
                    int elem3 = entrada.nextInt();
                    lista.ruptura(elem3);
                    System.out.println(lista.ruptura(elem3));
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("\n\n");

        } while (opcao != 10);
        
    }
    
}
