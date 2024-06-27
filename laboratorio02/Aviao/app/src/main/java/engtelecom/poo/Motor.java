package engtelecom.poo;

public class Motor {
    private int helice;
    private int turbina;
    private int potencia;

    //TODO - aqui tem turbina e helice junto
    public Motor(int helice, int turbina, int potencia) {
        this.helice = helice;
        this.turbina = turbina;
        this.potencia = potencia;
    }

    //TODO - aqui, só a turbina e a potencia existem. Mas o aviao possui ou turbina ou helice
    public Motor(int turbina, int potencia){
        this(0,turbina,potencia);
    }

    public boolean aumentarPotencia(){
        return true;
    }

    public boolean diminuirPotencia(){
        return true;
    }

    public int getHelice() {
        return helice;
    }

    public void setHelice(int helice) {
        this.helice = helice;
    }

    public int getTurbina() {
        return turbina;
    }

    public void setTurbina(int turbina) {
        this.turbina = turbina;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
