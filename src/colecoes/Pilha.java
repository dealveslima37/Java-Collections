package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Conan o Barboro livro 1");
        livros.push("Conan o Barbaro Livro 2");
        livros.push("Conan o Barboro livro 3");
        livros.push("Lovecraft Coutry");
        livros.push("Salomon Kane");

        livros.forEach(System.out::println);

    }
}
