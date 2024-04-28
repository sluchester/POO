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

    //o que update faria? recebe o valor novo ou o velho?
    // Ela retorna os valores para o suário ver ou só modifica?
    //e se eu der ou tiver que fazer um telefone.set?
    // tem que fazer isso aqui ou muda somente a posição na lista
    public boolean updateTelefone(String rotulo, String numero){
        if(dadosDeTelefone.contains(new Telefone(rotulo, numero))){
            addEmail(rotulo,numero);
            return true;
        } else{
            return false;
        }
    }

    public boolean updateEmail(String rotulo, String numero){
        if (dadosDeEmail.contains(new Email(rotulo,numero))){
            addEmail(rotulo, numero);
            return true;
        } else {
            return false;
        }
    }

    //pq ele remove só orotulo
    // ao elimiar o rotulo, o email ainda fica
    public boolean removeTelefone(String rotulo){

    }

    public boolean removeEmail(){
        return true;
    }
}
