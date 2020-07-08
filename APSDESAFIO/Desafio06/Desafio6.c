#include <stdio.h>
#include <stdlib.h>

//DESAFIO 6 - NUMEROS PERFEITOS NA MATEMATICA
//LUCIANO FAN                       RA:20951129
//RAFAEL LOPES DE ARAUJO            RA:21010827
//RENNZO GIOVANNI DE ASSIS          RA:20951124


// funcao que recebe um numero e verifica se o numero e perfeito
int QtdPerf (int n){
    int i,j=0;
    for (i = 1; i < n; i++)
    {

        if ( n % i == 0)
        {
            j = j + i;

// armazerna o divisor e soma com os outros divisores para depois comparar com o numero recebido

            if(j == n && i == n/2)
                return 1;
// retorna 1 se o numero for perfeito
        }
    }
    return 0;
}



int main()
{
    int aux = 0,i,a,b,cont = 0;
    int vet [20];
    do
    {
        printf("Digite o escopo:\n");
        scanf("%d %d", &a, &b);

        if(a == 0 && b == 0 )
            break;

// se a entrada for 0 e 0 encerra o programa

        for(i = a; i <= b; i++)
        {
            if(QtdPerf(i) == 1){
                vet[cont] = i;
                cont++;
// armazena o numero perfeito e incrementa a quantidade de numeros perfeitos
            }

        }
        printf("tem %d numeros perfeitos: \n", cont );
        for (i = 0; i < cont; i++)
        {
            printf("%d\n",vet[i]);

// percorre o vetor imprimindo os valores

        }
        cont = 0;
    }
    while (aux == 0);
    return 0;
}


