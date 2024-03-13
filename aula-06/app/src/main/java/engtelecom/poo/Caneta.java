package engtelecom.poo;

public class Caneta {
    //atributos
    private String cor;     //0
    private int nivelTinta; //null
    private boolean aberta; //false

    //métodos
    public void desenhar(){
        if((aberta) && (nivelTinta > 0)){
            System.out.println("Desenhando na cor: " + cor);
            nivelTinta--;
        }
    }

    public void abrirFechar(){
        aberta = !aberta;
    }

    public void setCor(String c){
        cor = c;
    }

    public void setNivelTinta(int n){
        nivelTinta = n;
    }
}