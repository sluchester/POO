package engtelecom.poo;

import java.util.ArrayList;

public class Firewall extends Dispositivo{
    private ArrayList<RegraFirewall> listaDeRegras;
    private RegraFirewall regraFirewall;

    //para o programa rodar, é necessário se ter uma regra inicial e imutável
     //por isso, é definida estaticamente aqui no construtor
    public Firewall(String enderecoMac, String enderecoIp) {
        super(enderecoMac, enderecoIp);
        regraFirewall = new RegraFirewall("1401", 2, "2404", 2, 1);
        listaDeRegras = new ArrayList<>();
        listaDeRegras.add(regraFirewall);
    }

    //verifica, se na lista de regras do firewall, deve-se encaminhar ou descartar o pacote
    @Override
    public String processarPacote(PacoteIP pacoteIP) {
        for (RegraFirewall regra : listaDeRegras) {
            if (regra.validaRegra(pacoteIP)) {
                switch (regra.getAcaoFirewall()) {
                    case ENCAMINHAR:
                        return encaminharPacote(pacoteIP.getPortaDestino(), pacoteIP);
                    case DESCARTAR:
                        return descartarPacote(pacoteIP);
                }
            }
        }
        return "";
    }

    //se o pacote obedece uma regra do firewall, o encaminha
    @Override
    public String encaminharPacote(int portaDestino, PacoteIP pacoteIP) {
        return "Encaminhando pacote do Firewall\n";
    }

    //se o pacote obedece uma regra do firewall, o descarta
    public String descartarPacote(PacoteIP pacoteIP) {
        return "Descartando pacote do Firewall\n";
    }

    //cria uma regra para por na lista de regras do firewall
    public boolean criarRegra(String enderecoIpOrigem, int portaOrigem, String enderecoIpDestino,
                           int portaDestino, int acaoFirewall){
        if(!(enderecoIpOrigem.isEmpty() || enderecoIpDestino.isEmpty() || (acaoFirewall < 0 && acaoFirewall > 1))){
            RegraFirewall regra = new RegraFirewall(enderecoIpOrigem, portaOrigem, enderecoIpDestino,
                    portaDestino, acaoFirewall);
            listaDeRegras.add(regra);
            return true;
        }  else {return false;}
    }

    //só se pode excluir uma regra que tenha sido criada pelo usuário
     //a primeira regra interna, de indice 0, não pode ser excluída
    public boolean excluirRegra(int indiceRegra){
        if (indiceRegra > 0){
            listaDeRegras.remove(indiceRegra);
            return true;
        } else{
            return false;
        }
    }

    //retorna a lista de gras contida no firewall
    public ArrayList listaDeRegrasFirewall(){
        return listaDeRegras;
    }
}