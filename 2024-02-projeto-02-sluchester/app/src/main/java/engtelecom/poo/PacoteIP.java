package engtelecom.poo;

public class PacoteIP {
    private String enderecoIpOrigem;
    private int portaOrigem;
    private String enderecoIpDestino;
    private int portaDestino;
    private String enderecoMacDestino;
    private String payload;

    public PacoteIP(String enderecoIpOrigem, int portaOrigem, String enderecoIpDestino, int portaDestino,
                    String enderecoMacDestino, String payload) {
        this.enderecoIpOrigem = enderecoIpOrigem;
        this.portaOrigem = portaOrigem;
        this.enderecoIpDestino = enderecoIpDestino;
        this.portaDestino = portaDestino;
        this.enderecoMacDestino = enderecoMacDestino;
        this.payload = payload;
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

    public String getEnderecoMacDestino() {
        return enderecoMacDestino;
    }

    public void setEnderecoMacDestino(String enderecoMacDestino) {
        this.enderecoMacDestino = enderecoMacDestino;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
