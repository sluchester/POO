package engtelecom.poo;

public class Carro {
    private String modelo;
    private String marca;
    private Motor motor;
    //carro contem motor


    public Carro(String modelo, String marca, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", motor=" + motor +
                '}';
    }
}
