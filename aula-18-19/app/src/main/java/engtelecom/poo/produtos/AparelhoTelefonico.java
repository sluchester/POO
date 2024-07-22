package engtelecom.poo.produtos;

public class AparelhoTelefonico {

    protected String codigo;
    private int nSerial;
    private String modelo;
    private String cor;
    private double peso;
    private Tamanho dimensoes;

    /*public AparelhoTelefonico(String cd, int ns, String mo, String cr, double ps, Tamanho di) {
        this.codigo = cd;
        this.nSerial = ns;
        this.modelo = mo;
        this.cor = cr;
        this.peso = ps;
        this.dimensoes = di;
    }*/

    @Override
    public String toString() {
        return "AparelhoTelefonico [codigo = " + codigo + ", nSerial = " + nSerial + ", modelo = " + modelo + ", cor = " + cor
                + ", peso = " + peso + "kg , dimensoes = " + dimensoes + "]";
    }

    
}