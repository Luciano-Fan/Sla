package apparvorebinariadebusca;

// LUCIANO FAN E RAFAEL LOPES DE ARAUJO
public class AppArvoreBinariaDeBusca {

    public static void main(String[] args) throws Exception {
        ArvoreBinariaDeBusca a = new ArvoreBinariaDeBusca();
        System.out.println("\n####################### ELEMENTOS INSERIDOS #############################");
        a.inserir(8);
        a.inserir(5);
        a.inserir(2);
        a.inserir(200);
        a.inserir(26);
        a.inserir(82);
        a.inserir(75);
        a.inserir(3);
        a.inserir(20);
        a.inserir(50);
        a.inserir(12);
        a.inserir(1);

        System.out.println("\n" + a.preOrdem());
        System.out.println("\n" + a.emOrdem());
        System.out.println("\n" + a.posOrdem());
        System.out.println("\n####################### TESTE MÉTODO FIND ################################");

        //DEVERÀ IMPRIMIR ACHEI
        if (a.find(12)) {
            System.out.println("\nACHEI");
        } else {
            System.out.println("\nNÃO ACHEI");
        }

        //DEVERÀ IMPRIMIR NÂO ACHEI
        if (a.find(230)) {
            System.out.println("\nACHEI");
        } else {
            System.out.println("\nNÃO ACHEI");
        }

        System.out.println("\n########################### TESTE DUPLICATA #############################");

        // NÃO DEVERÁ APRESENTAR ALTERAÇÕES NA ÁRVORE E IMPRIMIR O ERRO DE DUPLICATA
        try {
            a.inserir(12);
        } catch (Exception ex) {
            System.out.println("\n" + a.preOrdem());
            System.out.println("\n" + a.emOrdem());
            System.out.println("\n" + a.posOrdem());
            System.out.println("\n" + ex);
        }

        //DEVERÁ APRESENTAR ALTERAÇÕES NA ÁRVORE (INSERÇÃO DO 9) E IMPRIMIR O ERRO DE DUPLICATA
        try {
            a.inserir(9);
            a.inserir(9);
        } catch (Exception ex) {
            System.out.println("\n" + a.preOrdem());
            System.out.println("\n" + a.emOrdem());
            System.out.println("\n" + a.posOrdem());
            System.out.println("\n" + ex);
        }

        System.out.println("\n########################## TESTE REMOÇÃO RAÍZ ################################");

        //TESTE DE REMOÇÃO APÓS 
        a.remover(8);
        System.out.println("\n" + a.preOrdem());
        System.out.println("\n" + a.emOrdem());
        System.out.println("\n" + a.posOrdem());

        System.out.println("\n########################## TESTE REMOÇÃO NÓ DOIS FILHOS ################################");

        a.remover(26);
        System.out.println("\n" + a.preOrdem());
        System.out.println("\n" + a.emOrdem());
        System.out.println("\n" + a.posOrdem());
    }

}
