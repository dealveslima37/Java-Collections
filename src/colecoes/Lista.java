package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Alexandre");
        usuarios.add(u1);

        usuarios.add(new Usuario("Maria"));
        usuarios.add(new Usuario("Carla"));
        usuarios.add(new Usuario("Zakk"));

        for (Usuario x : usuarios) {
            System.out.println(x);
        }

    }
}
