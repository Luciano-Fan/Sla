/**
 * @author Danilo Prado Amador de Assis 20986598
 * @author Luciano Fan 20951129
 */
package jokenpo;

import static java.lang.Math.random;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolhaMenu;
        boolean flagJogo = true, flagPartida = true;
        String nomeJogador;
        Placar placar = new Placar();

        while (flagJogo) {
            System.out.println("-------------------");
            System.out.println("-     JOKENPÔ     -");
            System.out.println("-------------------");
            System.out.println("- 1. INICIAR JOGO -");
            System.out.println("- 2. VER PLACAR   -");
            System.out.println("- 3. SAIR         -");
            System.out.println("-------------------");
            System.out.print("> ");
            escolhaMenu = entrada.nextInt();
            switch (escolhaMenu) {
                case 1:
                    Scanner entradaJogador = new Scanner(System.in);
                    System.out.println("Digite o nome de jogador:");
                    nomeJogador = entradaJogador.nextLine();
                    Jogador player = new Jogador(nomeJogador);
                    Jogador cpu = new Jogador("Computador");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    do {
                        flagPartida = jogo(player, cpu);
                    } while (flagPartida);

                    placar.adiciona(player);
                    break;
                case 2:
                    if (placar.tamanho() > 0) {
                        placar.imprimir();
                    } else {
                        System.out.println("Placar vazio!");
                        System.out.println(">");
                    }
                    break;
                case 3:
                    flagJogo = false;
                    break;
                default:
                    System.out.println("Escolha no menu oque deseja!");
                    System.out.println(">");
                    break;
            }
        };
    }

    public static boolean jogo(Jogador player, Jogador cpu) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int escolhaPlayer, escolhaCpu;
        Random random = new Random();

        System.out.println("> JOKENPÔ!!! ");
        System.out.println("> ");
        System.out.println("> " + player.getNome() + " = " + player.getVitorias());
        System.out.println("> " + cpu.getNome() + " = " + cpu.getVitorias());
        System.out.println("> ");
        System.out.println("> 1. Pedra ");
        System.out.println("> 2. Papel ");
        System.out.println("> 3. Tesoura ");
        System.out.println("> 4. Sair da partida");
        System.out.println("> ");
        System.out.print("> ");
        escolhaPlayer = entrada.nextInt() - 1;
        escolhaCpu = random.nextInt(3);

        if (escolhaPlayer == 0) {
            if (escolhaCpu == 0) {
                System.out.println("> " + player.getNome() + ": Pedra");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Pedra");
                System.out.println("> ");
                System.out.println("> EMPATE!");
            } else if (escolhaCpu == 1) {
                System.out.println("> " + player.getNome() + ": Pedra");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Papel");
                System.out.println("> ");
                System.out.println("> Computador Ganhou!");
                cpu.pontuarVitoria();
            } else {
                System.out.println("> " + player.getNome() + ": Pedra");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Tesoura");
                System.out.println("> ");
                System.out.println("> Jogador Ganhou!");
                player.pontuarVitoria();
            }
        } else if (escolhaPlayer == 1) {
            if (escolhaCpu == 0) {
                System.out.println("> " + player.getNome() + ": Papel");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Pedra");
                System.out.println("> ");
                System.out.println("> Jogador Ganhou!");
                player.pontuarVitoria();
            } else if (escolhaCpu == 1) {
                System.out.println("> " + player.getNome() + ": Papel");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Papel");
                System.out.println("> ");
                System.out.println("> EMPATE!");
            } else {
                System.out.println("> " + player.getNome() + ": Papel");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Tesoura");
                System.out.println("> ");
                System.out.println("> Computador Ganhou!");
                cpu.pontuarVitoria();
            }
        } else if (escolhaPlayer == 2) {
            if (escolhaCpu == 0) {
                System.out.println("> " + player.getNome() + ": Tesoura");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Pedra");
                System.out.println("> ");
                System.out.println("> Computador Ganhou!");
                cpu.pontuarVitoria();
            } else if (escolhaCpu == 1) {
                System.out.println("> " + player.getNome() + ": Tesoura");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Papel");
                System.out.println("> ");
                System.out.println("> Jogador Ganhou!");
                player.pontuarVitoria();
            } else {
                System.out.println("> " + player.getNome() + ": Tesoura");
                System.out.println(">   x");
                System.out.println("> " + cpu.getNome() + ": Tesoura");
                System.out.println("> ");
                System.out.println("> EMPATE!");
            }
        } else if (escolhaPlayer == 3) {
            flag = false;
            System.out.println("> ");
            System.out.println("> PLACAR ");
            System.out.println("> " + player.getNome() + ": " + player.getVitorias());
            System.out.println(">   x");
            System.out.println("> " + cpu.getNome() + ": " + cpu.getVitorias());
            System.out.println("");
        } else {
            flag = true;
            System.out.println("Escolha uma opção valida!");
        }
        System.out.println("");

        return flag;
    }
}
