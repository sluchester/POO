package engtelecom.poo;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private Motor motor;
    //carro contem motor


    public Carro(String modelo, String marca, String cor, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
