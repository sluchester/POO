package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Roteador extends Dispositivo{
    private ArrayList<String> listaDeEnderecosIp = new ArrayList<>();
    private HashMap<Integer, String> tabelaRedes;

    public Roteador(String enderecoMac, String enderecoIp) {
        super(enderecoMac, enderecoIp);
        tabelaRedes=new HashMap<>();
    }

    //adiciona o endereço ip à lista de endereços IP interna do roteador
    public void addEnderecoIp(String enderecoIp) {
        listaDeEnderecosIp.add(enderecoIp);
        constroiTabela();
    }

    //gera um número entre 100 e 999 para integrar ao endereço IP de cada porta
    private String geradorDeEnderecoIp() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(900) + 100;
        return String.valueOf(numeroAleatorio);
    }

    //itera a lista, contendo todos os endereços IP da rede, e insere eles em uma tabela hash
        //em que as chaves são as portas de destino e os valores são os novos IP gerados para cada porta
    private void constroiTabela(){
        for(String rede : listaDeEnderecosIp){
            //chave vai ser o número de porta
            //valor vai ser o primeiro número do IP + uma sentença de números
            int chave = Character.getNumericValue(rede.charAt(0));
            String valor = chave + geradorDeEnderecoIp();
            tabelaRedes.put(chave, valor);
        }
    }

    //verifica se a o pacote IP tem destino para uma rede conhecida no roteador
    public boolean verificaSeRedeConsta(PacoteIP pacoteIP){
        Set<Integer> chaves = tabelaRedes.keySet();
        for(Integer chave : chaves){
            if (tabelaRedes.get(chave).charAt(0) == pacoteIP.getEnderecoIpDestino().charAt(0)){
                return true;
            } else{ return false;}
        }
        return false;
    }

    //verifica se o destino do pacote é a internet analisando seu endereço IP de destino
    public boolean verificaDestinoInternet(PacoteIP pacoteIP){
        if(pacoteIP.getEnderecoIpDestino().charAt(0) == '3'){
            return true;
        } else{
            return false;
        }
    }

    //verifica se o pacoteIP tem um endereço de rede de destino que contém na tabela do roteador
        //retorna uma string contendo o destino do pacote IP fornecido
    @Override
    public String processarPacote(PacoteIP pacoteIP) {
        Set<Integer> chaves = tabelaRedes.keySet();
        for (Integer redeDestino : chaves) {
            if((tabelaRedes.get(redeDestino).charAt(0) == pacoteIP.getEnderecoIpDestino().charAt(0))) {
                if(verificaDestinoInternet(pacoteIP)){
                    return encaminharPacoteParaInternet(pacoteIP);
                } else{
                    return encaminharPacote(redeDestino, pacoteIP);
                }
            }
        }
        return encaminharPacoteParaRedePadrao(pacoteIP);
    }

    //string que representa que o pacoteIP está indo para uma rede conhecida do roteador
    @Override
    public String encaminharPacote(int redeDestino, PacoteIP pacoteIP) {
        return "Encaminhando pacote para a Rede " + redeDestino + " \n";
    }

    //string que representa que o pacoteIP está indo para a internet
    public String encaminharPacoteParaInternet(PacoteIP pacoteIP){
        return "Encaminhando pacote para a Internet \n";
    }

    //string que representa que o roteador não encontrou a rede de destino em sua tabela
        //e está encaminhando para a rede padrão
    public String encaminharPacoteParaRedePadrao(PacoteIP pacoteIP){
        return "Rede desconhecida. Encaminhando pacote para a rota padrão (Internet) \n";
    }

    public ArrayList<String> getListaDeEnderecosIp() {
        return listaDeEnderecosIp;
    }

    public void setListaDeEnderecosIp(ArrayList<String> listaDeEnderecosIp) {
        this.listaDeEnderecosIp = listaDeEnderecosIp;
    }

    public HashMap<Integer, String> getTabelaRedes() {
        return tabelaRedes;
    }

    public void setTabelaRedes(HashMap<Integer, String> tabelaRedes) {
        this.tabelaRedes = tabelaRedes;
    }
}
