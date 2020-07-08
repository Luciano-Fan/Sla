package Tamagoshi.Bichinho;

public class bichinho implements interfaceGeral{

    private String Nome;
    private int Idade = 0;
    private int Fome = 0;
    private int Saude = 100;

    public bichinho(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setSaude(int saude) {
        Saude = saude;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public int getFome() {
        return Fome;
    }

    public void setFome(int fome) {
        Fome = fome;
    }

    public int getSaúde() {
        return Saude;
    }

    @Override
    public void verificarSaúde() {
        getSaúde();
    }

    @Override
    public void alterarNome(String nome) {
       setNome(nome);
    }

    @Override
    public void retornarNome() {
        getNome();
    }

    @Override
    public void starve() {
        if (getFome() < 100) {
            setFome(getFome()+1);
        }
        else {
            dano();
        }
    }

    @Override
    public void dano() {

        if (getSaúde() < 0) {
            setSaude(getSaúde() - 1);
        }
        else {
            System.out.println("O " + getNome() + " está morto");
        }

    }

    @Override
    public void curar() {
        if (getSaúde() < 100) {
            setSaude(getSaúde() + 1);
        }
    }
}
