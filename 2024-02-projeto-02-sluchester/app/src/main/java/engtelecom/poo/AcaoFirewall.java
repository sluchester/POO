package engtelecom.poo;

//enum possui duas ações específicas na hora de criar uma regra
 // o inteiro representa a ação que será tomada: se 1 encaminha, caso 0 descarta
 // o inteiro é usado no programa para tornar o uso do enum mais fácil
public enum AcaoFirewall {
    ENCAMINHAR(1),
    DESCARTAR(0);

    private final int codigo;

    AcaoFirewall(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static AcaoFirewall getAcaoFirewall(int codigo) {
        for(AcaoFirewall acaoFirewall : AcaoFirewall.values()){
            if(acaoFirewall.getCodigo() == codigo){
                return acaoFirewall;
            }
        }
        throw new IllegalArgumentException("Codigo invalido");
    }
}
