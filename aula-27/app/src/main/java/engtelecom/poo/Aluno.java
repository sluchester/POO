package engtelecom.poo;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//gera getter, setter, toString etc
@Data
public class Aluno {
    //NonNull informa os atributos com o qual ele vai construir
    @NonNull
    private String nome;
    @NonNull
    private String matricula;
}
