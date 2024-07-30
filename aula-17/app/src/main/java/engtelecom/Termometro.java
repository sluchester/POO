package engtelecom;

public class Termometro {
    private char escala;
    private double temperaturaAtual;
    private double temperaturaMaxima;
    private double temperaturaMinima;

    public Termometro(char escala, double temperaturaAtual, double temperaturaMaxima, double temperaturaMinima) {
        this.escala = escala;
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public String retornaTemperaturas(char escala){
        return "";
    }

    public String diferençaEntreEscalas(Termometro termometro, char escala){
        return "";
    }
}
