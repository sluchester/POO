package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;

public class CamadaDeRede {
    private ArrayList<Dispositivo> rede1;
    private ArrayList<Dispositivo> rede2;
    private ArrayList<Dispositivo> bordaDaRede;
    private ArrayList<Dispositivo> listaDispositivos;
    private PacoteIP pacoteip;

    private final char CHAR_UM = '1';
    private final char CHAR_DOIS = '2';
    private final char CHAR_TRES = '3';

    public CamadaDeRede() {
        //predefine as redes principais em duas, conforme a figura fornecida pelo professor
        rede1 = new ArrayList<>();
        rede2 = new ArrayList<>();

        //criação de todos os dispositivos de rede
        Endpoint endpoint1 = new Endpoint("E1", "1401");
        Endpoint endpoint2 = new Endpoint("E2", "1402");
        Endpoint endpoint3 = new Endpoint("E3", "1403");
        Endpoint endpoint4 = new Endpoint("E4", "1404");
        Endpoint endpoint21 = new Endpoint("E5", "2401");
        Endpoint endpoint22 = new Endpoint("E6", "2402");
        Endpoint endpoint23 = new Endpoint("E7", "2403");
        Endpoint endpoint24 = new Endpoint("E8", "2404");
        Roteador roteador = new Roteador("A1", "3000");
        Firewall firewall = new Firewall("F1", "3501");
        Comutador comutador1 = new Comutador("C1", "1201");
        Comutador comutador2 = new Comutador("C2", "2202");

        //adicionando todos os dispositivos pertencentes à rede 1
        rede1.add(endpoint1);
        rede1.add(endpoint2);
        rede1.add(endpoint3);
        rede1.add(endpoint4);
        //adicionando todos os dispositivos pertencentes à rede 2
        rede2.add(endpoint21);
        rede2.add(endpoint22);
        rede2.add(endpoint23);
        rede2.add(endpoint24);

        bordaDaRede = new ArrayList<>();
        bordaDaRede.add(roteador);
        bordaDaRede.add(firewall);

        //adiciona mac address dos dispositivos da rede 1 à lista do comutador
        for (Dispositivo dispositivo : rede1) {
            comutador1.addListaMac(dispositivo.getEnderecoMac());
        }

        //adiciona mac address dos dispositivos da rede 2 à lista do comutador
        for (Dispositivo dispositivo : rede2) {
            comutador2.addListaMac(dispositivo.getEnderecoMac());
        }

        //adicionando o endereço mac do roteador ao comutador1
        comutador1.addListaMac(roteador.getEnderecoMac());
        //adicionando o endereço mac do roteador ao comutador2
        comutador2.addListaMac(roteador.getEnderecoMac());

        //adicionando os endereços IP dos dispositivos conectados ao roteador
        roteador.addEnderecoIp(comutador1.getEnderecoIp());
        roteador.addEnderecoIp(comutador2.getEnderecoIp());
        roteador.addEnderecoIp(firewall.getEnderecoIp());

        //construindo uma lista com todos os dispositivos contidos na topologia
        listaDispositivos = new ArrayList<>();
        listaDispositivos.add(endpoint1);
        listaDispositivos.add(endpoint2);
        listaDispositivos.add(endpoint3);
        listaDispositivos.add(endpoint4);
        listaDispositivos.add(endpoint21);
        listaDispositivos.add(endpoint22);
        listaDispositivos.add(endpoint23);
        listaDispositivos.add(endpoint24);
        listaDispositivos.add(comutador1);
        listaDispositivos.add(comutador2);
        listaDispositivos.add(roteador);
        listaDispositivos.add(firewall);
    }

    //constroi o pacoteIP que será usado na simulação e coloca ele como atributo para uso
    public void montarPacoteip(String enderecoIpOrigem, int portaOrigem, String enderecoIpDestino,
                               int portaDestino, String enderecoMacDestino, String payload) {
        this.pacoteip = new PacoteIP(enderecoIpOrigem, portaOrigem, enderecoIpDestino, portaDestino, enderecoMacDestino, payload);
    }

    //constroi uma tabela hash por tipo de dispositivo
    //usando o polimorfismo, é possível separar cada um pelo seu tipo
    public HashMap listarDispositivosPorTipo() {
        HashMap<Integer, ArrayList<Dispositivo>> tabelaDispositivos = new HashMap<>();
        ArrayList<Dispositivo> comutadores = new ArrayList<>();
        ArrayList<Dispositivo> endpoints = new ArrayList<>();
        ArrayList<Dispositivo> firewalls = new ArrayList<>();
        ArrayList<Dispositivo> roteadores = new ArrayList<>();

        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Endpoint) {
                endpoints.add((Endpoint) dispositivo);
            } else if (dispositivo instanceof Comutador) {
                comutadores.add((Comutador) dispositivo);
            } else if (dispositivo instanceof Firewall) {
                firewalls.add((Firewall) dispositivo);
            } else if (dispositivo instanceof Roteador) {
                roteadores.add((Roteador) dispositivo);
            }
        }
        tabelaDispositivos.put(1, comutadores);
        tabelaDispositivos.put(2, endpoints);
        tabelaDispositivos.put(3, firewalls);
        tabelaDispositivos.put(4, roteadores);

        return tabelaDispositivos;
    }

    //como a rede já é pré-definida, é possível criar as redes estaticamente
    //a rede 3 é caracterizada pelos dispositvos que não compõem nenhuma das redes principais
    //estes são o roteador e firewall, que estão fora da rede 1 e 2
    public ArrayList listarDispositivosPorRede() {
        ArrayList<ArrayList<Dispositivo>> listaDeDispositivosPorRede = new ArrayList<>();
        ArrayList<Dispositivo> rede1 = new ArrayList<>();
        ArrayList<Dispositivo> rede2 = new ArrayList<>();
        ArrayList<Dispositivo> rede3 = new ArrayList<>();
        for (Dispositivo dispositivo : listaDispositivos) {
            switch (dispositivo.getEnderecoIp().charAt(0)) {
                case CHAR_UM: {
                    rede1.add(dispositivo);
                    break;
                }
                case CHAR_DOIS: {
                    rede2.add(dispositivo);
                    break;
                }
                case CHAR_TRES: {
                    rede3.add(dispositivo);
                    break;
                }
            }
        }
        listaDeDispositivosPorRede.add(rede1);
        listaDeDispositivosPorRede.add(rede2);
        listaDeDispositivosPorRede.add(rede3);
        return listaDeDispositivosPorRede;
    }

    //recebe a tabela de rotas de rede do roteador e retorna ela para o app
    public HashMap<Integer, String> listarRotasDoRoteador() {
        HashMap<Integer, String> tabelaRotaRedes = new HashMap<>();
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Roteador) {
                tabelaRotaRedes = ((Roteador) dispositivo).getTabelaRedes();
            }
        }
        return tabelaRotaRedes;
    }

    //procura o firewall na lista completa de dispositivos
    //recebe uma lista com todas as regras do firewall
    public ArrayList listarRegrasDeFiltragem() {
        ArrayList<RegraFirewall> listaAuxiliarDeRegras = new ArrayList<>();
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Firewall) {
                listaAuxiliarDeRegras = ((Firewall) dispositivo).listaDeRegrasFirewall();
            }
        }
        return listaAuxiliarDeRegras;
    }

    //procura o firewall na lista completa de dispositivos
    // recebe os parâmetros necessários para se criar uma regra e adiciona a lista de regras do firewall
    public boolean criarRegraDeFiltragem(String enderecoIpOrigem, int portaOrigem, String enderecoIpDestino,
                                         int portaDestino, int acaoFirewall) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Firewall) {
                if (((Firewall) dispositivo).criarRegra(enderecoIpOrigem, portaOrigem,
                        enderecoIpDestino, portaDestino, acaoFirewall)) {
                    return true;
                }
            }
        }
        return false;
    }

    //recebe um índice relativo a regra que o usuário deseja apagar
    public boolean apagarRegraDeFiltragem(int numRegraParaExcluir) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Firewall) {
                if (((Firewall) dispositivo).excluirRegra(numRegraParaExcluir)) {
                    return true;
                }
            }
        }
        return false;
    }

    //encontra qual comutador de escolha
    //como há dois comutadores na topologia, é necessário fazer essa diferenciação
    private Dispositivo encontrarNumeroComutador(char numRede) {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Comutador) {
                if (dispositivo.getEnderecoIp().charAt(0) == numRede) {
                    return dispositivo;
                }
            }
        }
        return null;
    }

    //encontra o firewall em meio a todos os dispositivos
    private Dispositivo encontrarFirewall() {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Firewall) {
                return dispositivo;
            }
        }
        return null;
    }

    //encontra o roteador em meio a todos os dispositivos
    private Dispositivo encontrarRoteador() {
        for (Dispositivo dispositivo : listaDispositivos) {
            if (dispositivo instanceof Roteador) {
                return dispositivo;
            }
        }
        return null;
    }

    //TODO
    public String simularProcessamentoDePacote() {
        String caminho = "";

        // Verifica se o pacote está na rede 1 ou rede 2 com base no IP de origem
        char redeOrigem = pacoteip.getEnderecoIpOrigem().charAt(0);

        if (redeOrigem == CHAR_UM) {
            Comutador comutador1 = (Comutador) encontrarNumeroComutador(CHAR_UM);
            caminho += comutador1.processarPacote(pacoteip);

            if (!comutador1.verificaSeConsta(pacoteip)) {
                Roteador roteador = (Roteador) encontrarRoteador();
                caminho += roteador.processarPacote(pacoteip);

                if (roteador.verificaDestinoInternet(pacoteip)) {
                    Firewall firewall = (Firewall) encontrarFirewall();
                    caminho += firewall.processarPacote(pacoteip);
                } else if (roteador.verificaSeRedeConsta(pacoteip)) {
                    Comutador comutador2 = (Comutador) encontrarNumeroComutador(CHAR_DOIS);
                    caminho += comutador2.processarPacote(pacoteip);
                }
            }
        } else if (redeOrigem == CHAR_DOIS) {
            Comutador comutador2 = (Comutador) encontrarNumeroComutador(CHAR_DOIS);
            caminho += comutador2.processarPacote(pacoteip);

            if (!comutador2.verificaSeConsta(pacoteip)) {
                Roteador roteador = (Roteador) encontrarRoteador();
                caminho += roteador.processarPacote(pacoteip);

                if (roteador.verificaDestinoInternet(pacoteip)) {
                    Firewall firewall = (Firewall) encontrarFirewall();
                    caminho += firewall.processarPacote(pacoteip);
                } else if (roteador.verificaSeRedeConsta(pacoteip)) {
                    Comutador comutador1 = (Comutador) encontrarNumeroComutador(CHAR_UM);
                    caminho += comutador1.processarPacote(pacoteip);
                }
            }
        } else {
            // Caso o endereço IP de origem não seja de nenhuma rede específica,
            // o pacote vai direto para o firewall
            Firewall firewall = (Firewall) encontrarFirewall();
            caminho += firewall.processarPacote(pacoteip);

            Roteador roteador = (Roteador) encontrarRoteador();
            caminho += roteador.processarPacote(pacoteip);

            // Decidir para qual comutador enviar com base na rede de destino
            if (pacoteip.getEnderecoIpDestino().charAt(0) == CHAR_UM) {
                Comutador comutador1 = (Comutador) encontrarNumeroComutador(CHAR_UM);
                caminho += comutador1.processarPacote(pacoteip);
            } else if (pacoteip.getEnderecoIpDestino().charAt(0) == CHAR_DOIS) {
                Comutador comutador2 = (Comutador) encontrarNumeroComutador(CHAR_DOIS);
                caminho += comutador2.processarPacote(pacoteip);
            }
        }
        return caminho;
    }
}
