package engtelecom.poo;

import java.util.ArrayList;

public class Livro {
    private String isbn;
    private String titutlo;
    private ArrayList<Autor> autores;

    public Livro(String isbn, String titutlo, ArrayList<Autor> autores) {
        this.isbn = isbn;
        this.titutlo = titutlo;
        this.autores = autores;
        this.autores.getFirst().setNome("João");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titutlo='" + titutlo + '\'' +
                ", autores=" + autores +
                '}';
    }


}
