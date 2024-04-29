package engtelecom.poo;

import java.util.ArrayList;

public class AgendaTelefonica {
    private ArrayList<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato contato) {
        contatos.add(contato);
        return true;
    }

    public boolean removeContato(String nome, String sobrenome) {
        for (Contato c : contatos) {
            if(c.getNome().contains(nome) && c.getSobreNome().contains(sobrenome)) {
                contatos.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String nome, Contato contato) {

        return true;
    }

    public boolean addEmail(String rotulo, String email, Contato contato) {
        return true;
    }

    public boolean updateTelefone(String rotulo, String nome, Contato contato) {
        return true;
    }

    public boolean updateEmail(String rotulo, String email, Contato contato){
        return true;
    }

    public boolean removeTelefone(String rotulo, Contato contato){
        return true;
    }

    public boolean removeEmail(String rotulo, Contato contato){
        return true;
    }

}
