/**
 * usuário irá digitar um conjunto de numeros
 * Após digitar o 999, o programa deverá imprimir os números em ordem inversa
 * NÃO PODE USAR ARRAYLIST
 */

package engtelecom.poo;

import java.util.*;

public class App3 {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        ArrayDeque<Integer> deque= new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        int readNumber = 0;

        while(readNumber != 999){
            System.out.println("digite um numero ");
            readNumber = scanner.nextInt();

            if(readNumber == 999){
                break;
            }else{
                deque.add(readNumber);
            }
        }

        while (!deque.isEmpty()){
            System.out.println(deque.removeLast());
        }
        /*for (int i = queue.size(); i > 0; i--) {
            queue.re
        }*/
    }
}
