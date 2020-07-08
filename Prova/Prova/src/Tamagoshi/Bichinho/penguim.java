package Tamagoshi.Bichinho;

public class penguim extends bichinho {

    private int peixe = 5;

    public penguim(String nome) {
        super(nome);
    }
    public void alimentar() {
        super.setFome(super.getFome() - peixe);
    }

}
