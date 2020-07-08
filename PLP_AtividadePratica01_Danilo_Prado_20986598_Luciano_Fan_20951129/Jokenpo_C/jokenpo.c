#include <stdio.h>
#include <stdlib.h>


/* Danilo Prado 20986598 Luciano Fan 20951129*/
/* 1 = pedra  2 = tesoura 3 = papel
    resultado 0 = derrota 1 = empate 2 = vitoria
*/

    int vitoriaJogador = 0;
    int vitoriaComputador = 0;
    int empate = 0;

void jokenpo (int entrada){

//gerar um numero aleatorio de 1 a 3 sendo 1 = pedra  2 = tesoura 3 = papel
    int jogadaComp = 1 + (rand()%3);
//verifica se a entrada esta entre 1 a 3
    if (entrada <= 3 && entrada >= 1){

    if(entrada == jogadaComp){

        printf("Empate\n");
        empate++;
        // verifica a ocasiao em que o jogador ganha e atualiza a contagem
    } else if ((entrada == 1 && jogadaComp == 2) || (entrada == 2 && jogadaComp == 3) || (entrada ==  3 && jogadaComp == 1) ){

        printf("Vitoria do jogador\n");
        vitoriaJogador++;

    } else {

        printf("Vitoria do computador\n");
        vitoriaComputador++;

    }

    }
    else  {

        printf("Entrada invalida\n");

    }

}


int main()
{
    int condicao = 0;
    int jogada;
    char nomeJogador [10];
    int opcao;

    srand( (unsigned)time(NULL) );

    printf("Digite o seu nome: \n");
    gets(nomeJogador);

// um laco infinito ate que entre no if que sera a condicao de parada
    do{

    printf("Digite:\n 1 para pedra \n 2 para tesoura \n 3 para papel \n");
    scanf("%d", &jogada);

    jokenpo(jogada);

//mostra os resultados atualizados
    printf("Jogador %s\n Vitorias: %d \n Empates: %d \n Derrotas: %d\n",nomeJogador, vitoriaJogador,empate,vitoriaComputador);

// Condicao que para o jogo
    printf("Deseja continuar a jogar? 0 = nao / 1 = sim \n");
    scanf("%d", &opcao);

    if(opcao == 0){
        //finaliza e mostrar o placar final
            printf("finalizando o jogo...\n");
            printf("Jogador %s\n Vitorias: %d \n Empates: %d \n Derrotas: %d\n",nomeJogador, vitoriaJogador,empate,vitoriaComputador);
        break;
    }

    }while(condicao == 0);



    return 0;
}
