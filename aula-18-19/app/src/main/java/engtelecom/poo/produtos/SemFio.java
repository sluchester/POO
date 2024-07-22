package engtelecom.poo.produtos;

public class SemFio extends AparelhoTelefonico {
    
    private double frequencia;
    private int canais;
    private double distancia;

    /*public SemFio(String cd, int ns, String mo, String cr, double ps, Tamanho di, double frequencia, int canais,
            double distancia) {
        super(cd, ns, mo, cr, ps, di);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }*/

    public SemFio() {

    }

    @Override
    public String toString() {
        return "SemFio [frequencia=" + frequencia + ", canais=" + canais + ", distancia=" + distancia + ", toString()="
                + super.toString() + "]";
    }

    
    public String imprimirDados() {
        return super.toString() + " Freq = " + this.frequencia + " canais = " + this.canais + " dist = " + this.distancia;
    }

    
    

}
