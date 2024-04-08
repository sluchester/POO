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
        int numero = 0;

        while(numero != 999){
            numero = scanner.nextInt();
            if(numero == 999){
                break;
            } else{
                total.add(numero);
            }
        }

        System.out.println("numeros lidos");
        total.forEach(System.out::println);
    }
}