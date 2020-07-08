from random import randint

# Danilo Prado 20986598 Luciano Fan 20951129

class Registro:

    #criando os metodos gets e sets, registro de resultado e incrementacao no resultado

    def __init__(self,vitoriaJogador,empate,vitoriaComp):
        self.__empate = empate
        self.__vitoriaJogador = vitoriaJogador
        self.__vitoriaComp = vitoriaComp

    
    def getVitoriaComp(self):
        return self.__vitoriaComp

    def getVitoriaJogador(self):
        return self.__vitoriaJogador
    
    def getEmpate(self):
        return self.__empate    

    def setVitoriaComp(self, vitoriaComp):
        self.__vitoriaComp = vitoriaComp

    def setVitoriaJogador(self, vitoriaJogador):
        self.__vitoriaJogador= vitoriaJogador
    
    def setEmpate(self,empate):
        self.__empate = empate

    def addEmpate(self):
        self.__empate += 1

    def addVitoriaJogador(self):
        self.__vitoriaJogador += 1

    def addVitoriaComp(self):
        self.__vitoriaComp += 1

    def resultado(self):
        print("\n vitoria: ",self.__vitoriaJogador, "\n empate: ",self.__empate,"\n derrota: ",self.__vitoriaComp)


class Jokenpo:


    def jokenpo (self, entrada):

        #gerando um numero randomico de 1 a 3 sendo 1 = pedra  2 = tesoura 3 = papel

        jogadaComp = randint(1,3)

        #verifica se a entrada esta entre 1 a 3

        if entrada <= 3 and entrada > 0:
            #empata
            if entrada == jogadaComp:

                print("empate\n")

                return 0
            
            #verifica as ocasioes em que o jogador ganha

            elif (entrada == 1 and jogadaComp == 2) or (entrada == 2 and jogadaComp == 3) or (entrada ==  3 and jogadaComp == 1):
                
                print("Vitoria do jogador\n")

                return 2
            #perde
            else:

                print("Vitoria do computador\n")

                return 1

        else:
            print("Entrada invalida")



class App: 

    nomeJogador = input("Digite o seu nome: ")
    turnos = 0
    controle = True
    controle2 = True
    opcao = ""

    r = Registro(0,0,0)
    j = Jokenpo()

    while controle:

        
        entrada = input("\nDigite:\n 1 para pedra \n 2 para tesoura \n 3 para papel \n")

        
        saida = j.jokenpo(int(entrada))

        # resultado 0 = empate 1 = derrota 2 = vitoria

        if  saida == 0:
            #atualiza os turnos, os resultados e os exibe
            turnos+=1
            print("Turno: ", turnos)

            r.addEmpate()
            print ("Jogador ", nomeJogador)
            r.resultado()

        elif saida == 1:

            turnos+=1
            print("Turno: ", turnos)

            r.addVitoriaComp()
            print ("Jogador ", nomeJogador)
            r.resultado()
        elif saida == 2:

            turnos+=1
            print("Turno: ", turnos)

            r.addVitoriaJogador()
            print ("Jogador ", nomeJogador)
            r.resultado()


        #condicao de encerramento do jogo
        opcao = input("Deseja continuar a jogar? 0 = nao / 1 = sim \n")

        if int(opcao) == 0:

            print("\nResultado Final:\n")
            print ("Jogador ", nomeJogador)
            r.resultado()
            print("Encerrando o programa...")

            break

        elif int(opcao) > 1 or int(opcao) < 0:

            print("Entrada invalida")

            opcao = input("Deseja continuar a jogar? 0 = nao / 1 = sim \n")

            if int(opcao) == 0:

                print("\nResultado Final:\n")
                print ("Jogador ", nomeJogador)
                r.resultado()
                print("Encerrando o programa...")

                break
            
