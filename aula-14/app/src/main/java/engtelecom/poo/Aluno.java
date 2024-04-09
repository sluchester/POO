package engtelecom.poo;

import java.time.LocalDate;
import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private LocalDate dataDeNascimento;

    public Aluno(String nome, String matricula, String cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
