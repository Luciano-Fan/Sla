package jokenpo;

import java.util.ArrayList;
import java.util.List;

public class Placar {
    ArrayList<Jogador> lista;

    public Placar() {
        this.lista = new ArrayList<Jogador>();
    }

    public int tamanho() {
        int tamanho = this.lista.size();
        return tamanho;
    }

    public void adiciona(Jogador player) {
        this.lista.add(player);
    }

    public void imprimir() {
        System.out.println("");
        System.out.println("> ");
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println("> " + (i + 1) + ". " + this.lista.get(i).getNome() + " V: " + this.lista.get(i).getVitorias());
        }
        System.out.println("> ");
        System.out.println("");
    }
}
