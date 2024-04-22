package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataDeNascimento;
    //tentar usar a classe telefone para retornar rotulo e valor
    private ArrayList<Telefone> dadosDeTelefone;
    //tentar usar a classe email para retornar rotulo e valor
    private ArrayList<Email> dadosDeEmail;

    public Contato(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", dadosDeTelefone=" + dadosDeTelefone +
                ", dadosDeEmail=" + dadosDeEmail +
                '}';
    }

    public boolean addTelefone(String rotulo, String numero){
        dadosDeTelefone.add(new Telefone(rotulo, numero));
        return true;
    }

    public boolean addEmail(String rotulo, String email){
        /*if(validaEmail(email)){
            dadosDeEmail.add(new Email(rotulo, email));
            return true;
        } else{
            return false;
        }*/
        return true;
    }

    public boolean updateTelefone(Telefone telefone){return true;}

    public boolean updateEmail(Telefone telefone){return true;}

    public boolean removeTelefone(){
        return true;
    }

    public boolean removeEmail(){
        return true;
    }
}
