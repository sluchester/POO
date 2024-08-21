package engtelecom.poo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(App2.class);

    public static void main(String[] args) {
        LOGGER.debug("Requisição recebidfa do IP: {}", "192.168.1.1");
        LOGGER.info("Usuário: {}", "juca");
        LOGGER.warn("Conexão perdida com o banco de dados. tentando novamente");
        LOGGER.error("Falha ao escrever {} no arquivo {}", 123, "matriculas.txt");

        Aluno aluno = new Aluno("kuca", "123786123571");
        System.out.println(aluno.toString());
    }
}
