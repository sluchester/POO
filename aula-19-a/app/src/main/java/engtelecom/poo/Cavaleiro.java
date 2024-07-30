package engtelecom.poo;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        super(30, 3, 3);
    }

    @Override
    public String mover() {
        return "cavaleiro se movendo";
    }

    public String atacar() {
        return "cavaleiro atacando";
    }
}
