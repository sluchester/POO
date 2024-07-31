package engtelecom;

public enum Planeta {

    MERC(1, "Mercurio"),
    VEN(2, "Venus"),
    TER(3,"Terra"),
    MAR(4, "Marte"),
    JUP(5, "Jupiter"),
    SAT(6, "Saturno"),
    URA(7, "Urano"),
    NET(8, "Netuno"),
    PLU(9, "Plutao");

    private int codigo;
    private String nome;

    Planeta(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}