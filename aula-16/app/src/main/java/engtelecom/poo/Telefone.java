package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String rotulo;
    private String numero;

    public Telefone(String rotulo, String numero) {
        this.rotulo = rotulo;
        this.numero = formata("(##) #####−####", numero);
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "rotulo='" + rotulo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    private String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";

        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
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
        this.numero = formata("(##) #####−####", numero);
    }
}