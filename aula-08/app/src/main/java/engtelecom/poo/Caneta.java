package engtelecom.poo;

public class Caneta {
    private int nivelTinta;
    private String cor;
    private boolean aberta;

    //método construtor
    //só é chamado no instanciamento da classe
    public Caneta(int n, String c){
        this.nivelTinta = 100;
        this.setNivelTinta(n);
        cor = c;
        aberta = false;
    }

    public Caneta(String c){
        //chamando o construtor da classe
         //entende através dos parâmetros que estão sendo passados
        this(100,c);
//        cor = c;
//        nivelTinta = 100;
//        aberta = false;
    }

    public Caneta(){
        this("preta");
//        cor = "preta";
//        nivelTinta = 100;
//        aberta = false;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public void setCor(String c){
        cor = c;
    }

    public void setNivelTinta(int n){
        if(n>=0 && n<=100) {
            this.nivelTinta = n;
        }
    }
}
