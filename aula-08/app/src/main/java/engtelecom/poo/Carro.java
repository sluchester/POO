package engtelecom.poo;

public class Carro {
    private double velocidadeAtual;
    private final double VELOCIDADE_MAX;
    private final double VELOCIDADE_MIN = 0;

    public Carro(double vMax, int v){
        this.velocidadeAtual = 0;
        this.VELOCIDADE_MAX = vMax;
        if(v >=0 && v <= VELOCIDADE_MAX) this.velocidadeAtual = v;
    }

    public Carro(int v){
        this(200, v);
    }

    public double getVelocidade() {
        return velocidadeAtual;
    }

    public void setVelocidade(int velocidade) {
        this.velocidadeAtual = velocidade;
    }

    public void acelerar(int a){
        if(velocidadeAtual + a <= VELOCIDADE_MAX){
            velocidadeAtual += a;
        } else{
            velocidadeAtual = VELOCIDADE_MAX;
        }
    }

    public void frear(int f){
        if(velocidadeAtual - f >= VELOCIDADE_MIN){
            velocidadeAtual -= f;
        } else{
            velocidadeAtual = VELOCIDADE_MIN;
        }
    }
}
