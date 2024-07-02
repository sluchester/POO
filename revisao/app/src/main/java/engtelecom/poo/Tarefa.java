package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefa {
    private String nome;
    private LocalDate dataDeCriacao;
    private LocalDate dataDeConclusao;
    private ArrayList<Pessoa>responsaveis;
    private Grupo grupo;

    public Tarefa(String nome, LocalDate dataDeCriacao) {
        this.nome = nome;
        this.dataDeCriacao = dataDeCriacao;
        this.responsaveis = new ArrayList<>();
    }

    //TODO como eu faria uma sobrecarga de construtor aqui para aceitar mais parametros

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", dataDeCriacao=" + dataDeCriacao +
                ", dataDeConclusao=" + dataDeConclusao +
                ", responsaveis=" + responsaveis +
                ", grupo=" + grupo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDate dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public ArrayList<Pessoa> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(ArrayList<Pessoa> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
