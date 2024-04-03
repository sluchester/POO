/**
 * le n numeros do teclado que o usuario ira digitar. todo numero que o usuario digitar tera que ser
 * guardado em uma colecao, exceto se for 999.
 * se digitar o numero 999, deve se imprimir na tela todos os numeros que ja foram digitados
 */

package engtelecom.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Integer> total= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(scanner.nextInt() != 999){
            total.add(scanner.nextInt());
        }
        total.forEach(System.out::println);
    }
}