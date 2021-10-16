package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("Alexandre");
        conjunto.add("Maria");
        conjunto.add("Palmeiras");
        conjunto.add("Seahawks");

        System.out.println(conjunto);

        Set<Integer> numeros = new TreeSet<>();

        numeros.add(33);
        numeros.add(44);
        numeros.add(77);
        numeros.add(4);
        numeros.add(11);
        numeros.add(55);
        numeros.add(16);
        numeros.add(3);
        numeros.add(10);
        numeros.add(14);

        System.err.println(numeros);

    }
}
