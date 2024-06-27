package engtelecom.poo;

public class Aviao {
    private Motor motor;
    private double peso;
    private int numMaxTripulantes;
    private int numMaxPassageiros;
    private double velocidade;
    private boolean botao = false;

    public Aviao(Motor motor, double peso, int numMaxTripulantes, int numMaxPassageiros) {
        this.motor = motor;
        this.peso = peso;
        this.numMaxTripulantes = numMaxTripulantes;
        this.numMaxPassageiros = numMaxPassageiros;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "motor=" + motor +
                ", peso=" + peso +
                ", numMaxTripulantes=" + numMaxTripulantes +
                ", numMaxPassageiros=" + numMaxPassageiros +
                '}';
    }

    //empurrar manche - nome do método na classe app
    public boolean aumentarVelocidade(){
        return true;
    }

    //puxar manche - nome do método na classe app
    public boolean diminuirVelocidade(){
        return true;
    }

    public boolean botaoPotencia(){
        botao = !botao;

        if(botao == true){

        }
        return true;
    }

    //a direção seria do tipo coordenada?
    public boolean virarEsquerda(String direcao, int velocidade){
        return true;
    }

    public boolean virarDireita(String direcao, int velocidade){
        return true;
    }

    public boolean subir(String direcao, int velocidade){
        return true;
    }

    public boolean descer(String direcao, int velocidade){
        return true;
    }

}