package engtelecom.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class NewApp {
    private ArrayList<Livro> bancoDeDadosLivros;
    private ArrayList<Autor> bancoDeDadosAutores;

    public NewApp(){
        this.bancoDeDadosLivros = new ArrayList<>();
        this.bancoDeDadosAutores = new ArrayList<>();
    }

    public boolean addAutor(Autor autor) {
        return this.bancoDeDadosAutores.add(autor);
    }

    public boolean addLivro(String isbn, String titulo, Autor[] autores){
        ArrayList<Autor> aux = new ArrayList<>(Arrays.asList(autores));

        return this.bancoDeDadosLivros.add(new Livro(isbn, titulo, aux));
    }

    public static void main(String[] args) {
        NewApp app = new NewApp();

        Autor autor = new Autor("Jean Maaczinky","França", LocalDate.of(1975,10,3));
        app.addAutor(autor);

        app.addLivro("65435241354", "Livro b", new Autor[]{app.bancoDeDadosAutores.getFirst()});
    }
}
