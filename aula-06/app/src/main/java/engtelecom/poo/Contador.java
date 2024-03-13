package engtelecom.poo;

public class Contador {
    //atributos
    private int valorAtual;

    //métodos
    public void setValue(int n){
        valorAtual= n;
    }

    public void incrementar(){
        valorAtual+=1;
    }

    public void decrementar(){
        valorAtual-=1;
    }

    public int getValorAtual() {
        return valorAtual;
    }
}
