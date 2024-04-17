package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobreNome;
    private LocalDate dataDeNascimento;
    //tentar usar a classe telefone para retornar rotulo e valor
    private HashMap<Telefone,Telefone> dadosDeTelefone;
    //tentar usar a classe email para retornar rotulo e valor
    private HashMap<Email,Email> dadosDeEmail;

    public Contato(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public boolean addTelefone(){
        return true;
    }

    public boolean addTelefone(){
        return true;
    }

    public boolean addEmail(){
        return true;
    }
}
