package engtelecom;

public enum DiaDaSemana {
    DOM(0, "domingo"),
    SEG(1, "segunda-feira"),
    TER(2, "terca-feira"),
    QUA(3, "quarta-feira"),
    QUI(4, " quinta-feira"),
    SEX(5, " sexta-feira"),
    SAB(6, "sabado");

    private int codigo;
    private String nome;

    DiaDaSemana(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "DiaDaSemana{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
