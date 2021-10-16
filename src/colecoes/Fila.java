package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        fila.add("Ana"); // retorna null
        fila.offer("Maria"); // Lança uma exceção
        fila.add("Manu");
        fila.offer("Monica");
        fila.add("Angela");
        fila.offer("Amalia");

        System.out.println(fila.peek()); // retorna  o primeiro elemento da fila caso nçao exista ou retorna null
        System.out.println(fila.element()); // retorna o primeiro elemento da fila caso não exista lança uma exceção

        System.out.println(fila.poll()); // retorna o primeiro elemento da fila ja removendo ou retorna null
        System.out.println(fila.remove()); // retorna o primeiro elemento da fila ja removendo ou lança uma exceção

        fila.forEach(System.out::println);

    }

}
