package engtelecom.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletador{
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }

    @Override
    public void atacar() {

    }

    @Override
    public String mover() {
        return "";
    }
}