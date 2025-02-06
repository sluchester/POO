package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Comutador extends Dispositivo{
    private HashMap<Integer, String> tabEnderecosMac;
    private ArrayList<String> listaDeEnderecosMac;
    private final int QUANTIDADE_MAXIMA_DE_PORTAS = 12;

    public Comutador(String enderecoMac, String enderecoIp) {
        super(enderecoMac, enderecoIp);
        tabEnderecosMac = new HashMap<>();
        listaDeEnderecosMac = new ArrayList<>();
    }

    //itera a lista, contendo todos os endereços MAC da rede, e insere eles em uma tabela hash
        // em que as chaves são as portas de destino
    private void constroiTabelaEnderecosMac(){
        for (int i = 0; i < listaDeEnderecosMac.size(); i++) {
            tabEnderecosMac.put(i, listaDeEnderecosMac.get(i));
        }
    }

    //adiciona os endereços MAC em uma lista
    public void addListaMac(String enderecoMac){
        listaDeEnderecosMac.add(enderecoMac);
        constroiTabelaEnderecosMac();
    }

    //método que valida se um endereço MAC está contido na tabela do comutador
    public boolean verificaSeConsta(PacoteIP pacoteIP){
        Set<Integer> chaves = tabEnderecosMac.keySet();
        for (Integer portaDeEncaminhamento : chaves) {
            if (tabEnderecosMac.get(portaDeEncaminhamento).equals(pacoteIP.getEnderecoMacDestino())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //retorna uma string com o que o comutador decidiu fazer com o pacote
    @Override
    public String processarPacote(PacoteIP pacoteIP) {
        Set<Integer> chaves = tabEnderecosMac.keySet();
        for (Integer portaDeEncaminhamento : chaves) {
            if(tabEnderecosMac.get(portaDeEncaminhamento).equals(pacoteIP.getEnderecoMacDestino())){
                return encaminharPacote(portaDeEncaminhamento, pacoteIP);
            } else{
                return encaminharPacoteParaTodos(pacoteIP);
            }
        }
        return "";
    }

    //retorna uma string compatível ao endereço MAC estar na tabela do comutador
    @Override
    public String encaminharPacote(int portaDeEncaminhamento, PacoteIP pacoteIP) {
        return "Encaminhando pacote para a porta " + portaDeEncaminhamento + " \n";
    }

    //encaminha pacote para todas as portas, pois o endereço MAC não foi encontrado
    public String encaminharPacoteParaTodos(PacoteIP pacoteIP){
        return "Encaminhando pacote para todas as portas \n";
    }

    public HashMap<Integer, String> getTabEnderecosMac() {
        return tabEnderecosMac;
    }
}