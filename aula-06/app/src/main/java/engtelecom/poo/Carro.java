package engtelecom.poo;

public class Carro {
    //atributos - guardamos características da classe carro
    private double velocidade;
    private String modelo;

    //métodos
    public void acelerar(double v){
        velocidade+=v;
    }

    public void frear(double v) {
        velocidade-=v;
    }

    public double obterVelocidade(){
        return velocidade;
    }
}
