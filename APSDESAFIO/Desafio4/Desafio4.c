#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//DESAFIO 4 - PLACAR DO AUGUSTO
//LUCIANO FAN                       RA:20951129
//RAFAEL LOPES DE ARAUJO            RA:21010827
//RENNZO GIOVANNI DE ASSIS          RA:20951124

//RECEBE A QUANTIDADE DE ALUNOS DA SALA
int numero_alunos() {
    int n ,flag = 0;
    while (flag == 0) {

        printf("Digite o numero de alunos ou zero para encerrar\n");
        scanf("%i",&n);

        if (n < 0 || n > 100) {

            printf("Numero de alunos invalido\n");

        } else {

            flag = 1;
        }
    }
    return n;
}
//USADO APENAS PARA RECEBER AS VARIAVEIS DE ENTRADA E REPETIR CASO SEJAM DADOS INVALIDOS
void recebe_nome_problemas (int *p1, char *p2) {

    int aux1, aux2 , problemas = 0 , flag = 0;
    char nomeAux [20];
    char *p3;
    p3 = &nomeAux;

    while (flag == 0){
        printf("Digite o nome do aluno e quantos problemas ele resolveu\n");
        scanf("%s %i", &nomeAux , &problemas);


        aux1 = valida_nome(p3);
        aux2 = valida_problemas(problemas);

        if (aux1 == 0 || aux2 == 0)
            printf("\nO nome digitado supera 20 caracteres ou o numero de problemas resolvidos e maior que 10 ou inferior a 0 \n");
         else
            flag = 1;

        }
        calcula_reprovado(p1 , p2, p3, problemas);

}
//REALIZA TODOS OS CALCULOS PARA VERIFICAR A QUANTIDADE DE PROBLEMAS RESOLVIDOS E CASO A QUANTIDADE DE PROBLEMAS SEJA IGUAL
//VALIDA POR ORDEM ALFABÉTICA
void calcula_reprovado(int *p1, char *p2 ,char *p3 , int problemas) {
    int i ,j;

    if (problemas < *p1) {

        for (i = 0; i < 20; i++){
            *p2 = *p3;
            *p2++;
            *p3++;
        }
        *p1 = problemas;

    } else if (problemas == *p1) {

       for (i = 0; i < 20; i++){

            if (*p3 > *p2) {

                for (j = 0; j < 20; j++){
                    *p2 = *p3;
                    *p2++;
                    *p3++;
                }
                break;

            } else if (*p3 == *p2) {

                *p3++;
                *p2++;
            }

       }
    }
}
//VALIDA SE O NOME ESTA DENTRO DA QUANTIDADE DE CARACTERES ESTIPULADA
int valida_nome(char *p3){

    if (strlen(p3) > 20)
       return 0;
    else
        return 1;
}
//VALIDA SE A QUANTIDADE DE PROBLEMAS RESOLVIDOS ESTA DENTRO DO ESTIPULADO
int valida_problemas (int problemas){
    if (problemas > 10 || problemas < 0)
        return 0;
    else
        return 1;
}

int main()
{
    int n , problemas,repeticao,instancia = 1;
    char nomeReprovado[20];
    int *p1 = &problemas;
    char *p2 = &nomeReprovado;

    //LAÇO PARA REPETIR O PROGRAMA ATE QUE SEJA DIGITADO ZERO PARA O NUMERO DE ALUNOS
    do {
        repeticao = n = numero_alunos();

        while(n > 0){
            recebe_nome_problemas(p1 , p2);
            n--;
        }
        if (repeticao != 0) {
            printf("\nINSTANCIA %i\n", instancia);
            printf("O aluno reprovado e o %s que resolveu %i problemas\n\n\n" , nomeReprovado, problemas);
            instancia++;
        }
    } while (repeticao != 0);

    return 0;
}
