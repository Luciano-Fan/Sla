#include <stdio.h>
#include <stdlib.h>

//DESAFIO 8 - COPA DO MUNDO DE FUTEBOL
//LUCIANO FAN                       RA:20951129
//RAFAEL LOPES DE ARAUJO            RA:21010827
//RENNZO GIOVANNI DE ASSIS          RA:20951124

struct Jogos
{
    char time;
    int vitoria;
};

//CRIAÇÃO DE VETORES PARA SIMULAR AS FASES DA COPA
struct Jogos jogosOitavas[16];
struct Jogos jogosQuartas[8];
struct Jogos jogosSemi[4];
struct Jogos jogoFinal[2];
int time1, time2,jogo;

void oitavasDeFinal() {

    int i, cont =0;
    int *p = &cont;

    //PERCORRE OS OITO PRIMEIROS JOGOS CALCULANDO OS VENCEDORES DAS OITAVAS DE FINAL
    for (i = 0; i < 8; i++) {

        placar();
        insereVencedor(1,p);
        jogo++;
    }

}

void quartasDeFinal () {

    int i,j, cont = 0;
    int *p = &cont;
    //TRANSFERE OS VENCEDORES DAS OITAVAS PARA AS QUARTAS DE FINAL
    passarDeFase(16 ,p);

    cont = 0;
    //PERCORRE OS PROXIMOS QUATRO JOGOS PARA CALCULAR OS VENCEDORES DAS QUARTAS DE FINAL
    for (j = 0; j < 4; j++) {

        placar();
        insereVencedor(2,p);
        jogo++;
    }

}

void semiFinal () {

    int i, cont = 0;
    int *p = &cont;

    //TRANSFERE OS VENCEDORES DAS QUARTAS PARA AS SEMI FINAIS
    passarDeFase(8 ,p);

    cont = 0;
    //PERCORRE OS DOIS JOGOS DAS SEMI FINAIS E CALCULA OS VENCEDORES
    for (i = 0; i < 2; i++) {

        placar();
        insereVencedor(3,p);
        jogo++;
    }
}

void faseFinal() {

    int i, cont = 0;
    int *p = &cont;

    //TRANSFERE OS VENCEDORES DAS SEMI FINAIS PARA A FINAL
    passarDeFase(4 ,p);

    //EXIBE DIRETO QUEM FOI O VENCEDOR
    placar();
    if(time1 > time2) {

        printf("O vencedor e o time: %c\n", jogoFinal[0].time);

    } else {

        printf("O vencedor e o time: %c\n", jogoFinal[1].time);
    }
}

void insereVencedor(int fase,int *p) {

    switch (fase) {

    case 1:
        if(time1 > time2) {

            jogosOitavas[*p].vitoria = 1;
            jogosOitavas[*p + 1].vitoria = 0;
            *p = *p + 2;

        } else {

            jogosOitavas[*p].vitoria = 0;
            jogosOitavas[*p + 1].vitoria = 1;
            *p = *p + 2;
        }
        break;
    case 2:
         if(time1 > time2) {

            jogosQuartas[*p].vitoria = 1;
            jogosQuartas[*p + 1].vitoria = 0;
            *p = *p + 2;

        } else {

            jogosQuartas[*p].vitoria = 0;
            jogosQuartas[*p + 1].vitoria = 1;
            *p = *p + 2;
        }
        break;
    case 3:
         if(time1 > time2) {

            jogosSemi[*p].vitoria = 1;
            jogosSemi[*p + 1].vitoria = 0;
            *p = *p + 2;

        } else {
            jogosSemi[*p].vitoria = 0;
            jogosSemi[*p + 1].vitoria = 1;
            *p = *p + 2;
        }
        break;
    }
}

//VALIDA O PLACAR DIGITADO
void placar() {

    int check = 0;
    while (check != 1) {

        printf("Digite o resultado do jogo %i \n", jogo);
        scanf("%i %i", &time1, &time2);

        if (time1 < 0 || time1 > 20 || time2 < 0 || time2 > 20 || time1 == time2) {

            printf("Placar invalido , saldo de gols inferior a 0 , superior a 20 ou saldo de gols igual para os dois times\n");
            check = 0;

        } else {
            check = 1;
        }
    }
}

void passarDeFase(int TAM , int *p){
    int i;
    for (i = 0; i < TAM; i++){

        switch (TAM){

            case 16:
                if(jogosOitavas[i].vitoria == 1) {

                    jogosQuartas[*p].time = jogosOitavas[i].time;
                    *p = *p +1;
                }
                break;
            case 8:
                if(jogosQuartas[i].vitoria == 1) {

                    jogosSemi[*p].time = jogosQuartas[i].time;
                    *p = *p +1;
                }
                break;
            case 4:
                if(jogosSemi[i].vitoria == 1) {

                    jogoFinal[*p].time = jogosSemi[i].time;
                    *p = *p +1;
                }
                break;
        }
    }
}

int main()
{

    int i,resp = 0;
    // POPULANDO VETORES DAS OITAVAS DE FINAL COM OS NOMES DOS TIMES (A - P)
    for (i = 0; i < 16; i++) {

        jogosOitavas[i].time = 65 + i;

    }

    //REPETIÇÃO PARA PODER UTILIZAR O PROGRAMA MAIS DE UMA VEZ EM SEQUENCIA
    do {
        time1 = 0;
        time2 = 0;
        jogo = 1;
        oitavasDeFinal();
        quartasDeFinal();
        semiFinal();
        faseFinal();

        printf("Deseja calcular o vencedor novamente? (0 - NAO / 1 - SIM) \n");
        scanf("%i",&resp);

    }
    while (resp == 1);
}
//li e concordo com os termos da aps





