package engtelecom.poo;

public class Arqueiro extends Personagem{
    public Arqueiro() {
        super(35,2 ,2 );
    }

    @Override
    public String mover() {
        return "arqueiro se movendo";
    }

    public String atacar() {
        return "arqueiro atacando";
    }
}
