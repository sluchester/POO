package engtelecom.poo;

public class Motor {
    private int hp;
    private int cilindros;
    private double vMax;

    public Motor(int hp, int cilindros, double vMax) {
        this.hp = hp;
        this.cilindros = cilindros;
        this.vMax = vMax;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hp=" + hp +
                ", cilindros=" + cilindros +
                ", vMax=" + vMax +
                '}';
    }
}
