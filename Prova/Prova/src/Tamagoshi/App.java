package Tamagoshi;

import Tamagoshi.Bichinho.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do bichinho: ");
        String nome = entrada.nextLine();

        penguim tamagoshi = new penguim(nome);

        tamagoshi.starve();
        tamagoshi.alimentar();
        tamagoshi.verificarSaúde();



    }
}
