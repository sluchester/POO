package engtelecom.poo;

public class RegraFirewall {
    //esses são os atributos de uma regra. O que caracteriza e torna uma regra regra
    private String enderecoIpOrigem;
    private int portaOrigem;
    private String enderecoIpDestino;
    private int portaDestino;
    private AcaoFirewall acaoFirewall;

    //construtor contendo os atributos
    public RegraFirewall(String enderecoIpOrigem, int portaOrigem, String enderecoIpDestino, int portaDestino,
                         int acaoFirewall) {
        this.enderecoIpOrigem = enderecoIpOrigem;
        this.portaOrigem = portaOrigem;
        this.enderecoIpDestino = enderecoIpDestino;
        this.portaDestino = portaDestino;
        this.acaoFirewall = AcaoFirewall.getAcaoFirewall(acaoFirewall);
    }

    //método toString usado para retornar o conjunto completo do que representa uma regra
    @Override
    public String toString() {
        return "{Endereco IP de Origem= " + enderecoIpOrigem + ",\n Porta de Origem= " + portaOrigem +
                ",\n Endereco IP de Destino= " + enderecoIpDestino + ",\n Porta de Destino= " + portaDestino +
                ",\n Ação do Firewall= " + acaoFirewall + '}';
    }

    //verifica se o pacote IP corresponde às regras do firewall
    public boolean validaRegra(PacoteIP pacoteIP){
        return pacoteIP.getEnderecoIpOrigem().equals(enderecoIpOrigem) && pacoteIP.getPortaOrigem() == portaOrigem &&
                pacoteIP.getEnderecoIpDestino().equals(enderecoIpDestino) && pacoteIP.getPortaDestino() == portaDestino;
    }

    public AcaoFirewall getAcaoFirewall() {
        return acaoFirewall;
    }

    public String getEnderecoIpOrigem() {
        return enderecoIpOrigem;
    }

    public void setEnderecoIpOrigem(String enderecoIpOrigem) {
        this.enderecoIpOrigem = enderecoIpOrigem;
    }

    public int getPortaOrigem() {
        return portaOrigem;
    }

    public void setPortaOrigem(int portaOrigem) {
        this.portaOrigem = portaOrigem;
    }

    public String getEnderecoIpDestino() {
        return enderecoIpDestino;
    }

    public void setEnderecoIpDestino(String enderecoIpDestino) {
        this.enderecoIpDestino = enderecoIpDestino;
    }

    public int getPortaDestino() {
        return portaDestino;
    }

    public void setPortaDestino(int portaDestino) {
        this.portaDestino = portaDestino;
    }

    public void setAcaoFirewall(AcaoFirewall acaoFirewall) {
        this.acaoFirewall = acaoFirewall;
    }
}
