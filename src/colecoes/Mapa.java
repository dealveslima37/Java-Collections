package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Alexandre");
        usuarios.put(2, "Maria");
        usuarios.put(3, "Alice");
        usuarios.put(4, "Karla");
        usuarios.put(5, "Kendra");
        usuarios.put(6, "Kaja");
        usuarios.put(7, "Kakaroto");

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println();

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print("Id: " + registro.getKey() + " Nome: ");
            System.out.println(registro.getValue());
        }

        usuarios.remove(7);

        System.out.println();

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.print("Id: " + registro.getKey() + " Nome: ");
            System.out.println(registro.getValue());
        }

    }

}
