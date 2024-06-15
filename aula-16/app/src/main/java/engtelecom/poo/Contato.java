package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataDeNascimento;
    private ArrayList<Telefone> dadosDeTelefone;
    private ArrayList<Email> dadosDeEmail;

    public Contato(String nome, String sobreNome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
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
        if(dadosDeTelefone.add(new Telefone(rotulo, numero))){
            return true;
        } else {
            return false;
        }
    }

    public boolean addEmail(String rotulo, String email){
        if(dadosDeEmail.add(new Email(rotulo, email))){
            return true;
        } else{
            return false;
        }
    }

    public boolean updateTelefone(String rotulo, String numero){
        for (Telefone telefone : dadosDeTelefone) {
            if(telefone.getRotulo().contains(rotulo)){
                telefone.setNumero(numero);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String rotulo, String email){
        for (Email emails : dadosDeEmail) {
            if(emails.getRotulo().contains(rotulo)){
                emails.setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean removeTelefone(String rotulo){
        for (Telefone telefone : dadosDeTelefone) {
            if(telefone.getRotulo().contains(rotulo)){
                dadosDeTelefone.remove(telefone);
                return true;
            }
        }
        return false;
    }

    public boolean removeEmail(String rotulo){
        for(Email emails : dadosDeEmail){
            if(emails.getRotulo().contains(rotulo)){
                dadosDeEmail.remove(emails);
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}