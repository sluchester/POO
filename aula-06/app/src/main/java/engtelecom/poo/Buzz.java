package engtelecom.poo;

import java.util.Random;

public class Buzz {
    private String frases[]=  {"Ao infinito e além", "Explorando", "inimigo a vista", "Isto não é voar. Isto é cair, com estilo!",
            "Vamo voar para bem longe daqui"};
    private boolean capaceteAberto;
    private boolean disparaRaio;
    private boolean golpes;
    private boolean asaAberta;

    public void abrirFecharCapacete(){
        capaceteAberto = !capaceteAberto;
    }

    public String falar(){
        Random val = new Random();
        int i = val.nextInt(5);
        return frases[i];
    }

    public void dispararLaser(){
        disparaRaio = !disparaRaio;
    }

    public void articularGolpe(){
        golpes = !golpes;
    }

    public void abrirAsas(){
        asaAberta = !asaAberta;
    }
}
