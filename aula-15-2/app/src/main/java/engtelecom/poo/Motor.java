package engtelecom.poo;

public class Motor {
    private int hp;
    private String marca;

    public Motor(int hp, String marca) {
        this.hp = hp;
        this.marca = marca;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
