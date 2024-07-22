package engtelecom.poo;

public class Aldeao extends Personagem{
    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "aldeão se movendo";
    }

    public String atacar() {
        return "aldeão atacando";
    }
}
