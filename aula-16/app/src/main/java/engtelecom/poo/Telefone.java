package engtelecom.poo;

import java.util.HashMap;

public class Telefone {
    private String rotulo;
    private String numero;

    public Telefone(String rotulo, String numero) {
        this.rotulo = rotulo;
        this.numero = numero;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
