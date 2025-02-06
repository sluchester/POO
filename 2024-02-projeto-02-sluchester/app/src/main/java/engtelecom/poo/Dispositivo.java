package engtelecom.poo;

//classe Dispositivo é abstrata e representa, por polimorfismo, todas as outras que herdam dela
public abstract class Dispositivo implements ProcessadorDePacotes{
    private String enderecoMac;
    private String enderecoIp;

    public Dispositivo(String enderecoMac, String enderecoIp) {
        this.enderecoMac = enderecoMac;
        this.enderecoIp = enderecoIp;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public void setEnderecoMac(String enderecoMac) {
        this.enderecoMac = enderecoMac;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }

    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }

    //método que processa pacote por implementação da interface ProcessadorDePacote que Dispositivo implementa
     //responsável por retornar a string com o caminho que o pacote está fazendo
    @Override
    public String processarPacote(PacoteIP pacoteIP) {
        ProcessadorDePacotes.super.processarPacote(pacoteIP);
        return "";
    }

    //método que encaminha pacote por implementação da interface ProcessadorDePacote que Dispositivo implementa
    //responsável por retornar uma string com informações mais detalhadas para o processamento
    @Override
    public String encaminharPacote(int portaDestino, PacoteIP pacoteIP) {
        ProcessadorDePacotes.super.encaminharPacote(portaDestino, pacoteIP);
        return "";
    }
}