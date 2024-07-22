package engtelecom.poo.produtos;

public class Tamanho {
    private double altura;
    private double largura;
    private double profudidade;
    
    public Tamanho(double altura, double largura, double profudidade) {
        this.altura = altura;
        this.largura = largura;
        this.profudidade = profudidade;
    }

    @Override
    public String toString() {
        return " dimensões [altura = " + altura + "m , largura = " + largura + "m , profudidade = " + profudidade + "m]";
    }

    
}
