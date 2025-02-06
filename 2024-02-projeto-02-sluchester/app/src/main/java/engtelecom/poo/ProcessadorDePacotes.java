package engtelecom.poo;

//interface que é implementada pela CamadaDeRede
public interface ProcessadorDePacotes {
    public default String processarPacote(PacoteIP pacoteIP){return ""; }

    public default String encaminharPacote(int portaDestino, PacoteIP pacoteIP){return ""; }
}
