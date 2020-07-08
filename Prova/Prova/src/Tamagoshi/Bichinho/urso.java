package Tamagoshi.Bichinho;

public class urso extends bichinho {

    private int mel = 3;

    public urso(String nome) {
        super(nome);
    }

    public void alimentar() {
        super.setFome(super.getFome() - mel);
    }

}
