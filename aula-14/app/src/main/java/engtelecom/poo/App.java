/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class App {

    private HashMap<String,Aluno> bancoDeDados;
    private static Scanner teclado = new Scanner(System.in);

    public App() {
        this.bancoDeDados = new HashMap<String,Aluno>();
    }

    private boolean validaMatricula(String matricula){
        if(bancoDeDados.containsKey(matricula)){return true;}
        else{return false;}
    }

    public boolean cadastrar(){
        /*LocalDate data = LocalDate.of(2000,10,20);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String d = "20/10/2024";
        data = LocalDate.parse(d,df);*/

        System.out.println("Digite o nome do aluno");
        //teclado.reset();
        String nome = teclado.nextLine();

        System.out.println("Digite o CPF");
        String cpf = teclado.nextLine();

        System.out.println("Digite a data de nascimento (dd/mm/yyyy)");
        String data = teclado.nextLine();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate formattedDate = LocalDate.parse(data,df);

        System.out.println("Digite a matrícula");
        String matricula = teclado.nextLine();

        Aluno aluno = new Aluno(nome, matricula, cpf, formattedDate);

        if(validaMatricula(matricula)){
            System.out.println("Usuário já existe. Experimente atualizar");
            return false;
        } else{
            bancoDeDados.put(matricula,aluno);
            return true;
        }
    }

    public int menu2(){
        System.out.println("1- Nome");
        System.out.println("2- Matricula");
        System.out.println("3- CPF");
        System.out.println("4- Data de Nascimento");

        return teclado.nextInt();
    }

    public void atualizar(String matricula){
        int opEscolhida = menu2();
        teclado.nextLine();

        if(validaMatricula(matricula)){
            Aluno aluno = bancoDeDados.get(matricula);
            switch (opEscolhida){
                case 1 ->{
                    System.out.println("Digite o novo nome");
                    aluno.setNome(teclado.nextLine());
                }
                case 2 -> {
                    System.out.println("Digite a nova matricula");
                    aluno.setMatricula(teclado.nextLine());
                }
                case 3 -> {
                    System.out.println("Digite o novo CPF");
                    aluno.setCpf(teclado.nextLine());
                }
                case 4 -> {
                    System.out.println("Digite a nova data de nascimento (dd/mm/yyyy)");
                    String data = teclado.nextLine();
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
                    LocalDate formattedDate = LocalDate.parse(data,df);
                    aluno.setDataDeNascimento(formattedDate);
                }
            }
        } else{
            System.out.println("matrícula não encontrada");
        }
    }

    public boolean remover(String matricula){
        if(validaMatricula(matricula)){
            bancoDeDados.remove(matricula);
            return true;
        } else{
            System.out.println("matricula não encontrada");
            return false;
        }
    }

    public void listarDadosUmAluno(String matricula){
        if(validaMatricula(matricula)){
            Aluno aluno = bancoDeDados.get(matricula);
            System.out.println(aluno);
            //TODO tem que listar todos os dados, aqui ele tá pegando os atributos
        } else {
            System.out.println("Matrícula não encontrada");
        }
    }

    public void listarDadosTodosAlunos(){
        bancoDeDados.forEach((matricula, aluno) -> {
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Data de nascimento: " + aluno.getDataDeNascimento());
            System.out.println();
        });
    }

    public int menu(){
        System.out.println("sigaa");
        System.out.println("1- Cadastrar");
        System.out.println("2- Atualizar");
        System.out.println("3- Remover");
        System.out.println("4- Listar dados de um aluno");
        System.out.println("5- Listar todos os alunos");
        System.out.println("6- Sair");

        return teclado.nextInt();
    }

    public static void main(String[] args) {
        App app = new App();
        int opcao;

        do {
            opcao = app.menu();
            teclado.nextLine();

            switch (opcao) {
                case 1 -> app.cadastrar();
                case 2 -> {
                    System.out.println("Forneça a matrícula do aluno");
                    app.atualizar(teclado.nextLine());
                }   
                case 3 -> {
                    System.out.println("Forneça a matrícula do aluno");
                    app.remover(teclado.nextLine());
                }
                case 4 -> {
                    System.out.println("Forneça a matrícula do aluno");
                    app.listarDadosUmAluno(teclado.nextLine());
                }
                case 5 -> app.listarDadosTodosAlunos();
            }
        } while (opcao != 6);

        System.out.println("finalizando");
    }
}
